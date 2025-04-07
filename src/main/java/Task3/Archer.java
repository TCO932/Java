package Task3;

public class Archer extends Character {
    public Archer(String name) {
        super(name, 3, 10, 5);
    }

    @Override
    void attack(Character opponent) {
        int newOpHealth = opponent.getHealth() - this.getAgility();
        opponent.setHealth(newOpHealth);
    }
}