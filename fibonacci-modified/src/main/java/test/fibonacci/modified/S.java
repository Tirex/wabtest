/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.fibonacci.modified;

import java.math.BigInteger;
import java.util.Scanner;

public class S {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger t1 = s.nextBigInteger();
        BigInteger t2 = s.nextBigInteger();
        int n = s.nextInt();

        BigInteger totalNum = BigInteger.ZERO;

        for (int i = 2; i < n; i++) {
            totalNum = t1.add(t2.multiply(t2));
            t1 = t2;
            t2 = totalNum;
        }
        System.out.print(totalNum);

    }
}
