package Task3;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 10, 5, 3);
    }

    @Override
    void attack(Character opponent) {
        int newOpHealth = opponent.getHealth() - this.getStrength();
        opponent.setHealth(newOpHealth);
    }
}