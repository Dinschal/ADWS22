public class Main {
  public static void main (String[] args){
      Car golf = new MetallicColor(new AutonomousDrive(new EntertainmentSystem(new Golf())));

      Car touran = new ElectricalHybridDrive(new MetallicColor(new AutonomousDrive(new EntertainmentSystem(new Touran()))));

      Car discount = new ElectricalHybridDrive(new AutonomousDrive(new Touran()));

      System.out.println("Touran Discount Preis: " + discount.getPrice());
      System.out.println("Golf: " + golf.getPrice() + "€" );
      System.out.println("Touran mit allem: " + touran.getPrice() + "€");
      System.out.println(touran);
    }

}