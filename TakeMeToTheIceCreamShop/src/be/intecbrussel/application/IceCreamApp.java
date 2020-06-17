package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamApp {

    public static void main(String[] args) {
        PriceList priceList = new PriceList(1.5, 2.5,3);
        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);
        Flavor [] balls = {Flavor.BANANA , Flavor.CHOCOLATE, Flavor.LEMON};
        Cone cone = iceCreamSalon.orderCone(balls);
        Magnum magnum = iceCreamSalon.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES);
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        Eatable [] icecrems = {cone, magnum, iceRocket};
        cone.eat();
        magnum.eat();
        iceRocket.eat();
        System.out.println(iceCreamSalon.getProfit());
    }
}
