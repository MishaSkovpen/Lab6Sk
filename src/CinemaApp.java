
import java.util.Arrays;

public class CinemaApp {
    private static final int NUM_HALLS = 5;
    private static final int NUM_ROWS = 10;
    private static final int NUM_SEATS_PER_ROW = 20;

    private int[][][] cinema;

    public CinemaApp() {

        cinema = new int[NUM_HALLS][NUM_ROWS][NUM_SEATS_PER_ROW];
    }

    public void bookSeats(int hallNumber, int row, int[] seats) {

        for (int seat : seats) {
            cinema[hallNumber][row][seat] = 1;
        }
        System.out.println("Seats booked successfully!");
    }

    public void cancelBooking(int hallNumber, int row, int[] seats) {

        for (int seat : seats) {
            cinema[hallNumber][row][seat] = 0;
        }
        System.out.println("Booking canceled successfully!");
    }

    public boolean checkAvailability(int hallNumber, int numSeats) {

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int seat = 0; seat <= NUM_SEATS_PER_ROW - numSeats; seat++) {
                boolean available = true;
                for (int i = 0; i < numSeats; i++) {
                    if (cinema[hallNumber][row][seat + i] == 1) {
                        available = false;
                        break;
                    }
                }
                if (available) {
                    System.out.println("Seats available in Hall " + hallNumber + ", Row " + row +
                            ", Seats " + seat + " to " + (seat + numSeats - 1));
                    return true;
                }
            }
        }
        System.out.println("Seats not available!");
        return false;
    }

    public void printSeatingArrangement(int hallNumber) {

        System.out.println("Seating Arrangement for Hall " + hallNumber + ":");
        for (int row = 0; row < NUM_ROWS; row++) {
            System.out.println(Arrays.toString(cinema[hallNumber][row]));
        }
    }
}
