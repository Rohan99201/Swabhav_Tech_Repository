package com.techlabs.game;

import java.util.*;

public class NumGuesser {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 1;

        do {
            switch (choice) {
                case 1:
                    guesser();
                    break;
                case 0:
                    break;
            }
            System.out.println("For playing the game press 1.\n" +
                    "Press 0 to exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
        }while (choice == 1);
    }

    public static void guesser(){
        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 101;
        int count = 0;

        int random = (int) (Math.random()*(max-min+1) + min);
        System.out.println("Enter your guess: ");

//        boolean flag = true;
//        while (flag){
//            flag = false;
//        }
        for (int i=1;i<101;i++){
            int val = sc.nextInt();
            if(val == random){
                count++;
                System.out.println("Total tries made: "+count);
                break;
            }else if (val < random){
                count++;
                System.out.println("Sorry,Too Low");
            }else {
                count++;
                System.out.println("Sorry,Too High");
            }
        }
    }
}
