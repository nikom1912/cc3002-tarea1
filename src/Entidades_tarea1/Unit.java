package Entidades;

public abstract class Unit implements Attackable, Attacker{
    private int HP,DMG, HPMax;

    public Unit(int HP, int DMG, int HPMax){
        this.HP = HP;
        this.DMG = DMG;
        this.HPMax = HPMax;
    }

    public int getHP(){
        return this.HP;
    }
    public int getDMG(){
        return this.DMG;
    }
    public boolean isAlive(){
        return (this.HP > 0);
    }
    public void attacked(int DMG) {
        this.HP = (this.HP - DMG > this.HPMax) ? this.HPMax : this.HP - DMG ;
        if(this.HP <= 0){
            this.HP = 0;
            this.HPMax = 0;
        }
    }
}
