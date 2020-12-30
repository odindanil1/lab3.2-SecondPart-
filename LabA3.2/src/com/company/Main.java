package com.company;

public class Main {

    public static void main(String[] args) {
        /*  2.1 Нахождение детерминанта матрицы */
        int[][] danil = new int[4][4];  // Ввели матрицу
        for (int i = 0; i < danil.length; i++) {
            for (int z = 0; z < danil.length; z++) {
                danil[i][z] = (i + 1) * (z + 2);
            }
        }
        for (int i = 0; i < danil.length; i++) {
            for (int m = 0; m < danil.length; m++) {
                System.out.print(danil[i][m] + " ");
            }
            System.out.print("\n");
        }
        double[] minor = new double[4]; // Находим миноры каждого порядка
        minor[0] = (danil[1][1] * danil[2][2] * danil[3][3]) + (danil[1][2] * danil[2][3]) * danil[3][1] + (danil[1][3] * danil[2][1] * danil[3][2])
                - (danil[1][3] * danil[2][2] * danil[3][1]) - (danil[1][2] * danil[2][1] * danil[3][3]) - (danil[1][1] * danil[2][3] * danil[3][2]);
        minor[1] = (danil[1][0] * danil[2][2] * danil[3][3]) + (danil[1][2] * danil[2][3]) * danil[3][0] + (danil[1][3] * danil[2][0] * danil[3][2])
                - (danil[1][3] * danil[2][2] * danil[3][0]) - (danil[1][2] * danil[2][0] * danil[3][3]) - (danil[1][0] * danil[2][3] * danil[3][2]);
        minor[2] = (danil[1][0] * danil[2][1] * danil[3][3]) + (danil[1][1] * danil[2][3]) * danil[3][0] + (danil[1][3] * danil[2][0] * danil[3][1])
                - (danil[1][3] * danil[2][1] * danil[3][0]) - (danil[1][1] * danil[2][0] * danil[3][3]) - (danil[1][0] * danil[2][3] * danil[3][1]);
        minor[3] = (danil[1][0] * danil[2][1] * danil[3][2]) + (danil[1][1] * danil[2][2] * danil[3][0]) + (danil[1][2] * danil[2][0] * danil[3][1])
                - (danil[1][2] * danil[2][1] * danil[3][0]) - (danil[1][1] * danil[2][0] * danil[3][2]) - (danil[1][0] * danil[2][2] * danil[3][2]);
//Используем формулу и находим детерминант
        double determinant = (Math.pow(-1, 2) * minor[0]) + (Math.pow(-1, 3) * minor[1]) + (Math.pow(-1, 4) * minor[2]) + (Math.pow(-1, 5) * minor[3]); //Используем формулу и находим детерминант
        System.out.println("Детерминант матрицы равен:" + determinant);

        /*  2.2 Умножение двух матриц */
        int[][] danya1 = new int[4][4];
        int[][] danya2 = new int[4][4];
        for (int i =0;i < 4;i++) {
            for (int g = 0; g < 4; g++) {
                danya1[i][g] = (int) (Math.random() * 10); // Ввели два массива(матрицы(4 на 4) и присвоили им случайное значение от 0 до 10
                danya2[i][g] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Матрицa #1:");
        for(int i = 0; i < danya1.length; i++){
            for(int m = 0; m < danya1.length; m++){
                System.out.print(danya1[i][m] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        System.out.println("Матрицa #2:");
        for(int i = 0; i < danya2.length; i++){
            for(int t = 0; t < danya2.length; t++){
                System.out.print(danya2[i][t] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");





        int m = danya1.length;
        int n = danya2[0].length;
        int o = danya2.length;
        int[][] res = new int[m][n];
        // Находим каждый элемент перемноженной матрицы по формуле
        // Элемент матрицы  res, стоящий на n-й строке, в m-ном столбце находится как
        // сумма произведений n-й строки матрицы  danya1 на m-й столбец матрицы  danya2

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += danya1[i][k] * danya2[k][j];
                }
            }
        }

        System.out.println("Результат умножения матриц:");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] +" ");
            }

            System.out.println();
        }

            /*  3.1 Вырезать из трехмерного массива двухмерный */

        System.out.println("\n" + "Трехмерный массив");
            int[][][] massiveX3 = new int[4][4][4];
            int[][] massiveX2 = new int[4][4];
            int[][] m2assiveX2 = new int[4][4];
            for (int ii = 0; ii < massiveX3.length; ii++) {
                for (int x = 0; x < massiveX3.length; x++) {
                    for (int e = 0; e < massiveX3.length; e++) {
                        massiveX3[ii][x][e] = (ii + 1) + (x + 2) + (e * 3);
                    }
                }
            }
        for(int i = 0; i < massiveX3.length; i++) {
            for (m = 0; m < massiveX3.length; m++) {
                for (int l = 0; l < massiveX3.length; l++) {
                    System.out.print(massiveX3[i][m][l] + " ");
            }
        }
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.println("\n" + "Вырезанный двухмерный массив из 1 - 4 столбца трехмерного массива");
            for (int ji = 0; ji < massiveX2.length; ji++) {
                for (int y = 0; y < massiveX2.length; y++) {
                    int transform = massiveX3[0][ji][y];
                    massiveX2[ji][y] = transform;
                    System.out.print(massiveX2[ji][y] + " ");
                }
                System.out.print("\n");
            }
        System.out.print("\n");
        System.out.println("\n" + "Вырезанный двухмерный массив из 5 - 8 столбца трехмерного массива");
        for (int ji = 0; ji < m2assiveX2.length; ji++) {
            for (int y = 0; y < m2assiveX2.length; y++) {
                int transform = massiveX3[1][ji][y];
                m2assiveX2[ji][y] = transform;
                System.out.print(m2assiveX2[ji][y] + " ");
            }
            System.out.print("\n");
        }


        }
    }

