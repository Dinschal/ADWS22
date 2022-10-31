public class MetallicColor extends Ausstattung{
    public Car car;
    public MetallicColor (Car car) {
        this.car = car;
        this.price = 1500;

    }
    @Override public Car getCar(){
        return this.car;
    }
    @Override public double getPrice(){
        return this.price + this.car.getPrice();
    }
    @Override
    public String toString() {

        return "\n" + this.getClass().toString() + this.car.toString() ;
    }
}
