package Entidades;

/**Cavalry.java
 *
 * @author Nicolas Machuca
 */
public class Cavalry extends Unit{
    private int HP,DMG, HPMax;

    public Cavalry(){
        HP = 250;
        DMG = 50;
        HPMax = 400;
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
