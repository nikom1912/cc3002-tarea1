package test;

import Entidades_tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SiegeTest {
    private Unit siege2;
    private Unit infantry;
    private Unit cavalry;
    private Unit archer;
    private Unit siege;
    private Unit villager;
    private Unit monk;
    private Castle castle;
    private Barracks barracks;

    @Before
    public void setUp(){
        siege2 = new Siege();
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
    public void attributesTest(){
        assertEquals(200, siege.getHP(), 0.01);
        assertEquals(40, siege.getDMG(), 0.01);
        assertEquals(320, siege.getHPMax(), 0.01);
    }

    @Test
    public void attackedTest(){
        monk.attack(siege);
        assertEquals(200, siege.getHP(), 0.01);
        archer.attack(siege);
        assertEquals(200-24, siege.getHP(), 0.01);
        infantry.attack(siege);
        assertEquals(176 - 36, siege.getHP(), 0.01);
        siege2.attack(siege);
        assertEquals(140 - 60, siege.getHP(), 0.01);
        cavalry.attack(siege);
        assertEquals(80 - 18, siege.getHP(), 0.01);
        villager.attack(siege);
        assertEquals(62 +4, siege.getHP(),0.01 );
        castle.attack(siege);
        assertEquals(66 - 20, siege.getHP(), 0.01);
        castle.attack(siege);
        assertEquals(46 - 20, siege.getHP(), 0.01);
        castle.attack(siege);
        assertEquals(26-20, siege.getHP(), 0.01);
        castle.attack(siege);
        assertEquals(0, siege.getHP(), 0.01);
        villager.attack(siege);
        assertEquals(0, siege.getHP(),0.01 );
        int castle_hp = castle.getHP();
        siege.attack(castle);
        assertEquals(castle_hp, castle.getHP(), 0.01);
    }

    @Test
    public void attackToTest(){
        siege.attack(siege2);
        assertEquals(200-60, siege2.getHP(), 0.01);
        siege.attack(archer);
        assertEquals(130-60, archer.getHP(), 0.01);
        siege.attack(cavalry);
        assertEquals(250 - 40, cavalry.getHP(), 0.01);
        siege.attack(infantry);
        assertEquals(220 - 60, infantry.getHP(), 0.01);
        siege.attack(villager);
        assertEquals(70 - 60, villager.getHP(), 0.01);
        siege.attack(monk);
        assertFalse(monk.isAlive());
        siege.attack(castle);
        assertEquals(300-80, castle.getHP(), 0.01);
        siege.attack(barracks);
        assertEquals(400- 80, barracks.getHP(), 0.01);
    }
}
