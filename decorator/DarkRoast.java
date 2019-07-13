package decorator;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark Roast Coffe";
  }

  public double cost() {
    return 1.49;
  }
}