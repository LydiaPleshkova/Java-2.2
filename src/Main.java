// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
            int deposit = 100;
            int amount = 300;
            boolean bigAmount = (amount - 1000) > 0;

            int bonus = (bigAmount) ? amount / 100 : 0;

            System.out.println("Вам был начислен бонус в размере: " + bonus + " рубля(ей). Итого на Вашем счету: " + (deposit + amount + bonus) + " рубля(ей).");
        }
    }