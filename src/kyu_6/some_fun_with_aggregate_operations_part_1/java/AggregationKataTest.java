package kyu_6.some_fun_with_aggregate_operations_part_1.java;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class AggregationKataTest {

    private Student[] students;

    @Before
    public void setUp() {

        //Generate a basic array of students:
        Student galina = new Student("Galina", 95, "Philology", Student.Gender.FEMALE);
        Student anton = new Student("Anton", 90, "CS", Student.Gender.MALE);
        Student jack = new Student("Jack", 82, "Philology", Student.Gender.MALE);
        Student mike = new Student("Mike", 60, "Philology", Student.Gender.MALE);
        Student jane = new Student("Jane", 65, "CS", Student.Gender.FEMALE);

        students = new Student[]{galina, anton, jack, mike, jane};


    }

    @Test
    public void basicTestGetAverageGradeByDepartment() throws Exception {

        Map<String, Double> actual = AggregationKata.getAverageGradeByDepartment(Arrays.stream(students));
        Map<String, Double> expected = new HashMap<>();
        expected.put("CS", 77.5);
        expected.put("Philology", 79.0);

        assertEqualsWithTolerance(expected, actual);

    }

    void assertEqualsWithTolerance(Map<String, Double> expected, Map<String, Double> actual) {

        assertEquals("The size of the returned map is incorrect", expected.size(), actual.size());

        for (var entry : expected.entrySet()) {

            var key = entry.getKey();
            var value = entry.getValue();

            assertEquals(
                    String.format("Key '%s' does not exist in the returned map", key),
                    true, actual.containsKey(key));

            var actualValue = actual.get(key);

            assertEquals(
                    String.format("Returned Value %f is incorrect for key '%s': expected value %f", actualValue, key, value),
                    true, Math.abs(actualValue - value) < 1e-6);
        }

    }

}
