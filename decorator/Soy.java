package decorator;

public class Soy extends CondimentDecorator {
  Beverage beverage;
  
  public Soy() {}
  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + " with Soy";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.30;
  }
}