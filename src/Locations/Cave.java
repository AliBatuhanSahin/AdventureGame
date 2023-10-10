package Locations;

import Monsters.Zombie;
import Start.Player;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), 3, "food");

    }

    @Override
    public void giveReward() {
        player.getInventory().setFood(true);
    }

    @Override
    public boolean isCleared() {
        return this.player.getInventory().isFood();
    }
}