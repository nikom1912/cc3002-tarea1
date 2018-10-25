package Entidades_tarea1;

public interface Attackable {
    int getHP();
    void takeDamage(int DMG);
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
