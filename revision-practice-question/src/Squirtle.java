public class Squirtle extends Pokemon implements INoise {
    public Squirtle(String name, int level) {

        super(name, level);
        type = new WaterType();
    }

    @Override
    public void attack(Pokemon other) {

    }

    @Override
    public void levelUp() {

    }

    @Override
    public String makeNoise() {
        return "Squirtle Squirt";
    }
}
