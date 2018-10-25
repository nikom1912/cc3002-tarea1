package Entidades_tarea1;

/**Barracks.java
 * barracks buildings
 * @author nicolas machuca
 */
public class Barracks extends Building{
    public Barracks(){
        super(400, 600);
    }
    public void attackedByInfantry(Infantry i){
        if(this.isAlive()) {
            double factor = 0.7;
            int damage = (int) (factor * i.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByArcher(Archer a){
        if(this.isAlive()) {
            double factor = 0.7;
            int damage = (int) (factor * a.getDMG());
            this.takeDamage(damage);
        }
    }
    public void attackByCavalry(Cavalry c){
        if(this.isAlive()) {
            double factor = 0.7;
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
            double factor = -0.7;
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
            double factor = 0.7;
            int damage = (int) (factor * c.getDMG());
            this.takeDamage(damage);
        }
    }
}
