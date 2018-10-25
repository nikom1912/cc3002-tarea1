package test;
import Entidades_tarea1.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InfantryTest {
    private Unit infantry;
    private Unit infantry2;
    private Unit cavalry;
    private Unit archer;
    private Unit siege;
    private Unit villager;
    private Unit monk;
    private Castle castle;
    private Barracks barracks;

    @Before
    public void setUp(){
        infantry = new Infantry();
        infantry2 = new Infantry();
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
        assertEquals(220, infantry.getHP(), 0.01);
        assertEquals(30, infantry.getDMG(), 0.01);
        assertEquals(370, infantry.getHPMax(), 0.01);
    }

    @Test
    public void attackedTest(){
        monk.attack(infantry);
        assertEquals(235,infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(250,infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(265,infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(280,infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(295,infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(310,infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(325,infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(340,infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(355,infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(370,infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(370,infantry.getHP(), 0.01);
        archer.attack(infantry);
        assertEquals(370-36, infantry.getHP(), 0.01);
        siege.attack(infantry);
        assertEquals(334 - 60, infantry.getHP(), 0.01);
        infantry2.attack(infantry);
        assertEquals(274 - 30,infantry.getHP(), 0.01);
        cavalry.attack(infantry);
        assertEquals(244 - 15, infantry.getHP(), 0.01);
        villager.attack(infantry);
        assertEquals(229 - 6, infantry.getHP(),0.01 );
        castle.attack(infantry);
        assertEquals(223 - 48, infantry.getHP(), 0.01);
        castle.attack(infantry);
        assertEquals(175 - 48, infantry.getHP(), 0.01);
        castle.attack(infantry);
        assertEquals(127 - 48, infantry.getHP(), 0.01);
        castle.attack(infantry);
        assertEquals(79- 48, infantry.getHP(), 0.01);
        castle.attack(infantry);
        assertEquals(0, infantry.getHP(), 0.01);
        castle.attack(infantry);
        assertEquals(0, infantry.getHP(), 0.01);
        monk.attack(infantry);
        assertEquals(0,infantry.getHP(), 0.01);
        int castle_hp = castle.getHP();
        infantry.attack(castle);
        assertEquals(castle_hp, castle.getHP(), 0.01);
    }

    @Test
    public void attackToTest(){
        infantry.attack(infantry2);
        assertEquals(220-30, infantry2.getHP(), 0.01);
        infantry.attack(archer);
        assertEquals(130-36, archer.getHP(), 0.01);
        infantry.attack(cavalry);
        assertEquals(250 - 36, cavalry.getHP(), 0.01);
        infantry.attack(siege);
        assertEquals(200 - 36, siege.getHP(), 0.01);
        infantry.attack(villager);
        assertEquals(70 - 45, villager.getHP(), 0.01);
        infantry.attack(monk);
        assertFalse(monk.isAlive());
        infantry.attack(castle);
        assertEquals(300-9, castle.getHP(), 0.01);
        infantry.attack(barracks);
        assertEquals(400- 21, barracks.getHP(), 0.01);
    }
}
