import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Guest g1 = new Guest("Lucifer");
        Room r1 = new Room(666,"Lava Pit Suite", 150.00);
        Reservation res1 = new Reservation(g1, r1, 3);

        Guest g2 = new Guest("Waldo");
        Room r2 = new Room(404,"King Room", 120.00);
        Reservation res2 = new Reservation(g2, r2, 2);

        while (true) {
            System.out.println("Check in guests? (y/n): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                if (res1.isCheckedIn() == false) {
                    handleCheckIn(scanner, res1);
                }

                if (res2.isCheckedIn() == false) {
                    handleCheckIn(scanner, res2);
                }
            } else {
                System.out.println("Check out guests? (y/n): ");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    if (res1.isCheckedIn() == true) {
                        handleCheckOut(scanner, res1);
                    }

                    if (res2.isCheckedIn() == true) {
                        handleCheckOut(scanner, res2);
                    }
                } else {
                    System.out.println("Close Program? (y/n): ");
                    input = scanner.nextLine();
                    if (input.equalsIgnoreCase("y")) {
                        break;
                    }
                }
            }
        }

    }

    public static void handleCheckIn(Scanner scanner, Reservation reservation) {

        System.out.println(reservation.toString());
        System.out.println("---------------------------");

        System.out.println("Check in " + reservation.getGuest() + " (y/n): ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("y")) {
            reservation.checkIn();
            System.out.println(reservation.getGuest() + " Checked In");
        }
    }

    public static void handleCheckOut(Scanner scanner, Reservation reservation) {

        System.out.println(reservation.toString());
        System.out.println("---------------------------");
        System.out.println("Begin Checkout? (press any key to continue): ");
        String input = scanner.nextLine();

        while (true) {
            System.out.println("Add amenity? (y/n): ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("y")) {
                break;
            }

            System.out.println("Amenity name: ");
            String name = scanner.nextLine();
            System.out.println("Amenity cost: ");
            double cost =
                    Double.parseDouble(
                            scanner.nextLine());

            reservation.addAmenity(
                    new Amenity(name, cost));
        }

        System.out.println("Check out guest? (y/n): ");
        input = scanner.nextLine();

        if (input.equalsIgnoreCase("y")) {
            reservation.checkOut();
        }

        System.out.println("Print bill for this guest? (y/n): ");
        input = scanner.nextLine();

        if (input.equalsIgnoreCase("y")) {
            reservation.printBill();
        }
    }
}
