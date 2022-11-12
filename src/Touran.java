
public class Touran implements Car{

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
