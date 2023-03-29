import java.util.ArrayList;
import java.util.List;


public class Fibonacci {



    public static List<Integer> getListFibonacci(int count) {
        List<Integer> listFibonacci = new ArrayList<>();
        int i = 2;
        listFibonacci.add(0);
        listFibonacci.add(1);

        int follow = listFibonacci.get(i - 1) + listFibonacci.get(0);

        while (follow <= (count + 1000000)){
            listFibonacci.add(follow);
            i++;
            follow = listFibonacci.get(i - 1) + listFibonacci.get(i - 2);
        }

        return listFibonacci;

    }



}




