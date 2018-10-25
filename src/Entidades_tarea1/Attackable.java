package Entidades_tarea1;

/**Attackable.java
 * intarface for entities that can be attacked and take damage
 * @author nicolas machuca
 */
public interface Attackable {
    /**
     * returns the current git points of a attackable entity
     * @return entity's hit points
     */
    int getHP();
    /**
     * Changes the hit points (HP) of the unit according to
     * the damage points, if DMG is positive the unit
     * loses HP otherwise the unit gains HP.
     * The resulting HP must be less than
     * or equal to HPMax and higher than or equal to 0.
     * @param DMG damage points that the unit will take
     */
    void takeDamage(int DMG);
    /**
     * this method allows to know if an entity
     * is alive (has hit points) or not.
     * @return entity's status; dead or alive (true or false)
     */
    boolean isAlive();

    /**
     * This method represents an attack of
     * an infantry unit on an Attackable entity
     * @param i infantry unit that will attack the attackable one
     */
    void attackedByInfantry(Infantry i);

    /**
     * This method represents an attack of
     * an archer unit on an Attackable entity
     * @param a archer unit that will attack the attackable one
     */
    void attackByArcher(Archer a);

    /**
     * This method represents an attack of
     * a cavalry unit on an Attackable entity
     * @param c cavalry unit that will attack the attackable one
     */
    void attackByCavalry(Cavalry c);

    /**
     * This method represents an attack of
     * a siege unit on an Attackable entity
     * @param s siege unit that will attack the attackable one
     */
    void attackBySiege(Siege s);

    /**
     * This method represents an attack of
     * a villager unit on an Attackable entity
     * @param v villager unit that will attack the attackable one
     */
    void attackByVillager(Villager v);

    /**
     * This method represents an attack (healing) of
     * a monk unit on an Attackable entity
     * @param m monk unit that will attack (heal) the attackable (healeable) one
     */
    void attackByMonk(Monk m);

    /**
     * This method represents an attack of
     * a castle building on an Attackable entity
     * @param c castle building that will attack the attackable one
     */
    void attackByCastle(Castle c);

}
