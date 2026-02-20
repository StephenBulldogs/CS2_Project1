public class Room {
    private int roomNum;
    private String roomType;
    private double roomPricePerNight;

    public Room() {
        roomNum = 0;
        roomType = "King Bed";
        roomPricePerNight = 100.00;
    }

    public Room(int roomNum, String roomType, double roomPricePerNight) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.roomPricePerNight = roomPricePerNight;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPricePerNight() {
        return roomPricePerNight;
    }

    public void setRoomPricePerNight(double roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    @Override
    public String toString() {
        return roomNum + " (" + roomType + ")";
    }
}
