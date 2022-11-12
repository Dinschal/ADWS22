public class EntertainmentSystem extends Ausstattung{
    public Car car;
    public EntertainmentSystem(Car car) {
        this.car = car;
    }


    @Override public double getPrice(){
        return 3000 + this.car.getPrice();
    }
    @Override
    public String toString() {

        return "\n" + "Entertainment System" + this.car.toString();
    }

    @Override public boolean checkForDiscount(){
        return this.car.checkForDiscount();
    }
}
