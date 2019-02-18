//2. Write a program to compute the addition of two matrix, Read the number of rows and columns
//        as input, also the values of each matrix
//        Output:
//        Input number of rows of matrix: 3
//        Input number of columns of matrix: 2
//        Input elements of first matrix: 1 2 3 4 5 6
//        Input the elements of second matrix: 9 8 7 6 5 4
//        Sum of the matrices:-
//        10 10
//        10 10
//        10 10

package com.statckroute.project;

public class Matrix {
    private int [][] matrix1;
    private int [][] matrix2;

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }

    public int [][] additionOfMatrices(){
        if(matrix1==null ||matrix2==null)
         return  null;
        int row=matrix1.length;
        int column=matrix1[0].length;

        int [][] result=new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return  result;
     }
}
