public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 59.0;
        double growth = 1.78;
        double bim = service.calculate( weight , growth);
        System.out.println(bim);
    }
}