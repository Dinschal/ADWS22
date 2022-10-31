public class EntertainmentSystem extends Ausstattung{
    public Car car;
    public EntertainmentSystem(Car car) {
        this.car = car;
        this.price = 3000;

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
}
