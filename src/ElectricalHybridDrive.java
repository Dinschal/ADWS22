public class ElectricalHybridDrive extends Ausstattung{
    public Car car;
    public ElectricalHybridDrive(Car car) {
        this.car = car;

    }


    @Override public double getPrice(){

        if (this.car.checkForDiscount()){
            System.out.println("Discount applied");
            return 5000 + this.car.getPrice();}
        return 10000 + this.car.getPrice();
    }
    @Override
    public String toString() {

        return "\n" + "Electrical Hybrid Drive" + this.car.toString();
    }
    @Override public boolean checkForDiscount(){
        return true;
    }


}
