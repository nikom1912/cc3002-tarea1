package Entidades_tarea1;

public class Archer extends Unit {

    public Archer(){
        super(130,100,300);

    }
    public void attackInfantry(Infantry i){
        double factor = 1.2;
        int damage = (int)(factor* getDMG());
        i.attacked(damage);
    }
    public void attackArcher(Archer a){
        double factor = 1.0;
        int damage = (int)(factor* getDMG());
        a.attacked(damage);
    }
    public void attackCavalry(Cavalry c){
        double factor = 1.0;
        int damage = (int)(factor* getDMG());
        c.attacked(damage);
    }
    public void attackSiege(Siege s){
        double factor = 0.8;
        int damage = (int)(factor* getDMG());
        s.attacked(damage);
    }
    public void attackVillager(Villager v){
        double factor = 1.5;
        int damage = (int)(factor* getDMG());
        v.attacked(damage);
    }
    public void attackMonk(Monk m){

        m.attacked(getDMG());
    }
    public void attackCastle(Castle c){
        double factor = 0.3;
        int damage = (int)(factor* getDMG());
        c.attacked(damage);
    }
    public void attackBarracks(Barracks b){
        double factor = 0.7;
        int damage = (int)(factor* getDMG());
        b.attacked(damage);
    }
}

