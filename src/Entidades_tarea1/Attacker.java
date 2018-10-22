package Entidades;

public interface Attacker{
    public int getHP();
    public boolean isAlive();
    public void attackInfantry(Infantry i);
    public void attackArcher(Archer a);
    public void attackCavalry(Cavalry c);
    public void attackSiege(Siege s);
    public void attackVillager(Villager v);
    public void attackMonk(Monk m);
    public void attackCastle(Castle c);
    public void attackBarracks(Barracks b);
}
