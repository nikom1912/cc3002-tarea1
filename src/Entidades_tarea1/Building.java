package Entidades_tarea1;

/**Building.java
 *   abstract class for building
 * @author Nicolas Machuca
 */
public abstract class Building implements Attackable{
    private int HP, HPMax;

    /**Contructor object Building
     *
     * @param HP inicial hit points
     * @param HPMax max hit points the Unit can have
     */
    Building(int HP, int HPMax){
        this.HP = HP;
        this.HPMax = HPMax;
    }

    public int getHP(){
        return this.HP;
    }
    public int getHPMax(){
        return this.HPMax;
    }
    public boolean isAlive(){
        return (this.getHP() > 0);
    }
    public void takeDamage(int DMG) {
        this.HP = (this.HP - DMG > this.HPMax) ? this.HPMax : this.HP - DMG ;
        if(this.HP <= 0){
            this.HP = 0;
            this.HPMax = 0;
        }
    }
}
