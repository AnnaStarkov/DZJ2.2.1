public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
//        int bonus = service.calculate(1000_60);
//        System.out.println(bonus);
//        int bonus1 = service.calculate(1000);
//        System.out.println(bonus1);
    }
}