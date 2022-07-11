public class Ferrari extends Car{

    private String model;

    public Ferrari(ColorEnum colorEnum, String model) {
        super(colorEnum);
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println(getColorEnum() + " " + getModel());
    }

    public String getModel() {
        return model;
    }


}
