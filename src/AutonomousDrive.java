public class AutonomousDrive extends Ausstattung{
    public Car car;
    public AutonomousDrive(Car car) {
        this.car = car;
//        this.price = 15000;
//        checkForDiscount();

    }

//    @Override public Car getCar(){
//        return this.car;
//    }

    @Override public double getPrice(){

        if (this.car.checkForDiscount()){
            System.out.println("Discount applied");
            return 10000 + this.car.getPrice();}
        return 15000 + this.car.getPrice();
    }

    @Override
    public String toString() {

        return "\n" + "Autonomous Drive" + this.car.toString() ;
    }

    @Override public boolean checkForDiscount(){
        return true;
    }

}
