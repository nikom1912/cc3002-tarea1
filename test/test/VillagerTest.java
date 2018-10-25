package test;

import Entidades_tarea1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VillagerTest {
    private Unit villager2;
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
        villager2 = new Villager();
        villager = new Villager();
        monk = new Monk();
        castle = new Castle();
        barracks = new Barracks();
    }

    @Test
    public void attributesTest(){
        assertEquals(70, villager.getHP(), 0.01);
        assertEquals(8, villager.getDMG(), 0.01);
        assertEquals(120, villager.getHPMax(), 0.01);
    }

    @Test
    public void attackedTest(){
        monk.attack(villager);
        assertEquals(85, villager.getHP(), 0.01);
        monk.attack(villager);
        assertEquals(100, villager.getHP(), 0.01);
        monk.attack(villager);
        assertEquals(115, villager.getHP(), 0.01);
        monk.attack(villager);
        assertEquals(120, villager.getHP(), 0.01);
        archer.attack(villager);
        assertEquals(120-45, villager.getHP(), 0.01);
        infantry.attack(villager);
        assertEquals(75 - 45, villager.getHP(), 0.01);
        villager2.attack(villager);
        assertEquals(30 - 8, villager.getHP(), 0.01);
        monk.attack(villager);
        assertEquals(22 + 15, villager.getHP(), 0.01);
        cavalry.attack(villager);
        assertEquals(37 - 22, villager.getHP(), 0.01);
        monk.attack(villager);
        assertEquals(15 + 15, villager.getHP(), 0.01);
        monk.attack(villager);
        assertEquals(30 + 15, villager.getHP(), 0.01);
        monk.attack(villager);
        assertEquals(45 + 15, villager.getHP(), 0.01);
        monk.attack(villager);
        assertEquals(60 + 15, villager.getHP(), 0.01);
        siege.attack(villager);
        assertEquals(15, villager.getHP(),0.01 );
        castle.attack(villager);
        assertEquals(0, villager.getHP(), 0.01);
        monk.attack(villager);
        assertEquals(0, villager.getHP(), 0.01);
        int castle_hp = castle.getHP();
        villager.attack(castle);
        assertEquals(castle_hp, castle.getHP(), 0.01);
    }

    @Test
    public void attackToTest(){
        villager.attack(villager2);
        assertEquals(70-8, villager2.getHP(), 0.01);
        villager.attack(archer);
        assertEquals(130-8, archer.getHP(), 0.01);
        villager.attack(cavalry);
        assertEquals(250 - 4, cavalry.getHP(), 0.01);
        villager.attack(infantry);
        assertEquals(220 - 6, infantry.getHP(), 0.01);
        villager.attack(siege);
        assertEquals(200 +4, siege.getHP(), 0.01);
        villager.attack(monk);
        assertTrue(monk.isAlive());
        villager.attack(castle);
        assertEquals(300 + 2, castle.getHP(), 0.01);
        villager.attack(barracks);
        assertEquals(400 + 5, barracks.getHP(), 0.01);
    }
}
