public class task_b {

    public static void main(String[] args) {
        
        String name = "Name";
        String age = "Age";

        String name1 = "Alice";
        String name2 = "Bob";
        String age1 = "24";
        String age2 = "30";

        String colourBlue = "\033[34m";
        String colouryellow = "\033[33m";

        String resetColour = "\033[0m";




        String line1 = "+"+ "-".repeat(15)+ "+"+"-".repeat(5)+"+" ;

        System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);
        System.out.printf("%5$s|%4$s %3$s%1$-14s%4$s%5$s|%4$s%3$s%2$4s%4$s %5$s|%4$s\n",name, age,colourBlue, resetColour,colouryellow);
        System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);
        System.out.printf("%4$s|%3$s %-14s%4$s|%3$s%2$4s %4$s|%3$s\n",name1, age1,resetColour,colouryellow);
        System.out.printf("%4$s|%3$s %-14s%4$s|%3$s%2$4s %4$s|%3$s\n",name2, age2,resetColour,colouryellow);
        System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);


    
    }
    
}
