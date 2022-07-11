public abstract class Car implements Printable{

    private ColorEnum colorEnum;

    public Car(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }


}
