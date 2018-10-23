package test;
import Entidades_tarea1.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

public class InfantryTest {
    private Infantry infantry;
    private Unit cavalry;
    private Unit archer;
    private Unit siege;
    private Unit villager;
    private Unit monk;
    private Building castle;
    private Building barracks;

    @Before
    public void setUp(){
        infantry = new Infantry();
        cavalry = new Cavalry();
        archer = new Archer();
        siege = new Siege();
        villager = new Villager();
        monk = new Monk();
        castle = new Castle();
        barracks = new Barracks();
    }

    @Test
    public void attackTest(){
        infantry.attackArcher( archer);
    }
}
