package com.kalle.demo;

public class Player implements ICombat{

    private int power;
    private String name;
    private int precision;
    private int evasion;
    private int vitality;
    private int xp;
    private int level;
    private int baseDamage;
    private int playerDamage;

    public int getPlayerDamage() {
        return playerDamage;
    }
    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }


    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getBaseDamage() {
        return baseDamage;
    }
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void getStatus () {
        System.out.println("Power: " + power);
        System.out.println("Base damage: " + baseDamage);
        System.out.println("Precision: " + precision);
        System.out.println("Evasion: " + evasion);
        System.out.println("Vitality: " + vitality + "/100");
        System.out.println("Level: " + level);
        System.out.println("Experience: " + xp + "/100");
    }

    public void fightStatus () {
        System.out.println("Power: " + power);
        System.out.println("Base damage: " + baseDamage);
        System.out.println("Precision: " + precision);
        System.out.println("Evasion: " + evasion);
        System.out.println("Vitality: " + vitality + "/100");
    }

    @Override
    public void attack() {
        //System.out.println("Player attack monster");
        //System.out.println("test base dmg " + baseDamage + "test " + power);
        setPlayerDamage(playerDamage = baseDamage + (((power * 2) / 4)));

        //System.out.println("testing power " + power + " Testing playerdmg " + playerDamage + " Test Base dmg " + baseDamage);
    }

    @Override
    public void flee() {
        System.out.println("Player flee from monster");
    }

    /*
   public Player() {}
    public Player(String name) {
        this.name = name;
    }

    public Player(int power, String name, int precision, int evasion, int vitality, int xp, int level, int baseDamage) {
        this.power = power;
        this.name = name;
        this.precision = precision;
        this.evasion = evasion;
        this.vitality = vitality;
        this.xp = xp;
        this.level = level;
        this.baseDamage = baseDamage;
    }
    */
}
