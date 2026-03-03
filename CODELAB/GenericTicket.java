public class GenericTicket <T> {
    private T bookingCode;
    private String passengerName;

    public GenericTicket(T bookingCode, String passengerName) {
        this.bookingCode = bookingCode;
        this.passengerName= passengerName;
    }
    public T getBookingCode() {
        return bookingCode;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void displayTicket() {
        System.out.println("Railway ticket information");
        System.out.println("Booking code : " + bookingCode);
        System.out.println("Passenger name : " + passengerName);
        System.out.println("Booking Code Type: " + bookingCode.getClass().getSimpleName());

    }
}

