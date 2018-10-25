package test;

import Entidades_tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CavalryTest {
    private Unit cavalry;
    private Unit cavalry2;
    private Unit infantry;
    private Unit archer;
    private Unit siege;
    private Unit villager;
    private Unit monk;
    private Castle castle;
    private Barracks barracks;

    @Before
    public void setUp(){
        infantry = new Infantry();
        cavalry2 = new Cavalry();
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
        assertEquals(250, cavalry.getHP(), 0.01);
        assertEquals(15, cavalry.getDMG(), 0.01);
        assertEquals(400, cavalry.getHPMax(), 0.01);
    }

    @Test
    public void attackedTest(){
        monk.attack(cavalry);
        assertEquals(265, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(280, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(295, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(310, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(325, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(340, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(355, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(370, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(385, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(400, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(400, cavalry.getHP(), 0.01);
        archer.attack(cavalry);
        assertEquals(400-30, cavalry.getHP(), 0.01);
        siege.attack(cavalry);
        assertEquals(370 - 40, cavalry.getHP(), 0.01);
        cavalry2.attack(cavalry);
        assertEquals(330 - 15, cavalry.getHP(), 0.01);
        infantry.attack(cavalry);
        assertEquals(315 - 36, cavalry.getHP(), 0.01);
        villager.attack(cavalry);
        assertEquals(279 - 4, cavalry.getHP(),0.01 );
        castle.attack(cavalry);
        assertEquals(275 - 48, cavalry.getHP(), 0.01);
        castle.attack(cavalry);
        assertEquals(227- 48, cavalry.getHP(), 0.01);
        castle.attack(cavalry);
        assertEquals(179 - 48, cavalry.getHP(), 0.01);
        castle.attack(cavalry);
        assertEquals(131- 48, cavalry.getHP(), 0.01);
        castle.attack(cavalry);
        assertEquals(83-48, cavalry.getHP(), 0.01);
        castle.attack(cavalry);
        assertEquals(0, cavalry.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(0, cavalry.getHP(), 0.01);
        int castle_hp = castle.getHP();
        cavalry.attack(castle);
        assertEquals(castle_hp, castle.getHP(), 0.01);
    }

    @Test
    public void attackToTest(){
        cavalry.attack(infantry);
        assertEquals(220-15, infantry.getHP(), 0.01);
        cavalry.attack(archer);
        assertEquals(130-22, archer.getHP(), 0.01);
        cavalry.attack(cavalry2);
        assertEquals(250 - 15, cavalry2.getHP(), 0.01);
        cavalry.attack(siege);
        assertEquals(200 - 18, siege.getHP(), 0.01);
        cavalry.attack(villager);
        assertEquals(70 - 22, villager.getHP(), 0.01);
        cavalry.attack(monk);
        assertFalse(monk.isAlive());
        cavalry.attack(castle);
        assertEquals(300-4, castle.getHP(), 0.01);
        cavalry.attack(barracks);
        assertEquals(400- 10, barracks.getHP(), 0.01);
    }
}
