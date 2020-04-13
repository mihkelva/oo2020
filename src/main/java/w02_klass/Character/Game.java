package w02_klass.Character;

public class Game {

    public static void main(String[] args) {
        Character user = new Character("Mihkel", CharacterType.WARRIOR);
        user.slogan = "Hey";

        Vehicle firstVehicle = new Vehicle(Color.RED, 20, VehicleType.CAR, user );

        System.out.println(firstVehicle);
    }
}