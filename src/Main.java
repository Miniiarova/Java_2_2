public class Main {
    public static void main(String[] args) {
        int currentAmount = 100; //на счете
        int replenishment = 1000; //пополнение
        int amountPerBonus = 100; //сумма за 1 бонус
        int minimalAmount = 1000; //минимальная сумма

        int bonus = 0;
        if (replenishment >= minimalAmount) {
            bonus = replenishment / amountPerBonus;
        }

        int newAmount = currentAmount + replenishment + bonus;

        System.out.println("На счете: " + newAmount);
        System.out.println("Сумма бонусов: " + bonus);
    }
}