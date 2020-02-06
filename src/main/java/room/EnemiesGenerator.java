package room;

import character.*;
import spellbook.SpellBook;

import java.util.ArrayList;
import java.util.Collections;

public class EnemiesGenerator {
    private ArrayList<IEnemy> enemies;

    public EnemiesGenerator() {
        this.enemies = new ArrayList<>();
        Bandit bandit = new Bandit("Ramsey Danger", 70, 10, 0);
        Goblin goblin = new Goblin("Minsc", 60, 20, 0);
        Necromancer necromancer = new Necromancer("Ghastreaver", 90, 5, 0);
        Skeletons skeleton = new Skeletons("Skeleton", 60, 10, 0);
        Warlock warlock = new Warlock("Edwin", 30, 3, 0, SpellBook.FIREBALL);
        addFourBandit(bandit);
        addFourGoblin(goblin);
        addFourNecromancer(necromancer);
        addFourSkeletons(skeleton);
        addFourWarlock(warlock);
        randomise();
        removeFromArray();
    }

    public void addEnemies(IEnemy enemy){
        this.enemies.add(enemy);
    }

    public void addFourBandit(Bandit bandit){
        addEnemies(bandit);
        addEnemies(bandit);
        addEnemies(bandit);
        addEnemies(bandit);
    }

    public void addFourGoblin(Goblin goblin){
        addEnemies(goblin);
        addEnemies(goblin);
        addEnemies(goblin);
        addEnemies(goblin);
    }

    public void addFourNecromancer(Necromancer necromancer){
        addEnemies(necromancer);
        addEnemies(necromancer);
        addEnemies(necromancer);
        addEnemies(necromancer);
    }

    public void addFourSkeletons(Skeletons skeletons){
        addEnemies(skeletons);
        addEnemies(skeletons);
        addEnemies(skeletons);
        addEnemies(skeletons);
    }

    public void addFourWarlock(Warlock warlock){
        addEnemies(warlock);
        addEnemies(warlock);
        addEnemies(warlock);
        addEnemies(warlock);
    }

    public void randomise(){
        Collections.shuffle(enemies);
    }

    public ArrayList<IEnemy> removeFromArray(){
      for (int i = 0; i < (enemies.size() - 5); i++){
          enemies.remove(0);
      }
       return enemies;
    }

}
