package com.techlabs.games;

import java.util.*;

public class PigGames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int turns = 0;
        int score = 0;
        Random random = new Random();

        int die = 0;

        while (score<20){
            turns++;
            System.out.println("TURN " + turns);
            int turn_score = 0;
            while (true) {
                System.out.print("Roll or Hold? (r/h): ");
                char val = sc.nextLine().charAt(0);

                switch (val) {
                    case 'r':
                        die = list.get(random.nextInt(6));
                        System.out.println("Die: " + die);
                        if (die == 1) {
                            score = 0;
                            turn_score = 0;
                            System.out.println("Turn over. No score.");
                            break;
                        } else {
                            score += die;
                            turn_score += die;
                        }
                        break;
                    case 'h':
                        System.out.println("Score for turn: " + turn_score);
                        System.out.println("Total score: " + score);
                        break;
                    default:
                        System.out.println("Invalid character");
                }
                if (val == 'h' || die == 1){
                    break;
                }
            }
        }
        System.out.println("You finished in "+turns+" turns!");
        System.out.println("Game Over!");
    }
}

