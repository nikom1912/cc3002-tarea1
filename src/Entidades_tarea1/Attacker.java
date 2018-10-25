package Entidades_tarea1;

/** Atacker.java
 * class for entities that can attack others
 * @author nikom
 */
public interface Attacker {
    int getHP();
    boolean isAlive();
    void attack(Attackable a);
}