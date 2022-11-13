public class EntertainmentSystem extends Ausstattung{
    protected Car car;
    public EntertainmentSystem(Car car) {
        this.car = car;
    }


    @Override public double getPrice(){
        return 3000 + this.car.getPrice();
    }
    @Override public double getSubscriptionPrice(){
        return this.car.getSubscriptionPrice();
    }
    @Override public void buySeatHeater(){
        this.car.buySeatHeater();
    }
    @Override public void buyNavigation(){
        this.car.buyNavigation();
    }
    @Override public void unsubSeatHeater(){
        this.car.unsubSeatHeater();
    }
    @Override public void unsubNavigation(){
        this.car.unsubNavigation();
    }
    @Override
    public String toString() {

        return "\n" + "Entertainment System" + this.car.toString();
    }

    @Override public boolean checkForDiscount(){
        return this.car.checkForDiscount();
    }
}
