package w02_klass.Character;

public class Character {

    private int x;
    private int y;

    public String slogan = "";

    private int age;
    private boolean special;
    public String dyingNoise;
    private Sex gender;

    private String name;
    private CharacterType characterType;
    private Direction direction;

    public Character(String name, CharacterType characterType){
        this.name = name;
        this.characterType = characterType;

        this.x = 30;
        this.y = 30;
    }

    public String getName() {
        return name;
    }
}