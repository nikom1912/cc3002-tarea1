package Entidades_tarea1;

/** Atacker.java
 * class for entities that can attack others
 * @author nikom
 */
public interface Attacker{

    /**
     * This method represents an attack of
     * an attacker on an infantry unit
     * @param i infantry unit that will be "attack" by the Attacker
     */
    public void attackInfantry(Infantry i);

    /**
     * This method models an attack of
     * an attacker on an archer unit
     * @param a archer unit that will be "attack" by the Attacker
     */
    public void attackArcher(Archer a);

    /**
     * This method models an attack of
     * an attacker on a cavalry unit
     * @param c cavalry unit that will be "attack" by the Attacker
     */
    public void attackCavalry(Cavalry c);

    /**
     * This method models an attack of
     * an attacker on a siege unit
     * @param s siege unit that will be "attack" by the Attacker
     */
    public void attackSiege(Siege s);

    /**
     * This method models an attack of
     * an attacker on a villager unit
     * @param v villager unit that will be "attack" by the Attacker
     */
    public void attackVillager(Villager v);

    /**
     * This method represents an attack of
     * an attacker on a monk unit
     * @param m monk unit that will be "attack" by the Attacker
     */
    public void attackMonk(Monk m);

    /**
     * This method represents an attack of
     * an attacker on a castle building.
     * @param c castle building that will be "attack" by the Attacker
     */
    public void attackCastle(Castle c);

    /**
     * This method represents an attack of
     * an attacker on a barracks building
     * @param b barracks building unit that will be "attack" by the Attacker
     */
    public void attackBarracks(Barracks b);
}