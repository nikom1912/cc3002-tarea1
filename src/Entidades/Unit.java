package Entidades;

public abstract class Unit implements Attackable, Attacker{
    private int HP,DMG;
    public Unit(int HP, int DMG){
        this.HP = HP;
        this.DMG = DMG;
    }
    public Unit(){
        this.HP = 0;
        this.DMG = 0;
    }

}
