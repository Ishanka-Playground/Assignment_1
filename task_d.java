public class task_d {
    public static void main(String[] args) {
        
  
        String item = "ITEM";
        String quantity = "QUANTITY";
        String price = "PRICE";


        String item1 = "Apples";
        String item2 = "Oranges";
        int quantity1 = 5;
        int quantity2 = 10;
        float price1 = 0.99f;
        float price2 = 1.49f;



        String colouryellow = "\033[33m";
        String colourBlue = "\033[34m";
        String colourGreen = "\033[32m";
        String colourPourple = "\033[35m";


        String resetColour = "\033[0m";




        String line1 = "+"+ "-".repeat(15)+ "+"+"-".repeat(10)+"+"+"-".repeat(8)+"+";

        System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);
        System.out.printf("%5$s|%4$s %1$-14s%5$s|%4$s %2$-9s%5$s|%4$s %3$-7s%5$s|%4$s\n",item, quantity,price, resetColour,colouryellow);
        System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);
        System.out.printf("%5$s|%4$s %1$-14s%5$s|%4$s %6$s%2$8s%4$s %5$s|%4$s %8$s$%7$s%3$-4.2f  %5$s|%4$s\n",item1, quantity1,price1, resetColour,colouryellow, colourBlue,colourPourple,colourGreen);
        System.out.printf("%5$s|%4$s %1$-14s%5$s|%4$s %6$s%2$8s%4$s %5$s|%4$s %8$s$%7$s%3$-4.2f  %5$s|%4$s\n",item2, quantity2,price2, resetColour,colouryellow, colourBlue,colourPourple,colourGreen);
        System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);




    }
}
