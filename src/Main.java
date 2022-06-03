public class Main {
    public static void main(String[] args) {

        int ticketPrice = 1650; //стоимость билета
        int money = 20; //количество рублей для одной бонусной милли
        int bonus = ticketPrice / money; //количество начисленных мили

        System.out.println("Количество начисленных мили за купленный билет состовляет:");
        System.out.println((bonus) + " мили");

    }
}
