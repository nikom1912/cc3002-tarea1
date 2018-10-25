package test;

import Entidades_tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarracksTest {
    private Unit infantry;
    private Unit cavalry;
    private Unit archer;
    private Unit villager;
    private Unit siege;
    private Unit monk;
    private Castle castle;
    private Barracks barracks;

    @Before
    public void setUp(){
        siege = new Siege();
        infantry = new Infantry();
        cavalry = new Cavalry();
        archer = new Archer();
        villager = new Villager();
        monk = new Monk();
        castle = new Castle();
        barracks = new Barracks();
    }

    @Test
    public void attributesTest(){
        assertEquals(400, barracks.getHP(), 0.01);
        assertEquals(600, barracks.getHPMax(), 0.01);
    }

    @Test
    public void attackedTest(){
        monk.attack(barracks);
        assertEquals(400, barracks.getHP(), 0.01);
        archer.attack(barracks);
        assertEquals(400 - 21, barracks.getHP(), 0.01);
        infantry.attack(barracks);
        assertEquals(379 -21 , barracks.getHP(), 0.01);
        cavalry.attack(barracks);
        assertEquals(358 - 10, barracks.getHP(), 0.01);
        siege.attack(barracks);
        assertEquals(348 - 80, barracks.getHP(),0.01 );
        castle.attack(barracks);
        assertEquals(268 - 28, barracks.getHP(), 0.01);
        monk.attack(barracks);
        assertEquals(240, barracks.getHP(), 0.01);
        villager.attack(barracks);
        assertEquals(240 + 5, barracks.getHP(), 0.01);
    }
}
