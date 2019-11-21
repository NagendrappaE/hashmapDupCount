package com.evolvus.mapwithshop;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App {

	static String REDC = "RED";
	static String BLUEC = "BLUE";
	static String BLACKC = "BLACK";

	static String SMALL = "SMALL";
	static String MEDIUM = "MEDIUM";
	static String LARGE = "LARGE";

	public static void main(String[] args) {
		System.out.println("Hello World!");

		// storing the clothes with diffrent color(red,blue,black) with diffrent
		// size(Large,medium,small)

		ArrayList<Shop> storeList = new ArrayList<Shop>();

		storeList.add(new Shop(REDC, "SMALL"));
		storeList.add(new Shop(REDC, "LARGE"));
		storeList.add(new Shop(REDC, "SMALL"));
		storeList.add(new Shop(REDC, "MEDIUM"));
		storeList.add(new Shop(REDC, "MEDIUM"));
		storeList.add(new Shop(BLUEC, "SMALL"));
		storeList.add(new Shop(BLUEC, "MEDIUM"));
		storeList.add(new Shop(BLUEC, "MEDIUM"));
		storeList.add(new Shop(BLACKC, "SMALL"));
		storeList.add(new Shop(BLACKC, "MEDIUM"));
		storeList.add(new Shop(BLACKC, "MEDIUM"));
		storeList.add(new Shop(REDC, "SMALL"));
		storeList.add(new Shop(REDC, "SMALL"));
		storeList.add(new Shop(REDC, "SMALL"));
		int redwithsmall = 0;
		int redwithlarge = 0;

		int redwithmedium = 0;

		
		//main logic  counting the shirt color with diffrent size
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		for (Shop t : storeList) {
			if (t.getColor().equals(REDC) && t.getSize().equals("SMALL")) {

				tmap.put("RED WITH SMALL", ++redwithsmall);
			} else if (t.getColor().equals(REDC) && t.getSize().equals("MEDIUM")) {
				tmap.put("RED WITH MEDIUM", ++redwithmedium);

			} else if (t.getColor().equals(REDC) && t.getSize().equals("LARGE")) {
				tmap.put("RED WITH LARGE", ++redwithlarge);

			}

			// similarly for BLUE and BLACK as above

		}

		// printi the count of respective color and size
		for (Map.Entry m : tmap.entrySet()) {

			System.out.println("the color " + m.getKey() + "\t the size count " + m.getValue());

		}


	}
}
