// https://www.codewars.com/kata/57ff9d3b8f7dda23130015fa/train/java

package kyu_1.mine_sweepe.java;

import java.util.List;
import java.util.ArrayList;

class MineSweeper {
    private List<List<Box>> boxes = new ArrayList<>();
    private List<List<Box>> testingBoxes = new ArrayList<>();
    private List<Box> unknownBoxes = new ArrayList<>();
    private List<Box> group = new ArrayList<>();
    private int missingMines = 0;
    private int totalMines;
    private boolean unsolvable = false;

    public MineSweeper(final String board, final int nMines) {

        totalMines = nMines;
        GenerateMatrix(board);

        do {
            LogicalSweeping();
            GetUnknowns();
            if (missingMines >= 10) {
                unsolvable = true;
            } else if (missingMines > 0) {
                testingBoxes.clear();
                List<Integer> no = new ArrayList<>();
                RecurringFunction(0, missingMines - 1, no);
                MakePossibleGroups();
                OpenNewBoxes();
            }
        }
        while (missingMines > 0 && !unsolvable);
    }

    public String solve() {

        if (unsolvable) return "?";

        String answer = "";
        for (int i = 0; i < boxes.size(); i++) {
            for (int j = 0; j < boxes.get(i).size(); j++) {
                if (boxes.get(i).get(j).status == 2)
                    answer += boxes.get(i).get(j).number + " ";
                else
                    answer += "x ";
            }
            answer = answer.substring(0, answer.length() - 1);
            answer += "\n";
        }
        return answer.substring(0, answer.length() - 1);
    }

    private void GenerateMatrix(final String board) {
        List<Box> _box = new ArrayList<>();
        int row = 0;
        int col = 0;
        for (int i = 0; i < board.length(); i++) {
            if (board.charAt(i) != ' ') {
                if (board.charAt(i) != '\n') {
                    Box b;
                    switch (board.charAt(i)) {
                        case '0':
                            b = new Box(row, col, 2, 0);
                            break;
                        default:
                            b = new Box(row, col, 1, -1);
                            break;
                    }
                    _box.add(b);
                    col++;
                } else {
                    boxes.add(_box);
                    _box = new ArrayList<>();
                    row++;
                    col = 0;
                }
            }
        }
        boxes.add(_box);
    }

    private void LogicalSweeping() {
        boolean iamdone = false;
        int preCount = 0;
        int postCount = 0;
        while (!iamdone) {
            iamdone = true;
            for (int i = 0; i < boxes.size(); i++) {
                for (int j = 0; j < boxes.get(i).size(); j++) {
                    if (boxes.get(i).get(j).iamdone == false && boxes.get(i).get(j).status == 2) {
                        if (boxes.get(i).get(j).number == 0)
                            boxes.get(i).get(j).LookAroundZero();
                        else
                            boxes.get(i).get(j).LookAroundNonZero();
                    }
                    if (boxes.get(i).get(j).iamdone == true)
                        postCount++;
                }
            }
            if (preCount != postCount) {
                iamdone = false;
                preCount = postCount;
                postCount = 0;
            }
        }
    }

    private void GetUnknowns() {
        unknownBoxes.clear();
        missingMines = 0;
        for (int i = 0; i < boxes.size(); i++) {
            for (int j = 0; j < boxes.get(i).size(); j++) {
                if (boxes.get(i).get(j).status == 1) {
                    unknownBoxes.add(boxes.get(i).get(j));
                    boxes.get(i).get(j).iDontHaveAMine = true;
                } else if (boxes.get(i).get(j).status == 3) {
                    missingMines++;
                }
            }
        }
        missingMines = totalMines - missingMines;
        if (missingMines == unknownBoxes.size()) {
            for (int i = 0; i < unknownBoxes.size(); i++) {
                unknownBoxes.get(i).status = 3;
            }
            missingMines = 0;
        } else if (missingMines == 0) {
            for (int i = 0; i < unknownBoxes.size(); i++) {
                unknownBoxes.get(i).Open();
            }
        }
    }


