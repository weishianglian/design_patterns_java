package decorator;

public class Whip extends CondimentDecorator {
  Beverage beverage;

  public Whip() {}
  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + "with Whip";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.25;
  }
}