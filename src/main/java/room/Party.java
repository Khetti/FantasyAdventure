package room;

import character.Iplayer;

import java.util.ArrayList;

public class Party {

    private ArrayList<Iplayer> party;

    public Party() {
        this.party = new ArrayList<>();
    }

    public void addPlayerToParty(Iplayer player) {
        this.party.add(player);
    }

}
