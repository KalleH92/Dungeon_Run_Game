package com.kalle.demo;

import java.util.Random;

public class Monster implements ICombat {



    private String name;
        private int power;
        private int precision;
        private int evasion;
        private int vitality;
        private int baseDamage;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void createMonster() {

    String[] nameList = {"Goblin", "Ratman", "Skeleton", "Orc", "Vampire", "Dark elf", "Faun", "Troll", "Giant Spider", "Ogre", "Centaur", "Giant", "Demon", "Dragon"};

    for (int i = 0; i < nameList.length; i++) {
        System.out.println(nameList[i]);
    }
    Random slump = new Random();

    int nameNumberInt = slump.nextInt(nameList.length);
    String nameNumberString = nameList[nameNumberInt];

    System.out.println(nameNumberInt);
    System.out.println(nameNumberString);



    switch (nameNumberInt) {
        case 0: case 1: case 2: case 3:
            System.out.println("easy mobs");
            setPower(10);
            setVitality(100);
            setEvasion(2);
            setPrecision(3);
            break;
        case 4: case 5: case 6: case 7:
            System.out.println("normal mobs");
            setPower(20);
            setVitality(150);
            setEvasion(4);
            setPrecision(6);
            break;
        case 8: case 9: case 10: case 11:
            System.out.println("hard mobs");
            setPower(30);
            setVitality(200);
            setEvasion(6);
            setPrecision(9);
            break;
        case 12: case 13:
            System.out.println("very hard mobs");
            setPower(50);
            setVitality(250);
            setEvasion(8);
            setPrecision(12);
            break;
    }





    setName(nameNumberString);
}

    public void getStatus () {
        System.out.println("Power: " + power);
        System.out.println("Base damage: " + baseDamage);
        System.out.println("Precision: " + precision);
        System.out.println("Evasion: " + evasion);
        System.out.println("Vitality: " + vitality + "/" + vitality);
    }

    @Override
    public void attack() {
        System.out.println("monster attacks player");
    }

    @Override
    public void flee() {
        System.out.println("Monster flee from player");
    }


         /*   String monsterNumber = nameList[slump.nextInt(nameList.length)];
        System.out.println(monsterNumber);

        public void getStatus () {
            System.out.println("Power: " + power);
            System.out.println("Base damage: " + baseDamage);
            System.out.println("Precision: " + precision);
            System.out.println("Evasion: " + evasion);
            System.out.println("Vitality: " + vitality);
        }
        */

    }


