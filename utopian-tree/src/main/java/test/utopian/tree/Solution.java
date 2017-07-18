/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.utopian.tree;

import java.util.Scanner;

/**
 *
 * @author tirex
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = 1;
            //for every cycle
            for (int j = 0; j < n; j++) {

                if (j % 2 == 0) {
                    //if spring doubles height
                    k = (k * 2);
                } else {
                    // else increase by 1
                    k = k + 1;
                }
            }
            System.out.println(k);
        }
    }

}
