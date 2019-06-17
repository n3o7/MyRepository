package com.company;

public class Main {

        public static void main(String[] args) {
        Operationable sum;
        sum = (x, y, z)->x+y+z;
            int result = sum.calculate(10, 20,60);
            System.out.println(result);


    Operationable1 division;
        division = (x, y)->x/y;
                double result1 = division.calculate1(100, 13);
                System.out.println(result1);
        }
                }

    interface Operationable{
        int calculate(int z,int x,int y);
    }
    interface Operationable1{
        double calculate1(double y,double z);
    }
