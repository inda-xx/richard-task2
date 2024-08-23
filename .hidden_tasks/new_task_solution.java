tatements
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RobotTest {
    private Robot robot1;
    private Robot robot2;

    @Before
    public void setUp() {
        robot1 = new Robot("Robot1", 100, 20, 10);
        robot2 = new Robot("Robot2", 100, 15, 8);
    }

    @Test
    public void testGetName() {
        assertEquals("Robot1", robot1.getName());
        assertEquals("Robot2", robot2.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, robot1.getHealth());
        assertEquals(100, robot2.getHealth());
    }

    @Test
    public void testGetAttackPower() {
        assertEquals(20, robot1.getAttackPower());
        assertEquals(15, robot2.getAttackPower());
    }

    @Test
    public void testGetDefense() {
        assertEquals(10, robot1.getDefense());
        assertEquals(8, robot2.getDefense());
    }

    @Test
    public void testGetIsDisabled() {
        assertEquals(false, robot1.getIsDisabled());
        assertEquals(false, robot2.getIsDisabled());
    }

    @Test
    public void testSetName() {
        robot1.setName("NewRobot1");
        assertEquals("NewRobot1", robot1.getName());
    }

    @Test
    public void testSetHealth() {
        robot1.setHealth(200);
        assertEquals(200, robot1.getHealth());
    }

    @Test
    public void testSetAttackPower() {
        robot1.setAttackPower(30);
        assertEquals(30, robot1.getAttackPower());
    }

    @Test
    public void testSetDefense() {
        robot1.setDefense(15);
        assertEquals(15, robot1.getDefense());
    }

    @Test
    public void testSetIsDisabled() {
        robot1.setIsDisabled(true);
        assertEquals(true, robot1.getIsDisabled());
    }

    @Test
    public void testAttack() {
        robot1 = new Robot("Robot1", 100, 20, 10);
        robot2 = new Robot("Robot2", 100, 15, 8);
        robot1.attack(robot2);
        assertEquals(98, robot2.getHealth()); // As attack is 20 and defense is 8, damage should be 20/8=2, and thus Health should reduce by 2 from 100 to 98
        assertEquals(false, robot2.getIsDisabled());
    }

    @Test
    public void testDisabledAfterAttack() {
        robot1 = new Robot("Robot1", 100, 500, 10); //Setting attack power to higher number to disable the robot2
        robot2 = new Robot("Robot2", 100, 15, 8);
        robot1.attack(robot2);
        assertEquals(true, robot2.getIsDisabled());
    }
}