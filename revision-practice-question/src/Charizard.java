public class Charizard extends Pokemon implements INoise {
    public Charizard(String name, int level) {
        super(name, level);
        type = new FireType();

    }

    @Override
    public void attack(Pokemon other) {
        other.loseLifePoints(40 * lifePoint);
        lifePoint += 25;
        levelUp();
    }

    @Override
    public void levelUp() {
        if (lifePoint >= 17 * level) {
            level++;
            System.out.println("Charizard levelled up!");
        } else {
            System.out.println("Not enough experience for Charizard!");
        }
    }

    @Override
    public int getLevel() {

        return level * 60;
    }


    @Override
    public String makeNoise() {
        return "CHHHAAR";
    }
}

