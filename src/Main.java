public class Main {
  public static void main (String[] args){
      Subscriptions subscriptions = Subscriptions.getInstance();

      Car golf = new MetallicColor(new AutonomousDrive(new EntertainmentSystem(new Golf())));

      Car touran = new ElectricalHybridDrive(new MetallicColor(new AutonomousDrive(new EntertainmentSystem(new Touran()))));
      touran.buySeatHeater();
      touran.buyNavigation();

      Car discount = new ElectricalHybridDrive(new AutonomousDrive(new Touran()));
      discount.buySeatHeater();

      System.out.println("Golf: " + golf.getPrice() + "€" + "\n");
      System.out.println( "Touran Discount Price: " + discount.getPrice() + "€ + " + discount.getSubscriptionPrice() + "€/month" + "\n" );
      System.out.println("Touran with everything: " + touran.getPrice() + "€ + " + touran.getSubscriptionPrice() + "€/month" + "\n");

      subscriptions.setHeaterPrice(27);
      System.out.println("Seat heater is more expensive now because it's winter");
      System.out.println( "Touran Discount Price: " + discount.getPrice() + "€ + " + discount.getSubscriptionPrice() + "€/month" + "\n" );
      System.out.println("Touran with everything: " + touran.getPrice() + "€ + " + touran.getSubscriptionPrice() + "€/month" );
    }

}