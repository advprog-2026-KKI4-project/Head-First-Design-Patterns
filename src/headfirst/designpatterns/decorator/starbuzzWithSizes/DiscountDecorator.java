package headfirst.designpatterns.decorator.starbuzzWithSizes;

public class DiscountDecorator extends CondimentDecorator {
	Beverage beverage;

	public DiscountDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 10% Discount";
	}

	public double cost() {
		return beverage.cost() * 0.90;
	}
}

