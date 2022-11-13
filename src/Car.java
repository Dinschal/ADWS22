public interface Car {
  Subscriptions subscriptions = Subscriptions.getInstance();

  double getPrice();
  double getSubscriptionPrice();
  void buySeatHeater();
  void buyNavigation();
  void unsubSeatHeater();
  void unsubNavigation();
  String toString();

 boolean checkForDiscount();
}
