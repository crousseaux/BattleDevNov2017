package prixPlusBas;

import java.util.*;

public class IsoContest {
	public static void main(String[] argv) throws Exception {
		Scanner sc = new Scanner(System.in);

		int nbTotal = 0;
		if (sc.hasNextLine())
			nbTotal = Integer.parseInt(sc.nextLine());
		String produitRecherche = "";
		if (sc.hasNextLine())
			produitRecherche = (sc.nextLine());

		int count = 0;

		int min = -1;
		int currentMin = 0;
		String[] produitString = new String[0];

		while (sc.hasNextLine() && count < nbTotal) {
			produitString = sc.nextLine().split("\\s+");
			String produit = produitString[0];
			int prix = Integer.parseInt(produitString[1]);
			if (produit.equals(produitRecherche)) {
				currentMin = prix;
				if (min == -1) {
					min = currentMin;
				}
				if (currentMin < min) {
					min = currentMin;
				}
			}
		}
		System.out.println(min);
	}
}
