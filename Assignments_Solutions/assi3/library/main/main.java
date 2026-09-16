package library.main;

import library.model.Book;
import library.model.DigitalResource;
import library.model.LibraryResource;
import library.util.InputValidator;

public class LibraryMain {

    public static void main(String[] args) {

        LibraryResource[] resources = new LibraryResource[5];

        resources[0] = new Book(1, "Java Programming", "James Gosling");
        resources[1] = new Book(2, "Data Structures", "Mark Allen");
        resources[2] = new DigitalResource(3, "Machine Learning PDF", "Andrew Ng");
        resources[3] = new DigitalResource(4, "AI Research Paper", "Ian Goodfellow");
        resources[4] = new Book(5, "Operating Systems", "Galvin");

        System.out.println("Library: " + LibraryResource.getLibraryName());
        System.out.println();

        // Display details
        for (LibraryResource resource : resources) {

            if (resource instanceof library.model.Printable) {
                library.model.Printable printable =
                        (library.model.Printable) resource;

                printable.printDetails();
            }
        }

        // Calculate total fine
        int[] overdueDays = {5, 2, 10, 3, 7};

        double totalFine = 0;

        for (int i = 0; i < resources.length; i++) {

            if (InputValidator.isValidFineDays(overdueDays[i])) {

                double fine =
                        resources[i].calculateFine(overdueDays[i]);

                totalFine += fine;
            }
        }

        System.out.println("Total Fine: Rs. " + totalFine);

        System.out.println();

        LibraryResource.displayTotalResources();
    }
}