package Entidades;

public abstract class Building implements Attackable{
    private int HP, HPMax;

    public Building(int HP, int HPMax){
        this.HP = HP;
        this.HPMax = HPMax;
    }

    public int getHP(){
        return this.HP;
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
