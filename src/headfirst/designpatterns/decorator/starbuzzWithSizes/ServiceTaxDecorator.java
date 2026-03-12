package headfirst.designpatterns.decorator.starbuzzWithSizes;

public class ServiceTaxDecorator extends CondimentDecorator {
	Beverage beverage;

	public ServiceTaxDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Service Tax";
	}

	public double cost() {
		return beverage.cost() + 0.67;
	}
}

