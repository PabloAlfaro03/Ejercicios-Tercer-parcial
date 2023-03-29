
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

    Manager manager = new Manager();
    try {

        manager.correrPrograma();

        System.out.println("Archivos generados");
    }catch (IOException e){
        System.out.println("Error intente de nuevo" + e.getMessage());

    }
    }
}