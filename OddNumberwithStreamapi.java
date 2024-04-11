package LeetCodeProblem_Praju;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class OddNumberwithStreamapi {
    public static void main(String[] args) {
        //int numbers;
        List<Integer> list= Arrays.asList(2,1,3,5,4);
        list.stream().filter(numbers->numbers%2!=0).forEach(System.out::println );


    }

}
