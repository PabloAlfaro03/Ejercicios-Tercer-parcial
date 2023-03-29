import java.util.ArrayList;
import java.util.List;

public class Splitter {

    public static List<Integer> impares(List<Integer> Listaimpar){
        List<Integer> impares = new ArrayList<>();
        for (Integer j: Listaimpar){
            if (j % 2 != 0){
                impares.add(j);
            }
        }
        return impares;
    }
    public static List<Integer> pares(List<Integer> Listapar){
        List<Integer> pares = new ArrayList<>();
        for (Integer i : Listapar){
            if (i % 2 == 0){
                pares.add(i);
            }
        }


        return pares;
    }


}