    private void MakePossibleGroups() {
        boolean result;
        for (int i = 0; i < testingBoxes.size(); i++) {
            result = true;
            for (int j = 0; j < testingBoxes.get(i).size(); j++) {
                testingBoxes.get(i).get(j).status = 3;
            }

            for (int k = 0; k < boxes.size(); k++) {
                for (int l = 0; l < boxes.get(k).size(); l++) {
                    if ((boxes.get(k).get(l).status == 1 || boxes.get(k).get(l).status == 2) && boxes.get(k).get(l).number != 0) {
                        if (boxes.get(k).get(l).Finalize() == false) {
                            result = false;
                            break;
                        }
                    }
                }
                if (result == false) break;
            }
            for (int j = 0; j < testingBoxes.get(i).size(); j++) {
                testingBoxes.get(i).get(j).status = 1;
                if (result) testingBoxes.get(i).get(j).iDontHaveAMine = false;
            }
        }
    }

    private void OpenNewBoxes() {
        unsolvable = true;
        for (int i = 0; i < unknownBoxes.size(); i++) {
            if (unknownBoxes.get(i).iDontHaveAMine) {
                unknownBoxes.get(i).Open();
                unsolvable = false;
            }
        }
    }

    private void RecurringFunction(int a, int b, List<Integer> no) {
        for (int i = a; i < unknownBoxes.size() - b; i++) {
            no.add(i);
            if (b == 0) {
                group = new ArrayList<>();
                for (int j = 0; j < no.size(); j++) {
                    group.add(unknownBoxes.get(no.get(j)));
                }
                testingBoxes.add(group);

            } else {
                RecurringFunction(i + 1, b - 1, no);
            }
            no.remove(no.size() - 1);
        }

    }

    private class Box {
        public int row;
        public int col;
        public int status; //?
        public int number;
        public boolean iamdone = false;
        public boolean iDontHaveAMine = true;

        private int mines;
        private List<Box> unknowns = new ArrayList<>();
        private int knowns;

        public Box(int _row, int _col, int _status, int _number) {
            row = _row;
            col = _col;
            status = _status;
            number = _number;
        }

        public void setStatus(int s) {
            status = s;
        }

        public void Open() {
            setStatus(2);
            number = Game.open(row, col);
        }

        public void LookAroundZero() {
            iamdone = true;
            for (int m = row - 1; m <= row + 1; m++) {
                for (int n = col - 1; n <= col + 1; n++) {
                    if (m >= 0 && m < boxes.size() && n >= 0 && n < boxes.get(0).size() && (m != row || n != col))
                        boxes.get(m).get(n).Open();
                }
            }
        }

        public void LookAroundNonZero() {
            LookAroundToAnalyse();

            if (number == mines) {
                for (int i = 0; i < unknowns.size(); i++) {
                    unknowns.get(i).Open();
                }
                iamdone = true;
            } else if (number == unknowns.size() + mines) {
                for (int i = 0; i < unknowns.size(); i++) {
                    unknowns.get(i).setStatus(3);
                    unknowns.get(i).iamdone = true;
                }
            }

        }

        public boolean Finalize() {
            LookAroundToAnalyse();
            if (status == 1) {
                if (mines == 0) return false;
                else return true;
            }
            if (number == mines)
                return true;
            else
                return false;
        }

        private void LookAroundToAnalyse() {
            mines = 0;
            knowns = 0;
            unknowns.clear();

            for (int m = row - 1; m <= row + 1; m++) {
                for (int n = col - 1; n <= col + 1; n++) {
                    if (m >= 0 && m < boxes.size() && n >= 0 && n < boxes.get(0).size() && (m != row || n != col)) {
                        switch (boxes.get(m).get(n).status) {
                            case 1:
                                unknowns.add(boxes.get(m).get(n));
                                break;
                            case 2:
                                knowns++;
                                break;
                            case 3:
                                mines++;
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }
}


