package Entidades;

public class Infantry extends Unit {

    public Infantry(){
        super(220,70,370);

    }
    public void attackInfantry(Infantry i){
        double factor = 1.0;
        int Damage = (int)(factor* getDMG());
        i.attacked(Damage);
    }
    public void attackArcher(Archer a){
        double factor = 1.2;
        int Damage = (int)(factor* getDMG());
        a.attacked(Damage);
    }
    public void attackCavalry(Cavalry c){
        double factor = 1.2;
        int Damage = (int)(factor* getDMG());
        c.attacked(Damage);
    }
    public void attackSiege(Siege s){
        double factor = 1.2;
        int Damage = (int)(factor* getDMG());
        s.attacked(Damage);
    }
    public void attackVillager(Villager v){
        double factor = 1.5;
        int Damage = (int)(factor* getDMG());
        v.attacked(Damage);
    }
    public void attackMonk(Monk m){
        double factor = 1.0;
        int Damage = (int)(factor* getDMG());
        m.attacked(Damage);
    }
    public void attackCastle(Castle c){
        double factor = 0.3;
        int Damage = (int)(factor* getDMG());
        c.attacked(Damage);
    }
    public void attackBarracks(Barracks b){
        double factor = 0.7;
        int Damage = (int)(factor* getDMG());
        b.attacked(Damage);
    }
}
