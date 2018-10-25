package test;

import Entidades_tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonkTest {
    private Unit monk2;
    private Unit infantry;
    private Unit cavalry;
    private Unit archer;
    private Unit monk;
    private Unit siege;
    private Unit villager;
    private Castle castle;
    private Barracks barracks;

    @Before
    public void setUp(){
        siege = new Siege();
        infantry = new Infantry();
        cavalry = new Cavalry();
        archer = new Archer();
        monk2 = new Monk();
        villager = new Villager();
        monk = new Monk();
        castle = new Castle();
        barracks = new Barracks();
    }

    @Test
    public void attributesTest(){
        assertEquals(1, monk.getHP(), 0.01);
        assertEquals(30, monk.getDMG(), 0.01);
        assertEquals(2, monk.getHPMax(), 0.01);
    }

    @Test
    public void attackedByMonkTest(){
        monk2.attack(monk);
        assertEquals(2, monk.getHP(), 0.01);
    }

    @Test
    public void attackedByInfantryTest(){
        infantry.attack(monk);
        assertFalse(monk.isAlive());
    }

    @Test
    public void attackedByArcherTest(){
        archer.attack(monk);
        assertFalse(monk.isAlive());
    }

    @Test
    public void attackedByCavalryTest(){
        cavalry.attack(monk);
        assertFalse(monk.isAlive());
    }
    @Test
    public void attackedBySiegeTest(){
        siege.attack(monk);
        assertFalse(monk.isAlive());
    }

    @Test
    public void attackedByVillagerTest(){
        villager.attack(monk);
        assertTrue(monk.isAlive());
    }

    @Test
    public void attackedByCastleTest(){
        castle.attack(monk);
        assertFalse(monk.isAlive());
    }

    @Test
    public void attackToTest(){
        monk.attack(monk2);
        assertEquals(2, monk2.getHP(), 0.01);
        monk.attack(archer);
        assertEquals(130 + 15, archer.getHP(), 0.01);
        monk.attack(cavalry);
        assertEquals(250 + 15, cavalry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(220 + 15, infantry.getHP(), 0.01);
        monk.attack(siege);
        assertEquals(200 , siege.getHP(), 0.01);
        monk.attack(villager);
        assertEquals(70 +15, villager.getHP(), 0.01);
        monk.attack(castle);
        assertEquals(300, castle.getHP(), 0.01);
        monk.attack(barracks);
        assertEquals(400, barracks.getHP(), 0.01);
    }
}
