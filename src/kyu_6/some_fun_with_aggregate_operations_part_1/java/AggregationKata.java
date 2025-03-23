// https://www.codewars.com/kata/595fa01cde9d341e8c000045/train/java

package kyu_6.some_fun_with_aggregate_operations_part_1.java;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class AggregationKata {
    public static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {
        return students.collect(
                Collectors.groupingBy(Student::getDepartment,
                Collectors.averagingDouble(Student::getGrade)));
    }
}




