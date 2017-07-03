package labextracredit;
import java.awt.Font;
// David Guerrero
// 10/20/2016
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdDraw;

public class ReaderEXTRACREDIT {

	In input = new In("file:world_cities.txt");

	// create array list
	static ArrayList<City> cityList = new ArrayList<City>();

	public static void main(String[] args) {
		// open file
		In input = new In("world_cities.txt");

		try {
			// write output to file
			FileWriter fw = new FileWriter("cities_population.txt");
			PrintWriter pw = new PrintWriter(fw);

			int line = 0;

			// iterate through all lines in the file
			while (line < 47913) {
				// read line
				String cityLine = input.readLine();

				String[] parts = cityLine.split(",");

				// increase counter
				line += 1;

				// create variables for the object
				String countrycode = parts[0];
				String city = parts[1];
				String region = parts[2];
				int population = Integer.parseInt(parts[3]);
				double latitude = Double.parseDouble(parts[4]);
				double longitude = Double.parseDouble(parts[5]);

				// create instance
				cityList.add(new City(countrycode, city, region, population, latitude, longitude));

			}

			// creates a new comparison
			Collections.sort(cityList, new Comparator<City>() {

				// sorts by population in descending order
				@Override
				public int compare(City pop1, City pop2) {
					return Integer.valueOf(pop2.population).compareTo(pop1.population);
				}

			});

			// sorts by city name in descending alphabetical order
			// @Override
			// public int compare(City name1, City name2) {
			// name1.city.toLowerCase();
			// name2.city.toLowerCase();
			// return String.valueOf(name1.city).compareTo(name2.city);
			// }
			//
			// });

			// sorts by latitude in ascending order
			// @Override
			// public int compare(City lat1, City lat2) {
			// return Double.valueOf(lat1.latitude).compareTo(lat2.latitude);
			// }
			//
			// });

			// prints all objects line by line and saves them to file
			// for (line = 0; line < cityList.size(); line++) {
			// System.out.println(cityList.get(line));
			// pw.println(cityList.get(line));
			// }

			// close the file
			pw.close();
		}

		// what is printed when there is an error when saving to file
		catch (Exception e) {
			System.out.println("ERROR!");
		}

		// close the file
		input.close();

		drawMap();

	}

	public static void drawMap() {
		// draws map
		int WINDOW_WIDTH = 720;
		int WINDOW_HEIGHT = 360;
		StdDraw.setCanvasSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		StdDraw.setXscale(0, WINDOW_WIDTH);
		StdDraw.setYscale(0, WINDOW_HEIGHT);
		StdDraw.picture(WINDOW_WIDTH / 2, WINDOW_HEIGHT / 2, "file:world.png");
		Font font1 = new Font("Arial", Font.BOLD, 10);
		StdDraw.setFont(font1);

		// prints the squares
		for (int counter = 0; counter < 50; counter++) {
			StdDraw.setXscale(-180, 180);
			StdDraw.setYscale(-90, 90);
			StdDraw.setFont(font1);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledSquare(cityList.get(counter).longitude, cityList.get(counter).latitude, 2);
			StdDraw.pause(200);
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledSquare(cityList.get(counter).longitude, cityList.get(counter).latitude, 2);
			StdDraw.pause(200);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledSquare(cityList.get(counter).longitude, cityList.get(counter).latitude, 2);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledSquare(cityList.get(counter).longitude, cityList.get(counter).latitude, 2);
			StdDraw.pause(200);
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledSquare(cityList.get(counter).longitude, cityList.get(counter).latitude, 2);
			StdDraw.pause(200);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledSquare(cityList.get(counter).longitude, cityList.get(counter).latitude, 2);
			StdDraw.pause(100);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(cityList.get(counter).longitude + 15, cityList.get(counter).latitude, cityList.get(counter).city);
			StdDraw.pause(100);

		}
	}

	// quickSort method
	public static void quickSort(int[] a, int p, int r) {
		if (p < r) {
			int q = Partition(a, p, r);
			quickSort(a, p, q - 1);
			quickSort(a, q + 1, r);
		}
	}

	// partition method
	private static int Partition(int[] a, int p, int r) {
		int x = a[r];

		int i = p - 1;
		int temp = 0;

		for (int j = p; j < r; j++) {
			if (a[j] <= x) {
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		temp = a[i + 1];
		a[i + 1] = a[r];
		a[r] = temp;
		return (i + 1);
	}

}
