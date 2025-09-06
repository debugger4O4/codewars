// https://www.codewars.com/kata/639242518e28a700283f68ee/train/java

package kyu_6.task_master.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    static int taskMaster(Collection<Callable<Integer>> functions) {
        ExecutorService executorService = Executors.newFixedThreadPool(functions.size());
        List<Future<Integer>> futures = new ArrayList<>();
        for (Callable<Integer> function : functions) {
            try {
                futures.add(executorService.submit(function));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        int sum = 0;
        for (Future<Integer> future : futures) {
            try {
                sum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }
}
