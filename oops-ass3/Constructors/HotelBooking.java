class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

   
    public HotelBooking() {
        this("Unknown", "Standard", 1);
    }


    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

   
    public HotelBooking(HotelBooking booking) {
        this(booking.guestName, booking.roomType, booking.nights);
    }

    public void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}