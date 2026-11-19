package Lab06_Challenges;
class Discount {
    double apply(double amount) {
        return amount - (amount * 0.05);     
    }
}


class SeasonalDiscount extends Discount {
    @Override
    double apply(double amount) {
        double afterBase = super.apply(amount);      
        return afterBase - (afterBase * 0.10);       
    }
}


class SeasonalDiscountNoSuper extends Discount {
    @Override
    double apply(double amount) {
        return amount - (amount * 0.10);             
    }
}

public class Ch2_Discounts {
    public static void main(String[] args) {
        double amount = 100.0;

        System.out.println("Original amount          : $" + amount);
        System.out.println("Base Discount (5%)       : $" + new Discount().apply(amount));
        System.out.println("With super.apply()       : $" + new SeasonalDiscount().apply(amount));
        System.out.println("Without super.apply()    : $" + new SeasonalDiscountNoSuper().apply(amount));
    }
}
