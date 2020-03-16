package w03_klassikomplekt.Game.Character;

public class Character {

    public int x;
    public int y;

    public String slogan = "";

    private String name;
    private CharacterType characterType;
    public Direction direction;


    public Character(String name, CharacterType characterType){
        this.name = name;
        this.characterType = characterType;
        this.direction = Direction.UP;

        this.x = 30;
        this.y = 30;
    }

    @Override
    public String toString() {
        return String.format("My name is %s and I am at X: %d and Y: %d", this.name, this.x, this.y);
    }

    void changeDirection(Direction direction){
        this.direction = direction;
    }

    void move(){
        switch(this.direction) {
            case UP:
                this.y++;
                System.out.println("Character moved up");
                getXY();
                break;
            case DOWN:
                this.y--;
                System.out.println("Character moved down");
                getXY();
                break;
            case LEFT:
                this.x--;
                System.out.println("Character moved left");
                getXY();
                break;
            case RIGHT:
                this.x++;
                System.out.println("Character moved right");
                getXY();
                break;
            default:
                break;
        }
        System.out.println(getXY());
    }

    String getXY(){
        return String.format("%s is at X: %d, Y: %d", this.name, this.x, this.y);
    }
}