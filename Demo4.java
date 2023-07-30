public class Demo4 {
  public static void main(String[] args) {
    int day = 28;
    int month = 12;
    int year = 2023;
    int hour = 23;
    int minute = 59;
    int second = 59;

    String colourSet = "\033[";
    String colourReset = "\033[0m";


    System.out.printf("%7$s32m%1$s%8$s/%7$s33m%2$s%8$s/%7$s34m%3$s%8$s %7$s35m%4$s%8$s:%7$s36m%5$s%8$s:%7$s31m%6$s%8$s\n", day, month, year, hour, minute, second, colourSet, colourReset);
  }   
}
