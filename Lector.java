import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.List;
import static java.lang.Integer.parseInt;

public class Lector {

    private static final String Archivo = "emails.csv";
    private static final String ArchivoFinal = "173549.txt";
    private static final int Correos_A_Leer = 51;

    //#########################################################################################
    public void ejecutar(int id) {

        int alfaroID = parseInt(String.valueOf(id).substring(String.valueOf(id).length() - 3));
        System.out.println("se analizaran 50 correos a partir del siguiente id: " + alfaroID);

        List<String> lines = readFile();
        if (lines == null) {
            throw new RuntimeException("Archivo no encontrado");
        }

        int limite = alfaroID + Correos_A_Leer;

        System.out.println("ya se analizaron del " + alfaroID + " al " + (limite - 1));

        int[] sums = new int[lines.get(0).split(",").length - 1];

        for (int i = alfaroID; i < limite; i++) {
            String[] values = lines.get(i).split(",");

            for (int j = 1; j < values.length; j++) {
                sums[j - 1] += parseInt(values[j]);
            }
        }

        writeToFile(sums, lines.get(0).split(","));
    }

    //########################################################################################
    private List<String> readFile() {
        try {
            Path filePath = Files.walk(Paths.get(System.getProperty("user.dir")))
                    .filter(path -> path.getFileName().toString().equals(Lector.Archivo))
                    .findFirst()
                    .orElse(null);

            return (filePath != null) ? Files.readAllLines(filePath) : null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    //###############################################################################################
    private void writeToFile(int[] sums, String[] header) {
        try {
            FileWriter writer = new FileWriter(ArchivoFinal);
            for (int i = 0; i < sums.length; i++) {
                writer.write(header[i + 1] + ", ");
                writer.write(MessageFormat.format("{0}\n", sums[i]));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
