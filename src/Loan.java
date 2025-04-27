package src;

public class Loan {

    private static final double INTEREST = 7.2;
    String type;
    int years;
    double amount;

    public Loan(String type, int years, double amount){
        this.type=type;
        this.years=years;
        this.amount=amount;
    }

    public void setType(String type){
        this.type=type; 
    }

    public void setYear(int years){
        this.years=years;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public String getType(){
        return type;
    }

    public int getYears(){
        return years;
    }

    public double getAmount(){
        return amount;
    }
}

class LoanManager { 

    public Loan createLoan (String type, int years, double amount){
        Loan L = new Loan(type , years , amount );
        return L ; 
    }

    public void updateLoan(Loan ln, String type, int years , double amount){
        ln.setYear(years);
        ln.setAmount(amount);
        ln.setType(type);
    }
}