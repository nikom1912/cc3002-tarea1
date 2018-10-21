package Entidades;

public interface Attacker{
    public int getHP();
    public void attack(Attackable a);
    public boolean isAlive();
}
