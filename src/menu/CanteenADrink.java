package menu;

import pay.Payment;

public class CanteenADrink extends Drink {
    @Override
    public int order(Payment payment) {
        discount();
        System.out.println("支付方式:"+payment.print()+" "+"食堂A饮料盈利2-1=1元");
        return 2-discountNum;
    }
}
