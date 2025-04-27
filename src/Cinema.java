package src;

public class Cinema {
    private String name;
    private Seat[][] seats;

    // Constructor to initialize the cinema with given name, rows, and columns
    public Cinema(String name, int rows, int cols) {
        this.name = name;
        this.seats = new Seat[rows][cols];
        // Initialize seats
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Create a new Seat object for each seat in the cinema
                seats[i][j] = new Seat();
            }
        }
    }

    // Method to reserve a seat at given row and column
    public void reserveSeat(int row, int col) {
        // Mark the seat as reserved
        seats[row - 1][col - 1].setReserved(true);
    }

    // Method to print the seating plan of the cinema
    public void printSeats() {
        System.out.println("Seating Plan for " + name + ":");
        // Iterate over each row of seats
        for (Seat[] row : seats) {
            // Iterate over each seat in the row
            for (Seat seat : row) {
                // Print the seat status (reserved or available)
                System.out.print(seat + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }

    // Method to get the number of rows in the cinema
    public int getRowCount() {
        return seats.length;
    }

    // Method to get the number of columns in the cinema
    public int getColumnCount() {
        // Assuming all rows have the same number of columns
        return seats[0].length;
    }

    // Main method
    public static void main(String[] args) {
        // Creating two cinema halls
        Cinema cinema1 = new Cinema("Cinema Hall 1", 5, 7);
        Cinema cinema2 = new Cinema("Cinema Hall 2", 4, 6);

        // Reserving some seats
        cinema1.reserveSeat(3, 4);
        cinema1.reserveSeat(1, 2);
        cinema2.reserveSeat(2, 3);
        cinema2.reserveSeat(4, 5);

        // Printing seating plan for each cinema hall
        cinema1.printSeats();
        System.out.println();
        cinema2.printSeats();

        // Getting the number of rows and columns for each cinema hall
        System.out.println("Number of rows in Cinema 1: " + cinema1.getRowCount());
        System.out.println("Number of columns in Cinema 1: " + cinema1.getColumnCount());
        System.out.println("Number of rows in Cinema 2: " + cinema2.getRowCount());
        System.out.println("Number of columns in Cinema 2: " + cinema2.getColumnCount());
    }
}
