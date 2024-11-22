import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PropertyRegister pr = new PropertyRegister();

        pr.addProperty(new Property("Gloppen", 1445, 77, 131, 661.3, "Nicolay Madsen", "Syningom"));
        pr.addProperty(new Property("Gloppen", 1445, 75, 19, 650.6, "Evilyn Jensen", "Fugletun"));
        pr.addProperty(new Property("Gloppen", 1445, 74, 188, 1457.2, "Karl Ove Bråten"));
        pr.addProperty(new Property("Gloppen", 1445, 69, 47, 1339.4, "Elsa Indregård", "Høiberg"));
        pr.addProperty(new Property("Gloppen", 1445, 77, 631, 1017.6, "Jens Olsen"));

        while (true) {
            System.out.println("\nProperty Register Menu:");
            System.out.println("1. Add a new property");
            System.out.println("2. Remove a property");
            System.out.println("3. Find a property by ID");
            System.out.println("4. View all properties");
            System.out.println("5. View amount of properties");
            System.out.println("6. Calculate average property area");
            System.out.println("7. Search by lot number");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter municipality name: ");
                    String municipalityName = sc.nextLine();

                    System.out.print("Enter municipality ID: ");
                    int municipalityID = sc.nextInt();

                    System.out.print("Enter lot number: ");
                    int lotNumber = sc.nextInt();

                    System.out.print("Enter section number: ");
                    int sectionNumber = sc.nextInt();

                    System.out.print("Enter area (m^2): ");
                    double area = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter owner name: ");
                    String ownerName = sc.nextLine();

                    System.out.print("Enter property name (optional, press Enter to skip): ");
                    String name = sc.nextLine();

                    if (name.isEmpty()) {
                        pr.addProperty(new Property(municipalityName, municipalityID, lotNumber, sectionNumber, area, ownerName));
                    } else {
                        pr.addProperty(new Property(municipalityName, municipalityID, lotNumber, sectionNumber, area, ownerName, name));
                    }

                    System.out.println("Property added successfully!");
                    break;

                case 2:
                    System.out.print("Enter property ID to remove (format: municipalityID-lotNumber/sectionNumber): ");
                    String deleteID = sc.nextLine();
                    if (pr.findPropertyByID(deleteID)!=null) {
                        System.out.println("\nProperty with ID: " + deleteID+ " deleted successfully!");
                    } else {
                        System.out.println("\nCould not find property with ID " + deleteID);
                    }
                    pr.deleteProperty(pr.findPropertyByID(deleteID));
                    break;

                case 3:
                    System.out.print("Enter property ID (format: municipalityID-lotNumber/sectionNumber): ");
                    String propertyID = sc.nextLine();
                    if (pr.findPropertyByID(propertyID)!=null) {
                        System.out.println("\n" + pr.findPropertyByID(propertyID).toString());
                    } else {
                        System.out.println("\nCould not find property with ID " + propertyID);
                    }

                    break;

                case 4:
                    System.out.println("\nAll registered properties:");
                    pr.printAll();
                    break;

                case 5:
                    System.out.println("\nAmount of properties: " + pr.propertyCount());
                    break;

                case 6:
                    System.out.println("\nAverage property area: " + pr.avgArea() + " m^2");
                    break;

                case 7:
                    System.out.print("Enter lot number: ");
                    int lotID = sc.nextInt();
                    List<Property> matchingProperties = pr.findPropertiesByLotNumber(lotID);
                    if (matchingProperties.isEmpty()) {
                        System.out.println("\nNo properties found for lot: " + lotID);
                    }else {
                        for (int i = 0; i < matchingProperties.size(); i++) {
                            System.out.println(matchingProperties.get(i).toString());
                        }
                    }

                    break;

                case 8:
                    System.out.println("Exiting program");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
