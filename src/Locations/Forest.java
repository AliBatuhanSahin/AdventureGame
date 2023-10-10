package Locations;

import Monsters.Vampire;
import Start.Player;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), 3, "firewood");
    }

    @Override
    public void giveReward() {
        player.getInventory().setFirewood(true);
    }

    @Override
    public boolean isCleared() {
        return this.player.getInventory().isFirewood();
    }
}