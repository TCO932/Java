package Task3;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Character {
    private String name;
    private int strength;
    private int agility;
    private int intelligence;
    @Setter(AccessLevel.NONE)
    private int health = 100;


    public Character(String name, int strength, int agility, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public Character(String name) {
        this.name = name;
        this.strength = 5;
        this.agility = 5;
        this.intelligence = 5;
    }

    public void setHealth(int health) {
        this.health = Math.max(health, 0);
    }

    abstract void attack(Character opponent);
}