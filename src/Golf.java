public class Golf implements Car{
    public Golf() {
    }

    @Override public String toString(){
        return "\n" + "Golf";
    }
    @Override public double getPrice(){
        return 20000;
    }

    @Override public boolean checkForDiscount(){
        return false;
    }
}
