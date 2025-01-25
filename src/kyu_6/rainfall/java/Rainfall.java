// https://www.codewars.com/kata/56a32dd6e4f4748cc3000006/train/java

package kyu_6.rainfall.java;

import static java.util.stream.Stream.of;

import java.util.stream.DoubleStream;

class Rainfall {
    static double mean(String town, String strng) {
        return result(town, strng).average().orElse(-1);
    }

    static double variance(String town, String strng) {
        return result(town, strng)
                .map(p -> Math.pow(p - mean(town, strng), 2))
                .average()
                .orElse(-1);
    }

    private static DoubleStream result(String town, String data) {
        return of(data.split("\n"))
                .filter(f -> f.startsWith(town + ":"))
                .flatMapToDouble(f -> of(f.replaceAll("[^\\d.]", " ")
                        .trim()
                        .split("\\s+"))
                        .mapToDouble(Double::parseDouble));
    }
}
