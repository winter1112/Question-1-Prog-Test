
package iconsoles;

public class RunApplication {

    public static void main(String[] args) {

        ConsoleSales consoleSales = new ConsoleSales(
                "PS5",
                "Number 1 Electronics",
                5000
        );

        consoleSales.printReport();
    }
}