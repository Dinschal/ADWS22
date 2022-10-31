public class Car {

    protected double price;
    public Car(){

    }

    public double getPrice()
    {
        return this.price;
    }

    @Override
    public String toString() {

        return "\n" + this.getClass().toString();
    }

    public Car getCar(){
        return this;
    }

}
