package com.kalle.demo;

import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);

    Player p1 = new Player();
    TextAndLore txt = new TextAndLore();
    Monster m1 = new Monster();



    public void introduction() {
        txt.intro();

        p1.setName(sc.nextLine());
        System.out.println("So you are called " + p1.getName() + ". A brave name indeed!");

        //Generate base Stats:
        p1.setPower(10);
        p1.setVitality(100);
        p1.setEvasion(1);
        p1.setPrecision(1);
        p1.setLevel(1);
        p1.setXp(0);
    }
    public void startStats() {

        //starting stats:
        System.out.println("this is your stats:");
        System.out.println(p1.getName());
        p1.getStatus();
    }

    public void mainMenu() {

        do {
            System.out.println("Main menu \n Choices: \n 1. FIGHT! \n 2. Current stats \n 3. Quit game :(");

            switch (sc.nextLine()) {
                case "1":
                    System.out.println("choosed 1");
                    m1.createMonster();
                    System.out.println("Suddenly a terrible " + m1.getName() + " appears!");
                    m1.getStatus();
                    break;
                case "2":
                    System.out.println(p1.getName() + "'s current stats:");
                    statMenu();
                case "3":
                    System.out.println("You have quit the game and left the dungeon.");
                    System.exit(0);
                default:
                    System.out.println("Not an allowed choice!");
            }
        }while (true);

    }



    public void fightMenu() {

    }

    /*public void combat() {
        p1.attack
    }
*/





    public void statMenu() {
        p1.getStatus();
        mainMenu();
    }





}
