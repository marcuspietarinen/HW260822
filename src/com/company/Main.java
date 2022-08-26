package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("HW 1");
        boolean weekday = true;
        boolean vacation = true;
        boolean late;

        if (!weekday || vacation == true)
            late = true;
        else
            late = false;

        System.out.println(late);
        System.out.println();



        System.out.println("HW 2");

        int time = 10;
        boolean shining;

        if (time >= 10 && time <= 16)
        {
            shining = true;
            System.out.println("please use sunscreen");
        }
        else
            shining = false;

        System.out.println();



        System.out.println("HW 3");

        int a = 69;
        int b = 420;
        boolean same;

        if (a % 10 == b % 10)
            same = true;
        else
            same = false;
        System.out.println(same);

        System.out.println();



        System.out.println("HW 4");

        int value = 1;
        boolean zyzz = false;

        while (zyzz == false)
        {
            if (value % 387 == 0 && value % 6381 == 0)
            {
                zyzz = true;
                System.out.println(value);
            }
            else
                value++;
        }
        }
    }

