package com.br.algoritmos.basic;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class plusMinus {

        // Complete the plusMinus function below.
        static void plusMinus(int[] arr) {

            int pos = 0;
            int neg = 0;
            int zer = 0;

            for(int a : arr){
                if(a > 0)
                    pos++;
                if(a < 0)
                    neg++;
                if(a == 0)
                    zer++;

            }
            System.out.printf("%.6f%n",(double)pos / arr.length);
            System.out.printf("%.6f%n",(double)neg / arr.length);
            System.out.printf("%.6f%n",(double)zer / arr.length);

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            plusMinus(arr);

            scanner.close();
        }
    }

