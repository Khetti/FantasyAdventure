package room;

import character.IEnemy;
import character.Iplayer;
import loot.Treasure;

import java.util.ArrayList;

public class room {
    String name;
    Treasure treasure;
    EnemiesGenerator enemies;
    ArrayList<Iplayer> players;

    public room(String name, ArrayList<Iplayer> players) {
        this.name = name;
        this.treasure = treasure;
        this.enemies = enemies;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasure;
    }

    public ArrayList<IEnemy> getEnemies() {
        return enemies;
    }

    public ArrayList<Iplayer> getPlayers() {
        return players;
    }
}
