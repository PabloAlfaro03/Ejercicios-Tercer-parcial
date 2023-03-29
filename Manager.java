import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
public class Manager {
    String ListaCompleta = "C:/Users/LENOVO/IntelliJ IDEA Community Edition 2022.3.2/Lista-de-Fibonacci/src/fibonacci.txt";
    String ListaImpares = "C:/Users/LENOVO/IntelliJ IDEA Community Edition 2022.3.2/Lista-de-Fibonacci/src/impares.txt";
    String ListaPares= "C:/Users/LENOVO/IntelliJ IDEA Community Edition 2022.3.2/Lista-de-Fibonacci/src/pares.txt";


    private void generarArchivos(String nombre, List<Integer> lista) throws IOException{
        FileWriter writer = new FileWriter(nombre);
        for (Integer i : lista){
            writer.write(i + "\n");
        }
        writer.close();
    }
    public void correrPrograma() throws IOException{

        List<Integer> fibonacci = Fibonacci.getListFibonacci(1000000);

        List<Integer> listaPar = Splitter.pares(fibonacci);

        List<Integer> listaImpar = Splitter.impares(fibonacci);

        generarArchivos(ListaCompleta,fibonacci);
        generarArchivos(ListaImpares,listaImpar);
        generarArchivos(ListaPares,listaPar);

    }
}
