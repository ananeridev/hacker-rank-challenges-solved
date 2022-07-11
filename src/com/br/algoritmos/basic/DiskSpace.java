package com.br.algoritmos.basic;

import java.util.Scanner;

public class DiskSpace {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        long space[] = new long[n];
        for (int i = 0; i < n; i++) {
            space[i] = sc.nextLong();
        }
        long minimal[] = new long[n - x + 1];
        long max = Long.MIN_VALUE;
        for (int i = 0; i <= n - x; i++) {
            minimal[i] = Long.MAX_VALUE;
            for (int j = i; j < i + x; j++) {
                if (minimal[i] > space[j])
                    minimal[i] = space[j];
            }
            if (max < minimal[i])
                max = minimal[i];
        }
        System.out.println(max);
        sc.close();
    }
}
