package Entidades_tarea1;

public class Monk extends Unit {
    public Monk(){
        super(1,70,2);

    }
    public void attackInfantry(Infantry i){
        double factor = -0.5;
        int damage = (int)(factor* getDMG());
        i.attacked(damage);
    }
    public void attackArcher(Archer a){
        double factor = -0.5;
        int damage = (int)(factor* getDMG());
        a.attacked(damage);
    }
    public void attackCavalry(Cavalry c){
        double factor = -0.5;
        int damage = (int)(factor* getDMG());
        c.attacked(damage);
    }
    public void attackSiege(Siege s){
        double factor = 0.0;
        int damage = (int)(factor* getDMG());
        s.attacked(damage);
    }
    public void attackVillager(Villager v){
        double factor = -0.5;
        int damage = (int)(factor* getDMG());
        v.attacked(damage);
    }
    public void attackMonk(Monk m){
        double factor = -0.5;
        int damage = (int) factor* getDMG();
        m.attacked(damage);
    }
    public void attackCastle(Castle c){
        double factor = 0.0;
        int damage = (int)(factor* getDMG());
        c.attacked(damage);
    }
    public void attackBarracks(Barracks b){
        double factor = 0.0;
        int damage = (int)(factor* getDMG());
        b.attacked(damage);
    }
}
