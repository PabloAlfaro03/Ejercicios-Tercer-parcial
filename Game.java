package superClase;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Random;


public class Game extends Menu{

    public static void gameStart(){

    Scanner input=new Scanner(System.in);

    ArrayList<menorEdad> lst= new ArrayList<>(10);
    Random rand=new Random();

    Menu menu = new Menu();
        System.out.println(("nuevo usuario\2. usuario regular"));
    int archivo = Integer.parseInt(input.nextLine());
        if (archivo==1){
        menu.setUsername();
        menu.createFile(menu.getUser());
    }else if(archivo==2){
        menu.setUsername();
        menu.readFile(menu.getUser());
    }else{
        System.out.println("error");
    }
    //make random
    String[] nombres= {"Alan", "Diego", "Emilio", "Angel", "Miguel", "Gaspa", "Kahim", "Carlos", "Genaro", "Danna"};
    List<String> shuffled= Arrays.asList(nombres);
        Collections.shuffle(shuffled);
        shuffled.toArray(nombres);

    menorEdad ob1=new menorEdad(); menorEdad ob2=new menorEdad();
    menorEdad ob3=new menorEdad(); menorEdad ob4=new menorEdad();
    menorEdad ob5=new menorEdad(); menorEdad ob6=new menorEdad();
    menorEdad ob7=new menorEdad(); menorEdad ob8=new menorEdad();
    menorEdad ob9=new menorEdad(); menorEdad ob10=new menorEdad();

        lst.add(ob1);  lst.add(ob2);  lst.add(ob3); lst.add(ob4); lst.add(ob5);
        lst.add(ob6); lst.add(ob7); lst.add(ob8); lst.add(ob9); lst.add(ob10);

    int k=0;
        for(menorEdad i:lst) {
        i.setNombre(nombres[k]);
        k++;
    }

        for (int i = 0; i < lst.size(); i++) {
        for (int j = 0;j < lst.size(); j++) {
            if(i != j) {
                boolean getEstudioCondition = lst.get(i).getEstudio()==lst.get(j).getEstudio();
                boolean getVotoCondition = lst.get(i).getVoto()==lst.get(j).getVoto();
                boolean getMayorDe18Condition = lst.get(i).getMayorDe18()==lst.get(j).getMayorDe18();
                boolean getIneCondition = lst.get(i).getIne()==lst.get(j).getIne();
                if(getEstudioCondition && getVotoCondition && getMayorDe18Condition && getIneCondition) {
                    lst.get(i).setter();
                    lst.get(j).setter();
                }//end if
            }//end if
        }//end for
    }//end for
        ob1.getters(); ob2.getters(); ob3.getters(); ob4.getters(); ob5.getters();
        ob6.getters(); ob7.getters(); ob8.getters(); ob9.getters(); ob10.getters();

    //##############################################################################################################

    int ine=0;
    int mayorDe18=0;
    int estudios=0;
    int voto=0;

        for(menorEdad i:lst) {
        if(i.getIne()) {
            ine++;
        }
        if(i.getVoto()) {
            voto++;
        }
        if(i.getEstudio()) {
            estudios++;
        }
        if(i.getMayorDe18()) {
            mayorDe18++;
        }
    }

        System.out.println("Ine: "+ine+"\n"+"voto: "+voto+"\n"+"Estudios: "+estudios+"\n"+"mayor De 18: "+mayorDe18);
        System.out.println("Bienvenido a Adivina Quien?, ingrese un numero para inciar con las preguntas:");

    //##################################################################################################

    int preguntas=0;
    int pre=rand.nextInt(11);
    int p1=0;
    int p2=0;
    int p3=0;
    int p4=0;

        while(preguntas<3) {
        int answer=input.nextInt();
        System.out.println("1. tiene Ine? \n2. tiene estudios? \n3. Es mayor de 18? \n4. Voto? \n5. Exit");

        if(answer!= 6) {
            switch (answer) {
                case 1 -> {
                    if (p1 < 1) {
                        if (lst.get(pre).getIne()) {
                            for (superClase.menorEdad menorEdad : lst) {
                                if (!menorEdad.getIne()) {
                                    menorEdad.setNombre("-----");
                                }
                                System.out.println(menorEdad.getNombre());
                            }
                        } else {
                            for (superClase.menorEdad menorEdad : lst) {
                                if (menorEdad.getIne()) {
                                    menorEdad.setNombre("-----");
                                }
                                System.out.println(menorEdad.getNombre());
                            }
                        }
                        p1++;
                        preguntas++;
                        System.out.println();
                    } else {
                        System.out.println("escoje otra pregunta");
                    }
                }
                case 2 -> {
                    if (p2 < 1) {
                        if (lst.get(pre).getEstudio()) {
                            for (superClase.menorEdad menorEdad : lst) {
                                if (!menorEdad.getEstudio()) {
                                    menorEdad.setNombre("-----");
                                }
                                System.out.println(menorEdad.getNombre());
                            }
                        } else {
                            for (superClase.menorEdad menorEdad : lst) {
                                if (menorEdad.getEstudio()) {
                                    menorEdad.setNombre("----+-");
                                }
                                System.out.println(menorEdad.getNombre());
                            }
                        }
                        p2++;
                        preguntas++;
                        System.out.println();
                    } else {
                        System.out.println("ya hiciste esa pregunta guapo");
                    }
                }
                case 3 -> {
                    if (p3 < 1) {
                        if (lst.get(pre).getMayorDe18()) {
                            for (superClase.menorEdad menorEdad : lst) {
                                if (!menorEdad.getMayorDe18()) {
                                    menorEdad.setNombre("-----");
                                }
                                System.out.println(menorEdad.getNombre());
                            }
                        } else {
                            for (superClase.menorEdad menorEdad : lst) {
                                if (!menorEdad.getMayorDe18()) {
                                    System.out.println(menorEdad.getNombre());
                                } else {
                                    menorEdad.setNombre("---");
                                }
                                System.out.println(menorEdad.getNombre());
                            }
                        }
                        p3++;
                        preguntas++;
                        System.out.println();
                    } else {
                        System.out.println("prueba con otra :)");
                    }
                }
                case 4 -> {
                    if (p4 < 1) {
                        if (lst.get(pre).getVoto()) {
                            for (superClase.menorEdad menorEdad : lst) {
                                if (!menorEdad.getVoto()) {
                                    menorEdad.setNombre("----");
                                }
                                System.out.println(menorEdad.getNombre());
                            }
                        } else {
                            for (superClase.menorEdad menorEdad : lst) {
                                if (!menorEdad.getVoto()) {
                                    System.out.println(menorEdad.getNombre());
                                } else {
                                    menorEdad.setNombre("-----");

                                }
                                System.out.println(menorEdad.getNombre());
                            }
                        }
                        p4++;
                        preguntas++;
                        System.out.println();
                    } else {
                        System.out.println("vuelva a intentar y trate de hacerlo bien esta vez");
                    }
                }
                default -> System.out.println("no se  puede bb");
            }
        }else {
            System.out.println("SALIENDO.....");
            break;
        }
    }
        System.out.println("adivina a tu personaje\n");

    Scanner respuesta=new Scanner(System.in);
    String resp=respuesta.nextLine();

        if(lst.get(pre).getNombre().equals(resp)){
            System.out.println("\nbien hecho, estás en lo correcto");
            menu.writeToFile("1");
        } else
        {
        System.out.println("mal ahi amigo, no le sabes");
        System.out.println("tu personaje era "+lst.get(pre).getNombre());
    }
}


}
