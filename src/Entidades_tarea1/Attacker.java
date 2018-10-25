package Entidades_tarea1;

/** Attacker.java
 * class for entities that can attack others
 * @author nikom
 */
public interface Attacker{
    /**
     *models an attack from an a attacker
     * on a attackable entity
     * @param a entity that will be attack
     */
    void attack(Attackable a);
    /** base damage that an attacker one can do
     * @return Unit's damage points
     */
    int getDMG();
}