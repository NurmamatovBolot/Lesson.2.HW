public class Lamborghini extends Car{

    private String engine;

    public Lamborghini(ColorEnum colorEnum, String engine) {
        super(colorEnum);
        this.engine = engine;
    }

    @Override
    public void print() {
        System.out.println(getColorEnum() + " " + getEngine());
    }

    public String getEngine() {
        return engine;
    }


}
