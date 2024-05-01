public class Main {
    public static void main(String[] args) {
        int na_schete = 100;
        int popolnenie = 1000;
        int summa_za_1_bonus = 100;
        int minimalnaya_summa = 1000;
        int nachislenie = popolnenie;
        int bonus = 0;
        if (popolnenie >= minimalnaya_summa) {
            bonus = popolnenie / summa_za_1_bonus;
        }

        nachislenie = nachislenie + bonus;
        na_schete = na_schete + nachislenie;

        System.out.println("На счете: " + na_schete);
        System.out.println("Сумма бонусов: " + bonus);
    }
}