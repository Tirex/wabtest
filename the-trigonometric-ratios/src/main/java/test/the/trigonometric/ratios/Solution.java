package test.the.trigonometric.ratios;

import java.util.Scanner;

public class Solution {

    // Since this codegolf problem, code very reduced and variables names are truncated
    public static void main(String[] a) {
        Scanner w = new Scanner(System.in);
        for (int n = w.nextInt(), i = 0; i < n; i++) {
            double x = w.nextDouble(), s = x, c = 1, m = 1, p = x * x, f = 2;
            int j = 2;
            while (j < 10) {
                if (j % 2 == 0) {
                    //cosinus calculation
                    c -= m * p / f;
                } else {
                    //sinus calculation
                    s -= m * p / f;
                    m *= -1;
                }
                //pow for x
                p *= x;
                //factorial for x
                f *= ++j;
            }
            System.out.format("%1$.3f\n%2$.3f\n", s, c);
        }
    }
}
