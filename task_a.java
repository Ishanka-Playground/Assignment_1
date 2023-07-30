public class task_a {

    public static void main(String[] args) {
        
        String colour1 = "\033[31;7m";
        String colour2 = "\033[32;7m";

        String colourEnd = "\033[0m";

        
        
        //System.out.printf("[%10s%-9s]/n", "5","0%");

        System.out.printf("%1$s[%2$10s%3$s%4$-9s]%5$s\n",colour1,"5",colour2,"0%",colourEnd);


    }
}
