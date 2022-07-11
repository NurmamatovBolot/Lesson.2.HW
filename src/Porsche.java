public class Porsche extends Car{

    private int year;

    public Porsche(ColorEnum colorEnum, int year) {
        super(colorEnum);
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println(getColorEnum() + " " + getYear());
    }

    public int getYear() {
        return year;
    }


}
