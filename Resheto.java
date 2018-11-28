package com.marlen.java.lesson_1.Lesson7_1.Home7.e_olymp.Reshito_Eratosfena_Sieve_of_Eratosthenes;

/**
 * Created by Pysik on 25.04.2018.
 */
public class Resheto {
    public static void main(String[] args) {
        int size= 100;
        int []matrix = new int[size];
        matrix[0]=matrix[1]=0;

        for (int i = 2; i < size; i++) {
            matrix[i]=1;
        }

        // Magic is there:
        for (int i = 2; i*i < size; i++) {
            if(matrix[i]==1){
                for (int j = i*i; j < size ; j+=i) {
                    matrix[j]=0;
                }
            }
        }

        for (int i = 0; i <size ; i++) {
            if(matrix[i]==1){
                System.out.print(i+" ");
            }
        }
    }
}
