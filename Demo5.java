public class Demo5 {
    public static void main(String[] args) {

    int num1 = 978;
    int num2 = 3;
    int num3 = 16;
    int num4 = 1484100;

    String colourSet = "\033[";
    String colourReset = "\033[0m";

    System.out.printf("%5$s32m%1$s%6$s-%5$s33m%2$s%6$s-%5$s34m%3$s%6$s-%5$s35m%4$s%6$s\n", num1, num2, num3, num4, colourSet, colourReset); //


        
    }
    
}
