public class Demo3 {

    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 456;
        int num3 = 7890;

        String colour = "\033[32m";

        System.out.printf("(\033[33m%s\033[0m) %s-%s\n", num1,num2,num3); // colour the area code

        System.out.printf("(\033[33;7m%s\033[0m) %s-%s\n", num1,num2,num3); // if we need to highlight the colour code






    }
    
}
