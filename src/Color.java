package src;

public enum Color {

    RED("FF0000"), GREEN("00FF00"), BLUE("0000FF");

    private String hexcode;

    private Color(String hexcode) {
        this.hexcode = hexcode;
    }

    public String getHexCode() {
        return hexcode;
    }

    public static void main(String[] a) {
        System.out.println("Starting to iterate over Color enum values...");
        for (Color color : Color.values()) {
            System.out.println("Processing color: " + color);
            System.out.println("Ordinal: " + color.ordinal());
            System.out.println("Hex Code: " + color.getHexCode());
            System.out.println((color.ordinal() + 1) + ") " + color + " has code " + color.getHexCode());
            System.out.println("Finished processing color: " + color);
        }
        System.out.println("Finished iterating over Color enum values.");
    }
}
