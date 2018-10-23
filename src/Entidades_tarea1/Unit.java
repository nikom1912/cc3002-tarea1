package Entidades_tarea1;

/**Unit.java
 *   abstract class for units
 * @author nikom
 */
public abstract class Unit implements Attackable, Attacker{
    private int HP,DMG, HPMax;

    /**Contructor object Unit
     *
     * @param HP inicial hit points
     * @param DMG damage points the Unit can do
     * @param HPMax max hit points the Unit can have
     */
    public Unit(int HP, int DMG, int HPMax){
        this.HP = HP;
        this.DMG = DMG;
        this.HPMax = HPMax;
    }

    /**
     *get the current entity's hit point
     * @return entity's hit points
     */
    public int getHP(){
        return this.HP;
    }

    /**
     * @return Unit's damage points
     */
    public int getDMG(){
        return this.DMG;
    }

    /**
     * this method allows to know if an entity
     * is alive (has hit points) or not.
     * @return entity's status; dead or alive (true or false)
     */
    public boolean isAlive(){
        return (this.HP > 0);
    }

    /**
     * Changes the hit points (HP) of the unit according to
     * the damage points, if DMG is positive the unit
     * loses HP otherwise the unit gains HP.
     * The resulting HP must be less than
     * or equal to HPMax and higher than or equal to 0.
     * @param DMG damage points that the unit will take
     */
    public void attacked(int DMG) {
        this.HP = (this.HP - DMG > this.HPMax) ? this.HPMax : this.HP - DMG ;
        if(this.HP <= 0){
            this.HP = 0;
            this.HPMax = 0;
        }
    }
}
