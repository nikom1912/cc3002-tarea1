package Entidades_tarea1;

public class Castle extends Building implements Attacker {

    private int DMG;

    public Castle(){
        super(300, 500);
        DMG = 100;
    }
    public int getDMG(){
        return DMG;
    }
    public void attackInfantry(Infantry i){
        double factor = 1.2;
        int damage = (int)(factor* getDMG());
        i.attacked(damage);
    }
    public void attackArcher(Archer a){
        double factor = 1.2;
        int damage = (int)(factor* getDMG());
        a.attacked(damage);
    }
    public void attackCavalry(Cavalry c){
        double factor = 1.2;
        int damage = (int)(factor* getDMG());
        c.attacked(damage);
    }
    public void attackSiege(Siege s){
        double factor = 0.5;
        int damage = (int)(factor* getDMG());
        s.attacked(damage);
    }
    public void attackVillager(Villager v){
        double factor = 1.2;
        int damage = (int)(factor* getDMG());
        v.attacked(damage);
    }
    public void attackMonk(Monk m){
        m.attacked(getDMG());
    }
    public void attackCastle(Castle c){
        double factor = 0.1;
        int damage = (int)(factor* getDMG());
        c.attacked(damage);
    }
    public void attackBarracks(Barracks b){
        double factor = 0.7;
        int damage = (int)(factor* getDMG());
        b.attacked(damage);
    }

}
