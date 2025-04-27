package src;

public class Seat {
    private boolean reserved;

    // Method to set the seat as reserved
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    // Method to represent the seat as a string (X for reserved, - for available)
    @Override
    public String toString() {
        return reserved ? "X" : "-";
    }
}