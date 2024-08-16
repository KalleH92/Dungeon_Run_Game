package com.kalle.demo;

public interface ICombat {

    Monster m1 = new Monster();
    Player p1 = new Player();


    default void attack() {
        System.out.println("test");
        int playerDamage = p1.getBaseDamage() + (p1.getPower() * 2 / 4 + 1);

    }

    void flee();



}


/*
    public int calculateDamage(ICombat enemy) {
        int damageDealt =
    }
    public void attack(ICombat enemy) {
        int dmg = this.calculateDamage(enemy);
    }
 */
