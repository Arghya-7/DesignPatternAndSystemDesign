package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.BaseClass.BasePizza;

public class ChizzBlast extends Topping{
    BasePizza basePizza;
    public ChizzBlast(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public int getCost(){
        return this.basePizza.getCost() + 20;
    }
}
