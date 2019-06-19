import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Go {
    public static void main(String[] args) {
        //int[] skaiciuMasyvas = new int[9];
        Scanner tikrinti = new Scanner(System.in);
        System.out.println("Iveskite 9 skaitnmenu skaiciu");
        int skaicius = tikrinti.nextInt();
        System.out.println(skaicius);

        boolean tikrintiPVMkoda (skaicius) {
                ArrayList < Integer > sarasas = new ArrayList<Integer>();
        do {
            sarasas.add(0, skaicius % 10);
            skaicius /= 10;
        } while (skaicius > 0);

        int c1, c2, c3, c4, c5, c6, c7, c8, c9;
        int r1, r2;
        int a1, a2;

        c1 = sarasas.get(0);
        c2 = sarasas.get(1);
        c3 = sarasas.get(2);
        c4 = sarasas.get(3);
        c5 = sarasas.get(4);
        c6 = sarasas.get(5);
        c7 = sarasas.get(6);
        c8 = 1;
        c9 = sarasas.get(8);
        //System.out.println(sarasas);

        a1 = 1 * c1 + 2 * c2 + 3 * c3 + 4 * c4 + 5 * c5 + 6 * c6 + 7 * c7 + 8 * c8;
        //int a11 = 1 * 2 + 2 * 1 + 3 * 3 + 4 * 1 + 5 * 7 + 6 * 9 + 7 * 4 + 8 * 1;

        System.out.println(a1);
        //System.out.println(a11);

        r1 = a1 % 11;
        System.out.println(r1);
        if (r1 != 10) {
            c9 = r1;
            //System.out.println(c9);
        } else {
            a2 = 3 * c1 + 4 * c2 + 5 * c3 + 6 * c4 + 7 * c5 + 8 * c6 + 9 * c7 + 1 * c8;
            r2 = a2 % 11;
            //System.out.println(r2);

            if (r2 == 10) {
                c9 = 0;
            } else {
                c9 = r2;
                //System.out.println(c9);
            }
        }
        //System.out.println(c9);
    }

}}
