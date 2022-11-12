public class MetallicColor extends Ausstattung{
    public Car car;
    public MetallicColor (Car car) {
        this.car = car;
  }
    @Override public double getPrice(){
        return 1500 + this.car.getPrice();
    }
    @Override
    public String toString() {

        return "\n" + "Metallic Color" + this.car.toString() ;
    }

    @Override public boolean checkForDiscount(){
        return this.car.checkForDiscount();
    }
}
