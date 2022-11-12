public class ElectricalHybridDrive extends Ausstattung{
    public Car car;
    public ElectricalHybridDrive(Car car) {
        this.car = car;
//        this.price = 10000;
//        checkForDiscount();
    }
//    @Override public Car getCar(){
//        return this.car;
//    }

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


//    private void checkForDiscount(){
//        if(this.car != null){
//            Car feature = this.car;
//            while (!(feature instanceof Golf) || !(feature instanceof Touran) ){
//                if (this.car instanceof AutonomousDrive){
//                    this.price -= 5000;
//                    System.out.println("Discount applied");
//                }else{
//                    feature = feature.getCar();
//                    System.out.println("Discount denied");
//                };
//            }}}
}
