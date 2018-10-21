package Entidades;

public class Infantry extends Unit {
    private int HP, DMG, HPMax;

    public Infantry(){
        HP = 200;
        DMG = 70;
        HPMax = 350;
    }

    /**
     * return a int
     * la vida de la entidad
     * @return int
     */
    public int getHP(){
        return HP;
    }
    public void attack(Attackable a){
        a.attacked(this.DMG);
    }
    public boolean isAlive(){
        return (HP > 0);
    }
    public void attacked(int DMG){
        this.HP = (HP - DMG > HPMax) ? HP - DMG : HPMax;
    }
}
