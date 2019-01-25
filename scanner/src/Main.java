import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iveskite varda");
        Scanner scn = new Scanner(System.in);
        String vardas = scn.next();

        System.out.println("Iveskite emaila");
        String emailas = scn.next();

        System.out.println("Iveskite balansa");
        double balansas = scn.nextDouble();


        Account account=new Account(vardas, emailas, balansas);
        List<Account>users =new ArrayList<Account> ();
            users.add(new Account("Edgaras", "emailas@emailas", 544));
            users.add(new Account("darius", "emailas@emailas", 34));
            users.add(new Account("tomas", "emailas@emailas", 554));
            users.add(new Account("egle", "emailas@emailas", 546));
        for (   int i=0; i<users.size();i++){
            System.out.println(users.get(i));
        }




        Transaction transaction=new Transaction(users.get(0), users.get(1), 25);
        transaction.siunciam();
        users.toString();
        for (   int i=0; i<users.size();i++){
            System.out.println(users.get(i));
        }


       // System.out.println(account.toString());



    }

}
