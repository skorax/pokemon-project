public class Charmeleon extends Charmander implements INoise {
    public Charmeleon(String name, int level) {
        super(name, level);
        type = new FireType();
    }

    @Override
    public void attack(Pokemon other) {
        other.loseLifePoints(100 * level);
        lifePoint += 7;
        levelUp();
    }

    @Override
    public void levelUp() {
        if (lifePoint >= 6 * level) {
            level++;
            System.out.println("Charmeloen levelled up!");
        } else {
            System.out.println("Not enough experience for Charmeloen!");
        }
    }
    @Override
    public int getLevel() {

        return level * 16;
    }

    @Override
    public String makeNoise() {
        return "Chaaarmeeeloeon";
    }
}

