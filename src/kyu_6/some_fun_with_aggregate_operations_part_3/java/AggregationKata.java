// https://www.codewars.com/kata/5960e6cf09868d7f2f0000bc/train/java

package kyu_6.some_fun_with_aggregate_operations_part_3.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class AggregationKata {

    public static Map<String, List<String>> getStudentNamesByDepartment(Stream<Student> students) {
        return students
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.mapping(Student::getName, Collectors.toList())));
    }
}