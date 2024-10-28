public class Main
{
    public static void main (String [] args)
    {
        // Original T-shirt cost
        String inputStr = "The cost of a T-shirt is $10.95.";
        String stringCost = inputStr.substring(26,31);

        // String conversion to double
        double doubleCost = Double.parseDouble(stringCost);


        // Random Discount
        int randomDiscount = ((int)(Math.random() * 30) + 1);

        // Application of Random Discount
        double discount = (doubleCost * ((double) randomDiscount/100));
        double roundedDiscount = (double)Math.round(discount*100)/(double)100;
        double finalCost1 = (doubleCost - roundedDiscount);
        double finalCost2 = (double)Math.round(finalCost1*100)/(double)100;


        // Print to the console
        System.out.println("The T-shirt originally cost $10.95.");
        System.out.println("The random discount of the day is " + randomDiscount + "% off original cost.");
        System.out.print("Your final cost of the T-shirt is $" + finalCost2 + ".");
    }
}