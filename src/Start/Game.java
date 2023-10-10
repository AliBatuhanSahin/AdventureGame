package Start;

import Locations.Cave;
import Locations.Forest;
import Locations.River;
import Locations.Mine;
import Locations.EquipmentShop;
import Locations.SafeHouse;
import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    Player player;

    Location location;

    public void Start() {
        System.out.print("Enter a NickName: ");
        String playerName = input.nextLine();

        Player player = new Player(playerName);

        System.out.println("Hello " + player.getName() + ".");

        player.selectCharacter();

        Location location = null;

        while(true) {
            System.out.println("--------------------------------");
            player.printPlayerStats();
            System.out.println("--------------------------------");
            System.out.println("1. Safe House --> a safe zone with no enemies in sight");
            System.out.println("\n2. Equipment Shop --> you can buy weapons and armor here");
            System.out.println("\n3. Cave --> reward <food> you may encounter zombies");
            System.out.println("\n4. Forest --> reward <firewood> you may encounter vampires");
            System.out.println("\n5. River --> reward <water> you may encounter bears");
            System.out.println("\n6. Mine --> reward <null> you may encounter snakes");
            System.out.println("\n0. Quit Start.Game");
            System.out.print("\nWhere would you like to go: ");
            int selectLocation = input.nextInt();

            switch(selectLocation){

                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new EquipmentShop(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    location= new SafeHouse(player);
            }

            if(location == null) {
                System.out.println("All has been lost.");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}