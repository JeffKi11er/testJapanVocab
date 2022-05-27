package com.company;

import com.company.bo_thu.ThuCenter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ThuCenter center = ThuCenter.initialize();
        int command;
        do{
            System.out.println("Fast learning Progress introduction");
            center.data();
            center.showOff();
            System.out.println("\n Task end");
            System.out.println("Learn ? [1]Yes/[0]No");
            command = (new Scanner(System.in).nextInt());
        }while (command == 1);
        System.out.println("Finish ! Thankyou for using !");
    }
}
