public abstract class Ausstattung implements Car{
    protected Car car;
    @Override public double getPrice(){
        return this.car.getPrice();
    }

}
