package DecoratorDesignPattern;

import DecoratorDesignPattern.BaseClass.BasePizza;
import DecoratorDesignPattern.BaseClass.FruiltCakePizza;
import DecoratorDesignPattern.Toppings.ChizzBlast;
import DecoratorDesignPattern.Toppings.ExtraCheez;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new ChizzBlast(new ChizzBlast(new ExtraCheez(new FruiltCakePizza())));
        System.out.println(basePizza.getCost());
    }
}
