package room;

import character.IEnemy;
import character.Iplayer;
import loot.Treasure;

import java.util.ArrayList;

public class Room {
    String name;
    Treasure treasure;
    EnemiesGenerator enemies;
    ArrayList<Iplayer> players;

    public Room(String name, ArrayList<Iplayer> players) {
        this.name = name;
        this.treasure = treasure;
        this.enemies = enemies;
        this.players = players;
    }

    public String getName() {
        return name;
    }

//    public ArrayList<Treasure> getTreasure() {
//        return treasure;
//    }

    public int getEnemies() {
        return enemies.enemyCount();
    }

    public ArrayList<Iplayer> getPlayers() {
        return players;
    }
}
