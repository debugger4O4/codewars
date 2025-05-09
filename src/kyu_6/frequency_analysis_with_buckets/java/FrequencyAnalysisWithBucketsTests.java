package kyu_6.frequency_analysis_with_buckets.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.*;

public class FrequencyAnalysisWithBucketsTests {
    @Test
    public void shouldReturnAnArrayWithALengthOfInputLengthPlusOne() {
        int[] arr = new int[]{4, 5, 6};
        ArrayList<ArrayList<Integer>> actual = FrequencyAnalysisWithBuckets.bucketize(arr);
        assertNotNull("Received a null.", actual);
        assertEquals(actual.size(), arr.length + 1);
        arr = new int[]{7, 7, 7, 7, 8, 6};
        actual = FrequencyAnalysisWithBuckets.bucketize(arr);
        assertNotNull("Received a null.", actual);
        assertEquals(FrequencyAnalysisWithBuckets.bucketize(arr).size(), arr.length + 1);
    }

    @Test
    public void shouldSolveTheFirstSampleTestCase() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(null);
        list.add(null);
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(1);
            list.add(entry);
        }
        doTest(new int[]{1, 1, 1}, list);
    }

    @Test
    public void shouldSolveTheSecondSampleTestCase() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(7);
            list.add(entry);
        }
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(6);
            list.add(entry);
        }
        list.add(null);
        doTest(new int[]{7, 6, 6}, list);
    }

    @Test
    public void shouldSolveTheThirdSampleTestCase() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(9);
            list.add(entry);
        }
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(5);
            list.add(entry);
        }
        list.add(null);
        doTest(new int[]{5, 5, 5, 9}, list);
    }

    @Test
    public void shouldSolveTheFourthSampleTestCase() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(null);
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(4);
            entry.add(8);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        doTest(new int[]{8, 8, 4, 4}, list);
    }

    @Test
    public void shouldSolveTheFifthSampleTestCase() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(1);
            entry.add(10);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(7);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        doTest(new int[]{1, 7, 7, 7, 7, 10}, list);
    }

    @Test
    public void shouldSolveTheSixthSampleTestCase() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(40);
            entry.add(60);
            entry.add(80);
            entry.add(100);
            list.add(entry);
        }
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(20);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        doTest(new int[]{20, 40, 60, 80, 100, 20}, list);
    }

    @Test
    public void shouldSolveTheSeventhSampleTestCase() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(4);
            entry.add(17);
            entry.add(34);
            entry.add(65);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(9);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        doTest(new int[]{9, 9, 9, 9, 4, 34, 65, 17}, list);
    }

    @Test
    public void shouldSolveTheEighthSampleTestCase() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(null);
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(19);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(12);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        doTest(new int[]{12, 12, 12, 12, 12, 12, 19, 19}, list);
    }

    @Test
    public void shouldSolveTheNinethSampleTestCase() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(2);
            entry.add(3);
            entry.add(4);
            list.add(entry);
        }
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(1);
            list.add(entry);
        }
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(5);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        doTest(new int[]{1, 1, 1, 2, 3, 5, 5, 5, 5, 4}, list);
    }

    @Test
    public void shouldSolveTheTenthSampleTestCase() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(2);
            entry.add(4);
            entry.add(6);
            entry.add(7);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        {
            ArrayList<Integer> entry = new ArrayList<Integer>();
            entry.add(3);
            list.add(entry);
        }
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        doTest(new int[]{7, 6, 4, 3, 3, 3, 3, 3, 3, 2}, list);
    }

    private void doTest(final int[] arr, final ArrayList<ArrayList<Integer>> expected) {
        ArrayList<ArrayList<Integer>> actual = FrequencyAnalysisWithBuckets.bucketize(arr);
        assertNotNull("Received a null.", actual);
        if (actual.size() != expected.size()) {
            System.out.format("Array sizes don't match.\n"
                            + "Expected %d elements.\n"
                            + "Received %d elements.\n",
                    expected.size(), actual.size());
            assertEquals(actual.size(), expected.size());
        }
        for (int i = 0; i < expected.size(); i++) {
            if (actual.get(i) != null && expected.get(i) != null) {
                if (actual.get(i).size() != expected.get(i).size()) {
                    System.out.format("Array sizes don't match for count of %d.\n"
                                    + "Expected %d elements.\n"
                                    + "Received %d elements.\n",
                            i, expected.get(i).size(), actual.get(i).size());
                    assertEquals(actual.get(i).size(), expected.get(i).size());
                }
                for (int j = 0; j < expected.get(i).size(); j++)
                    if (actual.get(i).get(j) != expected.get(i).get(j)) {
                        System.out.format("Array for count of %d don't match.\n", i);
                        assertTrue("", false);
                    }
            } else if (actual.get(i) == null && expected.get(i) != null) {
                System.out.format("Expected an array for count of %d, but received a null.\n", i);
                assertNotNull("Should not be null", actual.get(i));
            } else if (actual.get(i) != null && expected.get(i) == null) {
                System.out.format("Expected a null for count of %d, but received an array.\n", i);
                assertNull("Should be null", actual.get(i));
            }
        }
    }
};

