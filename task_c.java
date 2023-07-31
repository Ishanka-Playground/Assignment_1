public class task_c {
    public static void main(String[] args) {
        
  
        String city = "CITY";
        String state = "STATE";
        String population = "POPULATION";


        String city1 = "Los Angeles";
        String wordYork = "York";
    
        String state1 = "California";
        int population1 = 3966936;
        int population2 = 8336817;


        String colourBlue = "\033[34m";
        String colouryellow = "\033[33m";
        String colourPourple = "\033[35m";
        String colourGreen = "\033[35m";


        String resetColour = "\033[0m";

        String newYork = colourGreen +"New"+ resetColour +" York" ;

        System.out.println(newYork);





        String line1 = "+"+ "-".repeat(15)+ "+"+"-".repeat(12)+"+"+"-".repeat(14)+"+";

        System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);
        System.out.printf("%5$s|%4$s %1$-14s%5$s|%4$s %2$-11s%5$s|%4$s %3$-13s%5$s|%4$s\n",city, state,population, resetColour,colouryellow);
        System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);
        System.out.printf("%5$s|%4$s %1$-14s%5$s|%4$s %2$-10s %5$s|%4$s %6$s%3$,-13d%4$s%5$s|%4$s\n",city1, state1,population1, resetColour,colouryellow, colourPourple);
        System.out.printf("%4$s|%3$s %1$-17s%4$s|%3$s %1$-10s%4$s|%3$s %5$s%2$,10d%4$s %4$s|%3$s\n",newYork,population2, resetColour,colouryellow, colourPourple);
        System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);


       // System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);
       // System.out.printf("%4$s|%3$s %-14s%4$s|%3$s%2$4s %4$s|%3$s\n",name1, age1,resetColour,colouryellow);
       // System.out.printf("%4$s|%3$s %-14s%4$s|%3$s%2$4s %4$s|%3$s\n",name2, age2,resetColour,colouryellow);
       // System.out.printf("%2$s%1$s%3$s\n",line1,colouryellow,resetColour);



    }
}
