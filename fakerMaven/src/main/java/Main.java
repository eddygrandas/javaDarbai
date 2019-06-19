import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;


public class Main {
    public static void main(String[] args) {

        System.out.println("Pasirinkite punkta: ");
        System.out.println("[1] Registruotis");
        System.out.println("[2] Prisijungti");

        int scanner=new Scanner(System.in).nextInt();
        System.out.println(scanner);

        case1:
        {
            System.out.println("Iveskite vartotojo varda: ");
            String user = new Scanner(System.in).next();
            System.out.println("Iveskite slaptazodi: ");
            String pass = new Scanner(System.in).next();
            System.out.println("Pakartokite slaptazodi: ");
            String pass2= new Scanner(System.in).next();
            if(pass.equals(pass2)){
                System.out.println("Sekmingai uzsiregistravote");
            }else{
                System.out.println("neteisingai ivestas slaptazodis");
            }

    }
}}
