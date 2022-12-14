public final class Subscriptions {
    private static Subscriptions INSTANCE;
    private double seatHeaterPrice = 17;
    private double navigationPrice = 10;

    private Subscriptions(){
    }

    public static Subscriptions getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Subscriptions();
        }
        return INSTANCE;
    }
    public double getSeatHeaterPrice(){
        return seatHeaterPrice;
    }
    public double getNavigationPrice(){
        return navigationPrice;
    }
    public void setHeaterPrice(double newPrice){
        this.seatHeaterPrice = newPrice;
    }
    public void setNavigationPrice(double newPrice){
        this.navigationPrice = newPrice;
    }

}
