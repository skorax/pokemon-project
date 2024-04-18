public class Pikachu extends Pokemon implements INoise {

    public Pikachu(String name, int level) {
        super(name, level);
        type = new ElectricType();


    }

    @Override
    public void attack(Pokemon other) {
        other.loseLifePoints(6 * level);
        lifePoint += 6;
        levelUp();
    }

    @Override
    public void levelUp() {
        if (lifePoint >= 15 * level) {
            level++;
            System.out.println("Pikachu levelled up!");
        } else {
            System.out.println("Not enough experience for Pikachu!");
        }
    }


    @Override
    public int getLevel() {

        return level * 12;
    }

    @Override
    public String makeNoise() {
        return "Pika Pika";
    }
}

