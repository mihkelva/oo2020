package w08_alamklassid.game_example;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        Obstacle obstacle = new Obstacle();
        Character character2 = new Character();

        System.out.println(character.getXY());

        World world = new World();
        world.worldObjects.add(character);
        world.worldObjects.add(obstacle);
        world.worldObjects.add(character2);

        System.out.println(world.worldObjects.size());

        System.out.println(
                world.worldObjects.get(0) + " " +
                world.worldObjects.get(1) + " " +
                world.worldObjects.get(2)
        );
    }
}
