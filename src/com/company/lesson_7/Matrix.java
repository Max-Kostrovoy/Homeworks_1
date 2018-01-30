package com.company.lesson_7;

public class Matrix {
    public double matrix[][];
    public int size;


    public static void printMatrix(double mtx[][]) {
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }

    Matrix(int n) {
        size = n;
        matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (int) (Math.random() * 100);
    }

    public void outputMatrix() {
        System.out.println("Matrix Output: ");
        for (int i = 0; i < matrix.length; i++) {
            {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "   ");
                }
                System.out.println();
            }
        }
    }

    public void fillMatrix() {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random() * 100;
            }
    }

    public Matrix sumMatrix(Matrix m1, Matrix m2) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                m1.matrix[i][j] += m2.matrix[i][j];
        }
        return m1;
    }

    public Matrix productOfMtx(Matrix m1, Matrix m2) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                m1.matrix[i][j] *= m2.matrix[i][j];
        }
        return m1;
    }

    public Matrix productOfMtxAndNum(Matrix m1, double num) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                m1.matrix[i][j] *= num;
        }
        return m1;
    }

    public static void main(String[] args) {

        Matrix mtx1 = new Matrix(3);
        Matrix mtx2 = new Matrix(3);
        mtx1.outputMatrix();
        mtx2.outputMatrix();
        mtx1.sumMatrix(mtx1, mtx2);
        System.out.println("=======");
        mtx1.outputMatrix();
    }
}
