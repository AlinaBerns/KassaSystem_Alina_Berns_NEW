package be.intecbrussel;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Random random = new Random();

        int brood = random.nextInt(100);
        int melk = random.nextInt(100);
        int water = random.nextInt(100);
        int choco = random.nextInt(100);
        int sum = 0;
        int user = 200;
        int aantal = 1;

        System.out.println("Uw balans is: "+user);
        System.out.println("Welk product je wil toevoegen aan zijn winkel wagen");
        String product;
        String product_1;

        do {

            product = in.nextLine();
            product_1 = product.toLowerCase(Locale.ROOT);

            switch (product_1) {

                case "brood":
                    System.out.println("Prijs van brood " + brood + " euro");
                    sum += brood;

                    if (sum>user){
                        System.out.println("Helaas kun je niet meer in de winkelwagen.\nBetalen voor de producten.\nDruk op <afrekenen>");
                        System.out.println("Aantal producten: " + aantal++);
                    }else{
                        System.out.println("Nog iets anders?");
                        System.out.println("Aantal producten: " + aantal++);
                    }
                    break;

                case "melk":
                    System.out.println("Prijs van melk " + melk + " euro");
                    sum += melk;

                    if (sum>user){
                        System.out.println("Helaas kun je niet meer in de winkelwagen.\nBetalen voor de producten.\nDruk op <afrekenen>");
                        System.out.println("Aantal producten: " + aantal++);
                    }else{
                        System.out.println("Nog iets anders?");
                        System.out.println("Aantal producten: " + aantal++);
                    }
                    break;

                case "water":
                    System.out.println("Prijs van " + water + " euro");
                    sum += water;
                    if (sum>user){
                        System.out.println("Helaas kun je niet meer in de winkelwagen.\nBetalen voor de producten.\nDruk op <afrekenen>");
                        System.out.println("Aantal producten: " + aantal++);
                    }else{
                        System.out.println("Nog iets anders?");
                        System.out.println("Aantal producten: " + aantal++);
                    }
                    break;

                    case "choco":
                        System.out.println("Prijs van " + choco + " euro");
                        sum += choco;
                        if (sum>user){
                            System.out.println("Helaas kun je niet meer in de winkelwagen. \nBetalen voor de producten.\nDruk op <afrekenen>");
                            System.out.println("Aantal producten: " + aantal++);
                        }else{
                            System.out.println("Nog iets anders?");
                            System.out.println("Aantal producten: " + aantal++);
                        }
                        break;

                    default:
                        System.out.println(" ");
                        break;
            }

        } while (!product.equals("afrekenen"));

        System.out.println("Jouw winkel wagen: " + sum+" euro\nBedankt voor de aankoop");
        System.out.println("Uw balans is: "+(user-sum));
    }
}
