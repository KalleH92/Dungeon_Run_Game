package com.kalle.demo;

import java.util.Random;

public class Monster implements ICombat {



    private String name;
        private int damage;
        private int precision;
        private int evasion;
        private int vitality;
        private int monsterDamage;
        private int experience;

    public int getMonsterDamage() {return monsterDamage; }
    public void setMonsterDamage(int monsterDamage) {this.monsterDamage = monsterDamage; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void createMonster() {

    String[] nameList = {"Goblin", "Ratman", "Skeleton", "Orc", "Vampire", "Dark elf", "Faun", "Troll", "Giant Spider", "Ogre", "Centaur", "Giant", "Demon", "Dragon"};

    for (int i = 0; i < nameList.length; i++) {
        //System.out.println(nameList[i]);
    }
    Random slump = new Random();

    int nameNumberInt = slump.nextInt(nameList.length);
    String nameNumberString = nameList[nameNumberInt];

    //System.out.println(nameNumberInt);
    //System.out.println(nameNumberString);

    switch (nameNumberInt) {
        case 0: case 1: case 2: case 3:
            //System.out.println("easy mobs");
            setDamage(2);
            setVitality(10);
            setEvasion(1);
            setPrecision(3);
            setExperience(10);
            break;
        case 4: case 5: case 6: case 7:
            //System.out.println("normal mobs");
            setDamage(5);
            setVitality(25);
            setEvasion(2);
            setPrecision(4);
            setExperience(25);
            break;
        case 8: case 9: case 10: case 11:
            //System.out.println("hard mobs");
            setDamage(10);
            setVitality(50);
            setEvasion(3);
            setPrecision(5);
            setExperience(50);
            break;
        case 12: case 13:
            //System.out.println("very hard mobs");
            setDamage(15);
            setVitality(120);
            setEvasion(4);
            setPrecision(6);
            setExperience(100);
            break;
    }
    setName(nameNumberString);
}

    public void getStatus () {
        System.out.println("Monster damage: " + damage);
        System.out.println("Precision: " + precision);
        System.out.println("Evasion: " + evasion);
        System.out.println("Vitality: " + vitality + "/" + vitality);
    }

    @Override
    public void attack() {
        //System.out.println("monster attacks player");
        //System.out.println("test monster dmg " + damage);
        setMonsterDamage(monsterDamage = damage);

        //System.out.println(" testing monster damage " + damage );

    }

    @Override
    public void flee() {
        System.out.println(" Monster flee from player ");
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


