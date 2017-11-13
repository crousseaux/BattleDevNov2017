package hydroponie;

import java.util.*;

public class IsoContest {
	public static void main(String[] argv) throws Exception {
		String line;
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, ArrayList<String>> graph = new HashMap<Integer, ArrayList<String>>();

		int count = 0;
		int nbTotal = 0;
		if (sc.hasNextLine())
			nbTotal = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < nbTotal; i++) {
			ArrayList<String> listBool = new ArrayList<String>();
			for (int j = 0; j < nbTotal; j++) {
				listBool.add("false");
			}
			graph.put(i, listBool);
		}

		while (sc.hasNextLine() && count < nbTotal) {
			line = sc.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == 'X') {
					graph.get(count).set(i, "null");
					if (i != 0 && graph.get(count).get(i - 1) != "null") {
						graph.get(count).set(i - 1, "true");
					}
					if (i != line.length() - 1 && graph.get(count).get(i + 1) != "null") {
						graph.get(count).set(i + 1, "true");
					}

					if (count != nbTotal - 1 && graph.get(count + 1).get(i) != "null") {
						graph.get(count + 1).set(i, "true");
						if (i != 0 && graph.get(count + 1).get(i - 1) != "null") {
							graph.get(count + 1).set(i - 1, "true");
						}
						if (i != line.length() - 1 && graph.get(count + 1).get(i + 1) != "null") {
							graph.get(count + 1).set(i + 1, "true");
						}
					}

					if (count != 0 && graph.get(count - 1).get(i) != "null") {
						graph.get(count - 1).set(i, "true");
						if (i != 0 && graph.get(count - 1).get(i - 1) != "null") {
							graph.get(count - 1).set(i - 1, "true");
						}
						if (i != line.length() - 1 && graph.get(count - 1).get(i + 1) != "null") {
							graph.get(count - 1).set(i + 1, "true");
						}
					}

				}
			}
			count++;
		}
		int culti = 0;
		for (int i = 0; i < nbTotal; i++) {
			for (int j = 0; j < nbTotal; j++) {
				if (graph.get(i).get(j) == "true") {
					culti++;
				}
			}
		}
		System.out.println(culti);
	}
}