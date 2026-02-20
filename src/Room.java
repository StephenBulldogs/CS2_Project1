/**
 * Represents a hotel room with a room number, type, and nightly price.
 *
 *@author Stephen Schwender
 */
public class Room {
    private int roomNum;
    private String roomType;
    private double roomPricePerNight;

    /**
     * Default constructor for Room()
     */
    public Room() {
        roomNum = 0;
        roomType = "King Bed";
        roomPricePerNight = 100.00;
    }

    /**
     * Constructor with Arguments for Room()
     * Creates a room with the number, type, and nightly price.
     *
     * @param roomNum the room number
     * @param roomType the type of room
     * @param roomPricePerNight the nightly rate for the room
     */
    public Room(int roomNum, String roomType, double roomPricePerNight) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.roomPricePerNight = roomPricePerNight;
    }

    /**
     * Returns the room number.
     *
     * @return the room number
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * Sets the room number.
     *
     * @param roomNum the room number to set
     */
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * Returns the type of room.
     *
     * @return the room type
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the type of room.
     *
     * @param roomType the room type to set
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * Returns the nightly price of the room.
     *
     * @return the price per night
     */
    public double getRoomPricePerNight() {
        return roomPricePerNight;
    }

    /**
     * Sets the nightly price of the room.
     *
     * @param roomPricePerNight the price per night to set
     */
    public void setRoomPricePerNight(double roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    /**
     * Returns a string with the room number and type.
     *
     * @return a string of the room
     */
    @Override
    public String toString() {
        return roomNum + " (" + roomType + ")";
    }
}