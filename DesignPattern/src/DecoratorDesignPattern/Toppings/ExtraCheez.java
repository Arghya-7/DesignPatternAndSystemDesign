package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.BaseClass.BasePizza;

public class ExtraCheez extends Topping {
    BasePizza basePizza;
    public ExtraCheez(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return this.basePizza.getCost() + 50;
    }
}
