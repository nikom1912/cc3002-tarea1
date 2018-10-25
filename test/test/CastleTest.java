package test;

import Entidades_tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CastleTest {
    private Unit archer;
    private Unit infantry;
    private Unit cavalry;
    private Castle castle2;
    private Unit siege;
    private Unit villager;
    private Unit monk;
    private Castle castle;
    private Barracks barracks;

    @Before
    public void setUp(){
        infantry = new Infantry();
        castle2 = new Castle();
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
        assertEquals(300, castle.getHP(), 0.01);
        assertEquals(40, castle.getDMG(), 0.01);
        assertEquals(500, castle.getHPMax(), 0.01);
    }

    @Test
    public void attackedTest(){
        infantry.attack(castle);
        assertEquals(300 - 9, castle.getHP(), 0.01);
        siege.attack(castle);
        assertEquals(291 - 80, castle.getHP(), 0.01);
        archer.attack(castle);
        assertEquals(211 - 3, castle.getHP(), 0.01);
        cavalry.attack(castle);
        assertEquals(208 - 4, castle.getHP(), 0.01);
        villager.attack(castle);
        assertEquals(204 + 2, castle.getHP(),0.01 );
        castle2.attack(castle);
        assertEquals(206 - 4, castle.getHP(), 0.01);
        monk.attack(castle);
        assertEquals(202, castle.getHP(), 0.01);
        siege.attack(castle);
        assertEquals(202 - 80, castle.getHP(), 0.01);
        siege.attack(castle);
        assertEquals(122 - 80, castle.getHP(), 0.01);
        siege.attack(castle);
        assertEquals(0, castle.getHP(), 0.01);
        int siege_hp = siege.getHP();
        castle.attack(siege);
        assertEquals(siege_hp, siege.getHP(), 0.01);
    }

    @Test
    public void attackToTest(){
        castle.attack(castle2);
        assertEquals(300 - 4, castle2.getHP(), 0.01);
        castle.attack(infantry);
        assertEquals(220 - 48, infantry.getHP(), 0.01);
        castle.attack(cavalry);
        assertEquals(250 - 48, cavalry.getHP(), 0.01);
        castle.attack(siege);
        assertEquals(200 - 20, siege.getHP(), 0.01);
        castle.attack(villager);
        assertEquals(70 - 48, villager.getHP(), 0.01);
        castle.attack(monk);
        assertFalse(monk.isAlive());
        castle.attack(archer);
        assertEquals(130-48, archer.getHP(), 0.01);
        castle.attack(barracks);
        assertEquals(400- 28, barracks.getHP(), 0.01);
    }
}
