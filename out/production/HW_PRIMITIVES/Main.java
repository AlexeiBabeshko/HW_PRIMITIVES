public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили
        int ticketCost = 13676;
        int milesPerRub = 20;

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        int miles = ticketCost / milesPerRub;
        System.out.printl("Начислено " + miles + " миль");
        BonusMilesService service = new BonusMilesService();
        int price = 30_000;
        miles = service.calculate(price);
        System.out.println(miles);
    }
}