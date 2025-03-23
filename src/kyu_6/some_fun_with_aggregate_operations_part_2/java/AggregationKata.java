// https://www.codewars.com/kata/596092e42e8c8b5382000026/train/java

package kyu_6.some_fun_with_aggregate_operations_part_2.java;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class AggregationKata {

    public static Map<String, Long> getNumberOfStudentsByDepartment(Stream<Student> students) {
        return students
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.counting()));
    }
}




