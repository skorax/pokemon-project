public class Gengar extends Pokemon implements INoise {
    public Gengar(String name, int level) {

        super(name, level);
        type = new GhostType();
    }

    @Override
    public void attack(Pokemon other) {
        other.loseLifePoints(35 * lifePoint);
        lifePoint += 18;
        levelUp();

    }

    @Override
    public void levelUp() {
        if (lifePoint >= 10 * level) {
            level++;
            System.out.println("Gengar levelled up!");
        } else {
            System.out.println("Not enough experience for Gengar!");
        }
    }


    @Override
    public int getLevel() {

        return level * 35;
    }

    @Override
    public String makeNoise() {
        return "Geengaaar";
    }
}

