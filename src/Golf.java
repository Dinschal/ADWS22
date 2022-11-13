public class Golf implements Car{

    public boolean naviActive = false;
    public boolean seatHeaterActive = false;
    public Golf() {
    }

    @Override public String toString(){
        String message = "\n" + "Golf";
        if (naviActive){
            message += "\n" + "Navigation subscription" ;
        }
        if (seatHeaterActive){
            message += "\n" + " Seat Heater subscription";
        }
        return message;
    }
    @Override public double getPrice(){
        return 20000;}

    @Override public double getSubscriptionPrice(){
        double monthlyFee = 0;
        if (this.seatHeaterActive){
            monthlyFee += subscriptions.getSeatHeaterPrice();
        }
        if (this.naviActive){
            monthlyFee += subscriptions.getNavigationPrice();
        }
        return monthlyFee;
    }
    @Override public void buySeatHeater(){
        this.seatHeaterActive = true;
    }
    @Override public void buyNavigation(){
        this.naviActive = true;
    }
    @Override public void unsubSeatHeater(){
        this.seatHeaterActive = false;
    }
    @Override public void unsubNavigation(){
        this.naviActive = false;
    }
    @Override public boolean checkForDiscount(){
        return false;
    }
}
