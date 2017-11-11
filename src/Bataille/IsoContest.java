package Bataille;

import java.util.*;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] cartes = new String[0];

        int nbTotal = 0;
        int count = 0;
        int points = 0;

        if (sc.hasNextLine())
            nbTotal = Integer.parseInt(sc.nextLine());
        sc.close();

        while (sc.hasNextLine() && count < nbTotal) {
            cartes = sc.nextLine().split("\\s+");
            int carteA = Integer.parseInt(cartes[0]);
            int carteB = Integer.parseInt(cartes[1]);

            if (carteA > carteB) {
                points++;
            }
            if (carteA < carteB) {
                points--;
            }
            count++;
        }
        if (points > 0) {
            System.out.println("A");
        } else {
            System.out.println("B");

        }

    }
}

