package com.br.algoritmos.basic;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * @author Ana Beatriz Neri
 *
 */

    public class CompareTheTriples {

        // Complete the compareTriplets function below.
        static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

            int totalAlice = 0, totalBob = 0;

            for (int i=0; i<3; i++) {
                int scoreAlice = a.get(i);
                int scoreBob = b.get(i);
                if (totalAlice != totalBob) {
                    int temp = scoreAlice > scoreBob ? totalAlice++ : totalBob++;
                }
            }

            List<Integer> result =  new ArrayList<>();
            result.add(totalAlice);
            result.add(totalBob);
            return result;

        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> result = compareTriplets(a, b);

            bufferedWriter.write(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining(" "))
                            + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();
        }
    }


