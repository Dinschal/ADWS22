
public class Touran implements Car{

    public boolean naviActive = false;
    public boolean seatHeaterActive = false;
    public Touran() {

    }
    @Override public String toString(){
        return "\n" + "Touran";
    }
    @Override public double getPrice(){
        return 30000;
    }

    @Override public boolean checkForDiscount(){
        return false;
    }
}
