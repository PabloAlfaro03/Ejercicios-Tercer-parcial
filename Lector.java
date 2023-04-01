import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
public class Lector {


    public void ejecutar(int id) {

        int alfaroID = parseInt(String.valueOf(id).substring(String.valueOf(id).length() - 3));
        System.out.println("El rango de 50 empezara a partir del siguiente id:" + alfaroID);

        List<String> lineas = null;
        //###################################################################
        String nombreArchivo = "emails.csv";
        Path currentWorkingDir = Paths.get(System.getProperty("user.dir"));
        try {

            Path PathdeArchivo;

            PathdeArchivo = Files.walk(currentWorkingDir)
                    .filter(path -> path.getFileName().toString().equals(nombreArchivo))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Archivo no encontrado"));
            lineas = Files.readAllLines(PathdeArchivo);

        } catch (IOException e) {
            
            e.printStackTrace();
        }
        //###################################################################


        int fin = alfaroID + 50;
        System.out.println("ya se analizaron del 549 al 599 " + fin);

        //###################################################################

        int[] sumas = new int[3000];

        for (int i = alfaroID; i <= fin; i++) {
            String[] correo = new String[0];
            if (lineas != null) {
                correo = lineas.get(i).split(",");
            }

            for (int j = 1; j < correo.length - 1; j++) {
                sumas[j - 1] += parseInt(correo[j]);
            }
        }

        String[] formato = new String[0];
        if (lineas != null) {
            formato = lineas.get(0).split(",");
        }
        //###################################################################

        try {
            FileWriter escribir = new FileWriter("C:/Users/LENOVO/IntelliJ IDEA Community Edition 2022.3.2/Parcial3/src/173549.txt");
            for (int i = 0; i < sumas.length; i++) {
                escribir.write(formato[i + 1] + ", ");
                escribir.write(MessageFormat.format("{0}\n", sumas[i]));
            }
            escribir.close();
        }catch (IOException e){
            e.printStackTrace();
    }
    }





}
