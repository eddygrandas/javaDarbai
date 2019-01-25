package com.company;

public class Programa {

    public static void main(String[] args) {
        Saugykla saugykla1= new DuomenuBaze();
        Saugykla saugykla2= new NutolesDiskas();

        Info info1= new Info(1, "Hello");
        Info info2= new Info(2, "Vakaras");
        Info info3= new Info(3, "Sausainis");
        Info info4= new Info(4, "Java");

        saugoti(saugykla1, info1);
        saugoti(saugykla1, info2);
        saugoti(saugykla1, info3);
        saugoti(saugykla2, info1);
        saugoti(saugykla2, info2);
        saugoti(saugykla2, info3);

        rastiPagalZodi(saugykla1, info1.getId());


        public static void saugoti(Saugykla saugykla, Info info){
            saugykla.saugotiInfo(info);
        }
        public static void rastiPagalId (Saugykla saugykla, int id){
            saugykla.rastiInfo(id);
        }
        public static void rastiPagalZodi (Saugykla saugykla, String zodis){
            saugykla.rastiInfo(zodis);
            System.out.println();
        }
    }
}