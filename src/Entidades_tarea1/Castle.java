package Entidades_tarea1;

public class Castle extends Building implements Attacker {

    private int DMG;

    public Castle(){
        super(300, 500);
        DMG = 40;
    }
    public int getDMG(){
        return DMG;
    }
    public void attack(Attackable a){
        if(this.isAlive()) {
            a.attackByCastle(this);
        }
    }
    public void attackedByInfantry(Infantry i){
        if(this.isAlive()) {
            double factor = 0.3;
            int damage = (int) (factor * i.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByArcher(Archer a){
        if(this.isAlive()) {
            double factor = 0.1;
            int damage = (int) (factor * a.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByCavalry(Cavalry c){
        if(this.isAlive()) {
            double factor = 0.3;
            int damage = (int) (factor * c.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackBySiege(Siege s){
        if(this.isAlive()) {
            double factor = 2.0;
            int damage = (int) (factor * s.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByVillager(Villager v){
        if(this.isAlive()) {
            double factor = -0.3;
            int damage = (int) (factor * v.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByMonk(Monk m){
        if(this.isAlive()) {
            double factor = 0;
            int damage = (int) (factor * m.getDMG());
            this.takeDamage(damage);
        }
    }

    public void attackByCastle(Castle c){
        if(this.isAlive()) {
            double factor = 0.1;
            int damage = (int) (factor * c.getDMG());
            this.takeDamage(damage);
        }
    }

}
