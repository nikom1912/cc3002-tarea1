package Entidades_tarea1;

public class Villager extends Unit {

    public Villager(){
        super(70,8,120);

    }

    public void attack(Attackable a){
        if(this.isAlive()) {
            a.attackByVillager(this);
        }
    }
    public void attackedByInfantry(Infantry i){
        if(this.isAlive()) {
            double factor = 1.5;
            int damage = (int) (factor * i.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByArcher(Archer a){
        if(this.isAlive()) {
            double factor = 1.5;
            int damage = (int) (factor * a.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByCavalry(Cavalry c){
        if(this.isAlive()) {
            double factor = 1.5;
            int damage = (int) (factor * c.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackBySiege(Siege s){
        if(this.isAlive()) {
            double factor = 1.5;
            int damage = (int) (factor * s.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByVillager(Villager v){
        if(this.isAlive()) {
            double factor = 1.0;
            int damage = (int) (factor * v.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByMonk(Monk m){
        if(this.isAlive()) {
            double factor = -0.5;
            int damage = (int) (factor * m.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByCastle(Castle c){
        if(this.isAlive()) {
            double factor = 1.2;
            int damage = (int) (factor * c.getDMG());
            this.takeDamage(damage);
        }
    }
}
