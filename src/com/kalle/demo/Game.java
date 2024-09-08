package com.kalle.demo;

import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);
    Player p1 = new Player();
    Monster m1 = new Monster();
    TextAndLore txt = new TextAndLore();


    public void introduction() {
        txt.intro();
/*
        p1.attack();
        p1.flee();
        m1.attack();
        m1.flee();

 */
        p1.setName(sc.nextLine());
        System.out.println("So you are called " + p1.getName() + ". A brave name indeed!");

        //Generate base Stats:
        p1.setPower(20);
        p1.setVitality(100);
        p1.setEvasion(1);
        p1.setPrecision(1);
        p1.setLevel(1);
        p1.setXp(0);
        p1.setBaseDamage(7);
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
                    m1.createMonster();
                    System.out.println("Suddenly a terrible " + m1.getName() + " appears!");
                    m1.getStatus();
                    fightMenu();
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
        do {
            System.out.println("FIGHT! \n Choices: \n 1. Attack \n 2. Flee \n 3. Stats");
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("You have decided to attack the " + m1.getName());
                    p1.attack();
                    m1.attack();
                    int crit;


                    if (p1.getPrecision() > (Math.random()*12)) {
                        crit = 2;
                    } else {
                        crit = 1;
                    }
                    if ((p1.getPrecision() + (Math.random()*12)) > m1.getEvasion()) {
                        m1.setVitality(
                                m1.getVitality()-(p1.getPlayerDamage() * crit)
                        );
                        System.out.println("Your attack strikes the " + m1.getName() + " and deals " + p1.getPlayerDamage() + " damage!");
                    } else {
                        System.out.println("You missed!");
                    }

                    if (m1.getVitality() > 0) {
                        if ((m1.getPrecision() + (Math.random() * 12)) > p1.getEvasion()) {
                            p1.setVitality(
                                    p1.getVitality() - m1.getMonsterDamage()
                            );
                            System.out.println("You got hit by the " + m1.getName() + " and took " + m1.getMonsterDamage() + " damage!");
                        } else {
                            System.out.println("The " + m1.getName() + " tried to hit you but missed!");
                        }
                    } else {
                        p1.setXp(p1.getXp()+m1.getExperience());

                        if (p1.getXp() > 100) {
                            System.out.println("Congratulations, you have levelled up! Your stats have now increased!");
                            p1.setXp(0);
                            p1.setLevel(p1.getLevel() + 1);
                            p1.setPower(p1.getPower() + 2);
                            p1.setPrecision(p1.getPrecision() + 2);
                            p1.setEvasion(p1.getEvasion() +2);
                        }
                        mainMenu();
                    }

                    if (p1.getVitality() < 1) {
                        System.out.println("You have been killed by the " + m1.getName() + "! Game over!");
                        System.exit(0);
                    }

                    fightMenu();

                case "2":

                    if ((Math.random()*101)>(50+p1.getEvasion())) {
                        System.out.println("You have succefully fled from the " + m1.getName());
                        mainMenu();
                    } else {
                        System.out.println("You tried to flee from the " + m1.getName() + " but wasn't fast enough.");
                        if ((m1.getPrecision() + (Math.random() * 12)) > p1.getEvasion()) {
                            p1.setVitality(
                                    p1.getVitality() - m1.getMonsterDamage()
                            );
                            System.out.println("You got hit by the " + m1.getName() + " and took " + m1.getMonsterDamage() + " damage!");
                        } else {
                            System.out.println("The " + m1.getName() + " tried to hit you but missed!");
                        }
                    }

                case "3":
                    fightStats();
                default:
                    System.out.println("Not an allowed choice!");
            }
        } while (true);
    }

    /*public void combat() {
        p1.attack
    }
*/

    public void statMenu() {
        p1.getStatus();
        mainMenu();
    }

    public void fightStats() {
        System.out.println(p1.getName() + "'s stats:");
        p1.fightStatus();
        System.out.println(m1.getName() + "'s stats:");
        m1.getStatus();
        fightMenu();
    }
}
