import java.util.ArrayList;

class TicketBooking {
    ArrayList<Integer> tickets = new ArrayList<>();

    TicketBooking() {
        for (int i = 1; i <= 5; i++) {
            tickets.add(i);
        }
    }

    synchronized void bookTicket(String customer) {
        if (tickets.size() > 0) {
            int ticket = tickets.remove(0);
            System.out.println(customer + " booked Ticket " + ticket);
        } else {
            System.out.println(customer + " could not book a ticket. No tickets available.");
        }
    }
}
class BookingCounter implements Runnable {
    TicketBooking booking;
    String customer;
    BookingCounter(TicketBooking booking, String customer) {
        this.booking = booking;
        this.customer = customer;
    }
    
    public void run() {
        booking.bookTicket(customer);
    }
}

public class yayy {
    public static void main(String[] args)
            throws InterruptedException {

        TicketBooking booking = new TicketBooking();

        Thread t1 = new Thread(
            new BookingCounter(booking, "Customer 1"));
        Thread t2 = new Thread(
            new BookingCounter(booking, "Customer 2"));
        Thread t3 = new Thread(
            new BookingCounter(booking, "Customer 3"));
        Thread t4 = new Thread(
            new BookingCounter(booking, "Customer 4"));
        Thread t5 = new Thread(
            new BookingCounter(booking, "Customer 5"));
        Thread t6 = new Thread(
            new BookingCounter(booking, "Customer 6"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
    }
}