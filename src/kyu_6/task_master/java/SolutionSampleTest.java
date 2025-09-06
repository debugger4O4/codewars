package kyu_6.task_master.java;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSampleTest{
    static final Random random = new Random();

    static Callable<Integer> getFunction(long millis, int result){
        return () -> {
            Thread.sleep(millis);
            return result;
        };
    }

    @Test
    @DisplayName("Basic test")
    void basic1(){
        int expected = 5;
        var functions = List.of(
                getFunction(random.nextLong(1000, 2001), 3),
                getFunction(random.nextLong(1000, 2001), 2)
        );
        int actual = Solution.taskMaster(functions);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Big test with same results")
    void basic2(){
        var functions = new ArrayList<Callable<Integer>>();
        var function = getFunction(random.nextLong(1000, 2001), 3);
        for(int i=0; i < 10; i++)
            functions.add(function);
        int expected = 30;
        int actual = Solution.taskMaster(List.copyOf(functions));
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Big test with different results")
    void basic3(){
        var functions = new ArrayList<Callable<Integer>>();
        var functionA = getFunction(random.nextLong(1000, 2001), 3);
        for(int i=0; i < 10; i++)
            functions.add(functionA);
        var functionB = getFunction(random.nextLong(1000, 2001), 2);
        for(int i=0; i < 10; i++)
            functions.add(functionB);
        int expected = 50;
        int actual = Solution.taskMaster(List.copyOf(functions));
        assertEquals(expected, actual);
    }
}
