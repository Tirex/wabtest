/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.cavity.map;

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
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[][] f = new String[n][n];
        //fill initial map
        for (int i = 0; i < n; i++) {
            String line = s.next();
            for (int j = 0; j < n; j++) {
                f[i][j] = line.substring(j, j + 1);
            }
        }

        //cavity cell can't be on the border, so we can start iterate from second element in array
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (f[i][j].compareTo(f[i + 1][j]) > 0 && f[i][j].compareTo(f[i - 1][j]) > 0
                        && f[i][j].compareTo(f[i][j - 1]) > 0 && f[i][j].compareTo(f[i][j + 1]) > 0) {
                    f[i][j] = "X";
                }
            }
        }
        //print result map
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(f[i][j]);
            }
            System.out.println("");
        }

    }

}
