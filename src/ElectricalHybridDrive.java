public class ElectricalHybridDrive extends Ausstattung{
    public Car car;
    public ElectricalHybridDrive(Car car) {
        this.car = car;
        this.price = 10000;
        checkForDiscount();
    }
    @Override public Car getCar(){
        return this.car;
    }

    @Override public double getPrice(){
        return this.price + this.car.getPrice();
    }
    @Override
    public String toString() {

        return "\n" + this.getClass().toString() + this.car.toString();
    }



    private void checkForDiscount(){
        if(this.car != null){
            Car feature = this.car;
            while (!(feature instanceof Golf) || !(feature instanceof Touran) ){
                if (this.car instanceof AutonomousDrive){
                    this.price -= 5000;
                    System.out.println("Discount applied");
                }else{
                    feature = feature.getCar();
                    System.out.println("Discount denied");
                };
            }}}
}
