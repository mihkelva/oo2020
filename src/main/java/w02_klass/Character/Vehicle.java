package w02_klass.Character;

public class Vehicle {
    private int x;
    private int y;

    private int damageLevel;
    private VehicleType vehicleType;
    private Character character;
    private Color color;

    public Vehicle(Color color, int damageLevel, VehicleType vehicleType, Character character) {
        this.damageLevel = damageLevel;
        this.vehicleType = vehicleType;
        this.character = character;
        this.color = color;

        this.x = (int) (Math.random() * 30) +1;
        this.y = (int) (Math.random() * 30) +1;
    }

    @Override
    public String toString() {
        return color + " " + vehicleType +
                "-> X: " + x +
                ", Y: " + y +
                ". Damage level is on " + damageLevel +
                "! It is driven by " + character.getName();
    }
}
