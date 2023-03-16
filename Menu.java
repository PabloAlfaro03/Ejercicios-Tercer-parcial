package superClase;
import java.io.*;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    String myPath = "C://Users//LENOVO//IntelliJ IDEA Community Edition 2022.3.2//superClase//src//superClase";
    String username = sc.next();
    int score;
    File inFile = new File(myPath, username + "txt");
    FileWriter miFileWriter = null;
    PrintWriter miPrintWriter = null;


    public void setUsername(){
        System.out.println("usuario");
    }
    public void setScore(int score){
        this.score=score;
    }
    public int getScore(){
        return score;
    }
    public String getUser(){
        return username;
    }
    //void createFile(String username) {


      //  inFile=new File(username+"C://Users//LENOVO//IntelliJ IDEA Community Edition 2022.3.2//superClase//src//superClase");
      //  if(inFile.exists()) {
      //      System.out.println("File already exists\n");

        //}
        //else {
          // try {
            //    inFile.createNewFile();
              //  setScore(0);
              //  String scoreStr=String.valueOf(getScore());
              //  writeToFile(scoreStr);
              //  System.out.println("File created\n");
           // }
           // catch(IOException e) {
            //    e.printStackTrace();
          //  }
       // }

    //}
    void createFile(String username) {

        String filePath = "C:/Users/LENOVO/IntelliJ IDEA Community Edition 2022.3.2/superClase/src/superClase/" + username;

        File inFile = new File(filePath);

        if (inFile.exists()) {
            System.out.println("File already exists\n");

        } else {
            try {
                inFile.createNewFile();
                setScore(0);
                String scoreStr=String.valueOf(getScore());
                writeToFile(scoreStr);
                System.out.println("File created\n");
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }


    void readFile(String username) {
        //file exists
        inFile=new File(username+"C://Users//LENOVO//IntelliJ IDEA Community Edition 2022.3.2//superClase//src//superClase");
        if(inFile.exists()) {
            System.out.println("File exists...\n");
            try {
                FileReader fileReader = new FileReader(inFile);
                BufferedReader bufReader = new BufferedReader(fileReader);
                //Integer.parseInt(str);
                String scorePrint = bufReader.readLine();
                int scoreSetter=Integer.parseInt(scorePrint);
                setScore(scoreSetter);
                System.out.println("User score: " + getScore());
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("File not found...\n");
        }

    }

    void writeToFile(String printable) {
        try {
            miFileWriter = new FileWriter(this.myPath);
            miPrintWriter = new PrintWriter(miFileWriter);
            int updateValue = Integer.parseInt(printable);
            int activeScore=getScore();
            setScore(activeScore+updateValue);
            String updatedScore=String.valueOf(getScore());
            miPrintWriter.print(updatedScore);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                miFileWriter.close();
                miPrintWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    void updateScore() {

    }


}

