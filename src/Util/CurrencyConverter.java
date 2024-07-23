package Util;

public class CurrencyConverter {

    public static double dollar;

    public static double quantityInDollars;
    
    public static double Calculator(){
        return (quantityInDollars * dollar) + ((quantityInDollars*dollar) * 0.06);
    }

}
