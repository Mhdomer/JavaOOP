
import javax.swing.JOptionPane;



public class Calculator {
    public static void main(String[] args) throws Exception {

        String lenghtString, widthString;
        double x, y, xcm, ycm, area1, area2;
        final double conv = 2.54;

        lenghtString = JOptionPane.showInputDialog("Enter length in inches:");
       widthString = JOptionPane.showInputDialog("Enter width in inches:");
        
        x = Double.parseDouble(lenghtString);
        y = Double.parseDouble(widthString);
        
        xcm = x * conv;
        ycm = y * conv;
        area1 = x * y;
        area2 = xcm * ycm;
        
        JOptionPane.showMessageDialog(null, "Length: " + x + " inches (" + xcm + " cm)\n" 
        + "Width: " + y + " inches (" + ycm + " cm)\n" +
           "Area: " + area1 + " sq inches (" + area2 + " sq cm)",
            " Area Calculator",  JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);



    



        
















        
    }
}
