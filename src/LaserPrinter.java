public class LaserPrinter extends Printer implements IPrint<String> {
    public LaserPrinter(String model, boolean colorful) {
        super(model, colorful);
    }

    @Override
    public void print(String content) {
        System.out.println("Напечатанный текст: " + content);
    }

    @Override
    public void charge(String charger) {
        System.out.println("Принтер " + this.getModel() + " заряжен до: " + charger);
    }
}
