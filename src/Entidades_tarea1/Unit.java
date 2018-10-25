package Entidades_tarea1;

/**Unit.java
 *   abstract class for units
 * @author Nicolas Machuca
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

    public int getHP(){
        return this.HP;
    }
    public int getHPMax(){
        return this.HPMax;
    }
    public int getDMG(){
        return this.DMG;
    }
    public boolean isAlive(){
        return (this.getHP() > 0);
    }
    public void takeDamage(int DMG) {
        this.HP = (this.HP - DMG > this.getHPMax()) ? this.getHPMax() : this.HP - DMG ;
        if(this.HP <= 0){
            this.HP = 0;
            this.HPMax = 0;
        }
    }
    public abstract void attack(Attackable a);

}
