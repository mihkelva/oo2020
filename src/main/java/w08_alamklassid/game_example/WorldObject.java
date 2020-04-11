package w08_alamklassid.game_example;

public abstract class WorldObject {
    public int x = 5;
    public int y = 10;

    public String getXY(){
        return "x: " + x + " & y: " + y;
    }
}
