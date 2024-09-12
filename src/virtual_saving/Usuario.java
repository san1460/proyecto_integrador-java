package virtual_saving;

import java.util.Scanner;
public class Usuario {

    static int  usuarioId;

    static String Usuario;

    static String lastname ;

    static String address;

    static String state;

    static String gmail;

    static String banck;

    static String password;




    static  Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        menu();
        createcliente();
        createempleado();
    }
    public static void  createcliente(){
        String [] tags = {"usuarioid","gmail","passwod","usuario","lastname","address","state","banck","inciando"};

        String [] usuarios  = new String[7];

        System.out.println("Ingresa el id");
        usuarioId = sc.nextInt();
        usuarios[0]=  gmail + " ";
        System.out.println("Ingresa el gmail");
        gmail = sc.next();
        usuarios[1]=  password + " ";
        System.out.println("ingrese el password");
        password = sc.next();
        usuarios[2]=Usuario + " ";
        System.out.println("ingrese el nombre ");
        Usuario = sc.next();
        usuarios[3]=lastname + " ";
        System.out.println("ingra el apellido");
        lastname = sc.next();
        usuarios[4]= address + " ";
        System.out.println("Dirección");
        address = sc.next();
        usuarios[5]= state + " ";
        System.out.println("Departamento ");
        state = sc.next();
        usuarios[6]= banck + " ";
        System.out.println(" banco");
        banck = sc.next();
        System.out.println();
        System.out.println("Iniciando...........");
        System.out.println();
        banck = sc.nextLine();
    }
    public static void  createempleado(){
        String [] tags = {"usuarioid","gmail","passwod","usuario","lastname","address","state","inciando"};

        String [] emplado  = new String[6];

        System.out.println("Ingresa el id");
        usuarioId = sc.nextInt();
        emplado[0]=  gmail + " ";
        System.out.println("Ingresa el gmail");
        gmail = sc.next();
        emplado[1]=  password + " ";
        System.out.println("ingrese el password");
        password = sc.next();
        emplado[2]=Usuario + " ";
        System.out.println("ingrese el nombre ");
        Usuario = sc.next();
        emplado[3]=lastname + " ";
        System.out.println("ingra el apellido");
        lastname = sc.next();
        emplado[4]= address + " ";
        System.out.println(" dirección");
        address = sc.next();
        emplado[5]= state + " ";
        System.out.println("Departamento ");
        state = sc.next();
        System.out.println();
        System.out.println("Iniciando.........");
        System.out.println();
        state = sc.nextLine();
    }
    public static void  menu(){
        System.out.println("select: 1. iniciar_cliente"+
        "2.iniaciar_emplado");


        int opc = sc.nextInt();
        sc.nextLine();

        switch (opc){

            case 1:
                System.out.println("empesando  cliente");
                createcliente();
                break;
            case 2:
                System.out.println("empezando  emplado");
                createempleado();
                break;
            default:
                System.out.println("ingresar una opcion valida ");
        }

    }



}
