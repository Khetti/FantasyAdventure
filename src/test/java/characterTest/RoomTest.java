package characterTest;

import character.Iplayer;
import character.Thief;
import org.junit.Before;
import org.junit.Test;
import room.EnemiesGenerator;
import room.Room;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private Thief thief;
    private ArrayList<Iplayer> players;

    @Before
    public void before(){
        thief = new Thief("thief", 60, 20, 0);
        players.add(thief);
        room = new Room("level1", players);
    }

    @Test
    public void hasFiveEnemies(){
        assertEquals(5, room.getEnemies());
    }
}
