import java.util.ArrayList;
import java.util.Scanner;

public class CityArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> cities = new ArrayList<>();

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter city names:");
        for (int i = 0; i < n; i++) {
            cities.add(sc.nextLine());
        }

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Append a City");
            System.out.println("2. Insert a City at Index");
            System.out.println("3. Search a City");
            System.out.println("4. Display Cities Starting with a Letter");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter city to append: ");
                    String city = sc.nextLine();
                    cities.add(city);
                    System.out.println("Updated List: " + cities);
                    break;

                case 2:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter city to insert: ");
                    city = sc.nextLine();

                    if (index >= 0 && index <= cities.size()) {
                        cities.add(index, city);
                        System.out.println("Updated List: " + cities);
                    } else {
                        System.out.println("Invalid Index");
                    }
                    break;

                case 3:
                    System.out.print("Enter city to search: ");
                    city = sc.nextLine();

                    int pos = cities.indexOf(city);
                    if (pos != -1) {
                        System.out.println("City Found at Index: " + pos);
                    } else {
                        System.out.println("City Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter starting letter: ");
                    char ch = sc.next().charAt(0);

                    System.out.print("Cities Starting with '" + ch + "': ");
                    boolean found = false;

                    for (String c : cities) {
                        if (Character.toUpperCase(c.charAt(0)) == Character.toUpperCase(ch)) {
                            System.out.print(c + " ");
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.print("No cities found");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Program Ended");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
