package test;
import Entidades_tarea1.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArcherTest {
    private Unit archer;
    private Unit infantry;
    private Unit cavalry;
    private Unit archer2;
    private Unit siege;
    private Unit villager;
    private Unit monk;
    private Castle castle;
    private Barracks barracks;

    @Before
    public void setUp(){
        infantry = new Infantry();
        archer2 = new Archer();
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
        assertEquals(130, archer.getHP(), 0.01);
        assertEquals(30, archer.getDMG(), 0.01);
        assertEquals(250, archer.getHPMax(), 0.01);
    }

    @Test
    public void attackedTest(){
        monk.attack(archer);
        assertEquals(145,archer.getHP(), 0.01);
        monk.attack(archer);
        assertEquals(160,archer.getHP(), 0.01);
        monk.attack(archer);
        assertEquals(175,archer.getHP(), 0.01);
        monk.attack(archer);
        assertEquals(190,archer.getHP(), 0.01);
        monk.attack(archer);
        assertEquals(205,archer.getHP(), 0.01);
        monk.attack(archer);
        assertEquals(220,archer.getHP(), 0.01);
        monk.attack(archer);
        assertEquals(235,archer.getHP(), 0.01);
        monk.attack(archer);
        assertEquals(250,archer.getHP(), 0.01);
        monk.attack(archer);
        assertEquals(250,archer.getHP(), 0.01);
        infantry.attack(archer);
        assertEquals(250-36, archer.getHP(), 0.01);
        siege.attack(archer);
        assertEquals(214 - 60, archer.getHP(), 0.01);
        archer2.attack(archer);
        assertEquals(154 - 36,archer.getHP(), 0.01);
        cavalry.attack(archer);
        assertEquals(118 - 22, archer.getHP(), 0.01);
        villager.attack(archer);
        assertEquals(96 - 8, archer.getHP(),0.01 );
        castle.attack(archer);
        assertEquals(88 - 48, archer.getHP(), 0.01);
        castle.attack(archer);
        assertEquals(0, archer.getHP(), 0.01);
        castle.attack(archer);
        assertEquals(0, archer.getHP(), 0.01);
        monk.attack(archer);
        assertEquals(0,archer.getHP(), 0.01);
        int castle_hp = castle.getHP();
        archer.attack(castle);
        assertEquals(castle_hp, castle.getHP(), 0.01);
    }

    @Test
    public void attackToTest(){
        archer.attack(archer2);
        assertEquals(130-36, archer2.getHP(), 0.01);
        archer.attack(infantry);
        assertEquals(220 - 36, infantry.getHP(), 0.01);
        archer.attack(cavalry);
        assertEquals(250 - 30, cavalry.getHP(), 0.01);
        archer.attack(siege);
        assertEquals(200 - 24, siege.getHP(), 0.01);
        archer.attack(villager);
        assertEquals(70 - 45, villager.getHP(), 0.01);
        archer.attack(monk);
        assertFalse(monk.isAlive());
        archer.attack(castle);
        assertEquals(300-3, castle.getHP(), 0.01);
        archer.attack(barracks);
        assertEquals(400- 21, barracks.getHP(), 0.01);
    }
}
