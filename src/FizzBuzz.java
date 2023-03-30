import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    static public List<String> fizzBuzz(int number){
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= number ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(50));
    }
    //time complexity o(n)
    //space complexity O(n)

}
