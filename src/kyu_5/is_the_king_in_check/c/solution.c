#include <stdbool.h>

static int deltas[][4][2] = {
   { {-1,0}, {1,0}, {0,-1}, {0,1} }, // Horizontals and Verticals
   { {-1,1}, {1,1}, {-1,-1}, {1,-1} }  // Diagonals
};

char at_xy(const char cb[8][8], int x, int y) { return x < 0 || x > 7 || y < 0 || y > 7 ? '?' : cb[y][x]; }

bool look(const char cb[8][8], int k[2], int deltas[4][2], char piece) {
  bool found = false;
  for (int j = 0; !found && j < 4; j++) {
    int *delta = &deltas[j];
    for (int i = 1; !found && i < 8; i++) {
      char c = at_xy(cb, k[0] + i * delta[0], k[1] + i * delta[1]);
      if (c == ' ') continue;
      if (c == piece) found = true;
      break;
    }
  }
  return found;
}

bool check_by_knight(const char cb[8][8], int k[2]) {
  int moves[8][2] = { {2,1}, {2,-1}, {-2,1}, {-2,-1}, {1,2}, {1,-2}, {-1,2}, {-1,-2} };
  for (int i = 0; i < 8l; i++) if (at_xy(cb, k[0] + moves[i][0], k[1] + moves[i][1]) == 'N') return true;
  return false;
}

bool king_is_in_check(const char cb[8][8]) {
  int k[2];
  for (int y = 0; y < 8; y++) for (int x = 0; x < 8; x++) if (cb[y][x] == 'K') k[0] = x, k[1] = y;
  return
    look(cb, k, deltas[0], 'Q') || look(cb, k, deltas[1], 'Q') || // Queen
    look(cb, k, deltas[1], 'B') || // Bishop
    look(cb, k, deltas[0], 'R') || // Rook
    at_xy(cb, k[0] - 1, k[1] - 1) == 'P' || at_xy(cb, k[0] + 1, k[1] - 1) == 'P' || // Pawn
    check_by_knight(cb, k); // Knight
}