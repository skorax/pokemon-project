public class Psyduck extends Pokemon implements INoise{
    public Psyduck(String name, int level) {
        super (name, level);
        type = new WaterType();
        }
    public void attack(Pokemon other){
        other.loseLifePoints(3 * level);
        lifePoint += 1;
        levelUp();

    }

    @Override
    public void levelUp() {
        if (lifePoint >= 2 * level) {
            level++;
            System.out.println("Psyduck levelled up!");
        } else {
            System.out.println("Not enough experience for Psyduck!");
        }
    }


    @Override
    public int getLevel() {

        return level * 5;
    }

    @Override
    public String makeNoise() {
        return "Psy~~~duck";
    }
}
