public class Reservation {
    private Guest guest;
    private int nights;
    private Amenity[] amenities;
    private int amenityCount;
    private Room room;
    private boolean checkedIn;

    public Reservation() {
        guest = new Guest();
        room = new Room();
        nights = 1;
        amenities = new Amenity[100];
        amenityCount = 0;
        checkedIn = false;
    }

    public Reservation(Guest guest, Room room, int nights) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        this.amenities = new Amenity[100];
        this.amenityCount = 0;
        checkedIn = false;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Amenity[] getAmenities() {
        return amenities;
    }

    public void setAmenities(Amenity[] amenities) {
        this.amenities = amenities;
    }

    public int getAmenityCount() {
        return amenityCount;
    }

    public void setAmenityCount(int amenityCount) {
        this.amenityCount = amenityCount;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public void checkIn() {
        if (!checkedIn) {
            checkedIn = true;
        }
    }

    public void checkOut() {
        if (checkedIn) {
            checkedIn = false;
        }
    }

    public void addAmenity(Amenity amenity) {
        if (checkedIn && amenityCount < amenities.length) {
            amenities[amenityCount] = amenity;
            amenityCount++;
        }
    }

    public double calculateTotal() {
        double total = nights * room.getRoomPricePerNight();
        for (int i = 0; i < amenityCount; i++) {
            total += amenities[i].getCost();
        }
        return total;
    }

    public void printBill() {
        if (checkedIn) {
            System.out.println(
                    "Guest must check out before billing.");
            return;
        }

        System.out.println("Guest: " +
                guest.getGuestName());
        System.out.println("Room: " +
                room.toString());
        System.out.println(
                "---------------------------");
        System.out.println("Stay (" + nights +
                " nights): $" +
                String.format("%.2f",
                        nights * room.getRoomPricePerNight()));

        for (int i = 0; i < amenityCount; i++) {
            System.out.println("Amenity: " +
                    amenities[i].getName() + " ($" +
                    String.format("%.2f",
                            amenities[i].getCost()) + ")");
        }

        System.out.println(
                "---------------------------");
        System.out.println("TOTAL DUE: $" +
                String.format("%.2f",
                        calculateTotal()));
        System.out.println();
    }

    @Override
    public String toString() {
        return guest.toString() + ", " +
                room.toString();
    }
}
