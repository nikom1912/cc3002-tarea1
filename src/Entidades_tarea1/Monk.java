package Entidades_tarea1;

public class Monk extends Unit {
    public Monk(){
        super(1,30,2);

    }
    public void attack(Attackable a){
        if(this.isAlive()) {
            a.attackByMonk(this);
        }
    }
    public void attackedByInfantry(Infantry i){
        if(this.isAlive()) {
            this.takeDamage(2);
        }
    }
    public void attackByArcher(Archer a){
        if(this.isAlive()) {
            this.takeDamage(2);
        }
    }
    public void attackByCavalry(Cavalry c){
        if(this.isAlive()) {
            this.takeDamage(2);
        }
    }
    public void attackBySiege(Siege s){
        if(this.isAlive()) {
            this.takeDamage(2);
        }
    }
    public void attackByVillager(Villager v){
        if(this.isAlive()) {
            this.takeDamage(0);
        }
    }
    public void attackByMonk(Monk m){
        if(this.isAlive()) {
            this.takeDamage(-2);
        }
    }
    public void attackByCastle(Castle c){
        if(this.isAlive()) {
            this.takeDamage(2);
        }
    }
}
