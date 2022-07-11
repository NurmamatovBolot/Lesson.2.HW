public class Main {

    private static Lamborghini lamborghini;
    private static Ferrari ferrari;
    private static Porsche porsche;

    public static void main(String[] args) {

        String[] s = {"lamborghini", "ferrari", "porsche"};

        for (int i = 0; i < s.length; i++) {
            createObject(s[i]);
        }

        Car[] cars = {lamborghini, ferrari, porsche};

        for (int i = 0; i < cars.length; i++) {
            cars[i].print();
        }
    }

    public static Car createObject(String classname) {
        switch (classname) {
            case "lamborghini":
                lamborghini = new Lamborghini(ColorEnum.BLACK, "V10");
            case "ferrari":
                ferrari = new Ferrari(ColorEnum.GREEN, "SF90 STRADALE");
            case "porsche":
                porsche = new Porsche(ColorEnum.WHITE, 2020);
            default:
                return null;

        }
    }
}