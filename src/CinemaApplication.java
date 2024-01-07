
public class CinemaApplication {
    public static void main(String[] args) {
        CinemaApp cinemaApp = new CinemaApp();


        int hallNumber = 0;
        int row = 3;
        int[] seatsToBook = {5, 6, 7, 8};

        cinemaApp.bookSeats(hallNumber, row, seatsToBook);
        cinemaApp.printSeatingArrangement(hallNumber);

        cinemaApp.cancelBooking(hallNumber, row, seatsToBook);
        cinemaApp.printSeatingArrangement(hallNumber);

        cinemaApp.checkAvailability(hallNumber, 3);
    }
}
