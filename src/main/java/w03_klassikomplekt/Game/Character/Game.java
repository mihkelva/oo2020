package w03_klassikomplekt.Game.Character;

import java.util.Scanner;

public class Game {

    @Override
    public String toString() {
        return "Game{}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character player = new Character("Mihkel", CharacterType.WARRIOR);
        Character enemy = new Character("Sipsik", CharacterType.WIZARD);

        player.slogan = "Hey";
        player.move();
        player.changeDirection(Direction.DOWN);
        player.move();
        player.move();
        enemy.move();

        String input = "";
        while(!input.equals("end")){
            input = scanner.nextLine();

            if(input.equals("")){
                player.move();
            } else if (input.equals("u")){
                player.changeDirection(Direction.UP);
                player.move();
            } else if (input.equals("d")){
                player.changeDirection(Direction.DOWN);
                player.move();
            } else if (input.equals("l")){
                player.changeDirection(Direction.LEFT);
                player.move();
            } else if (input.equals("r")){
                player.changeDirection(Direction.RIGHT);
                player.move();
            }

            if(player.x == enemy.x && player.y == enemy.y){
                System.out.println("Yay");
            }
        }
    }


}