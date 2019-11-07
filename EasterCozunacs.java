import java.util.Scanner;

public class EasterCozunacs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double price1KGFloor = Double.parseDouble(scanner.nextLine());

        double eggPackPrice = price1KGFloor * 0.75;
        double price1LMilk = price1KGFloor * 1.25;
        double priceforQuarterLMilk = price1LMilk / 4;

        double totalPriceForOneCozunac = price1KGFloor + eggPackPrice + priceforQuarterLMilk;
        int eggsCount = 0;
        int cozunacsCount = 0;
        while (totalPriceForOneCozunac <= budget) {
            cozunacsCount++;
            eggsCount +=3;
            if (cozunacsCount % 3 == 0) {
                eggsCount -= cozunacsCount - 2;
            }



            budget -= totalPriceForOneCozunac;
        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.", cozunacsCount, eggsCount, budget);
    }
}
