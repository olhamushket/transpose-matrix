package com.epam.rd.autotasks.matrices;
import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int [][] trans = new int[matrix[0].length][matrix.length];
        int n = Math.min(trans.length, trans[0].length);
        for (int i=0; i<n; i++) {
            trans[i][i]=matrix[i][i];
        }
        for (int i=0; i<trans.length; i++) {
            for (int j=0; j<trans[0].length; j++) {
                if (i!=j) {
                    trans[i][j]=matrix[j][i];
                }
            }
        }
        return trans;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        int [][] matrix = new int[20][20];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                matrix[i][j]= scan.nextInt();
            }
        }
 //        int[][] matrix = {
//                {1, 2},
//                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
