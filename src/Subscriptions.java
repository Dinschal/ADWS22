public final class Subscriptions {
    private static Subscriptions INSTANCE;
    private double sitzheitzungPreis;
    private double navigationPreis;

    private Subscriptions(){
    }

    public static Subscriptions getSubscriptions(){
        if(INSTANCE == null){
            INSTANCE = new Subscriptions();
        }
        return INSTANCE;
    }
    public double getSitzheitzungPreis(){
        return sitzheitzungPreis;
    }
    public double getnavigationPreis(){
        return navigationPreis;
    }
    public void setHeaterPrice(){

    }
}
