public class Guest {
    private String guestName;

    public Guest() {
        guestName = "John Doe";
    }

    public Guest(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    @Override
    public String toString() {
        return "Guest:" + guestName;
    }
}
