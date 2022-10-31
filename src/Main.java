public class Main {
  public static void main (String[] args){
      Golf golf = new Golf();
      EntertainmentSystem es = new EntertainmentSystem(golf);
//      AutonomousDrive ad = new AutonomousDrive(es);
      MetallicColor mc = new MetallicColor(es);

      Touran touran = new Touran();
      EntertainmentSystem esT = new EntertainmentSystem(touran);
      AutonomousDrive adT = new AutonomousDrive(esT);
      MetallicColor mcT = new MetallicColor(adT);
      ElectricalHybridDrive ehdT = new ElectricalHybridDrive(mcT);


      Touran discount = new Touran();
      AutonomousDrive adD = new AutonomousDrive(discount);
      ElectricalHybridDrive ehdD = new ElectricalHybridDrive(adD);

      System.out.println("Touran Discount Preis: " + ehdD.getPrice());
      System.out.println("Golf: " + mc.getPrice() + "€" );
      System.out.println("Touran mit allem: " + ehdT.getPrice() + "€");
      System.out.println(ehdT.toString());
    }

}