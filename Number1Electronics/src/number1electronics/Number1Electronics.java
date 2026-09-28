
package number1electronics;
public class Number1Electronics {

    public static void main(String[] args) {
        // Single-dimensional arrays for labels
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array: rows = cities, columns = consoles
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Single-dimensional array for total sales per city
        int[] totals = new int[cities.length];

        System.out.println("===== NUMBER 1 ELECTRONICS: YEARLY SALES REPORT =====");

        for (int i = 0; i < cities.length; i++) {
            System.out.println("\nCity: " + cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.println("  " + consoles[j] + ": " + sales[i][j]);
                totals[i] += sales[i][j];
            }
            System.out.println("  Total sales: " + totals[i]);
        }

        // Find the city with the most sales
        int maxIndex = 0;
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > totals[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("\nCity with the most gaming console sales: "
                + cities[maxIndex] + " (" + totals[maxIndex] + ")");
    }
}