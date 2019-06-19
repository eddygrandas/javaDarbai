# Task 1: File IO and basic CRUD operations

Functional requirements:
* Read Person entries from given file
* Populate database with the contents of the file
* Update Person with max age to have its age doubled
* Delete all entries other than the person with max age

---
## Tikslai

Užduoties tikslas buvo panaudoti 3 CRUD operacijas kurios yra: įrašo sukurimas, modifikavimas ir ištrynimas atitinkamai 
2, 3 ir 4 punktai. Programa buvo parašyta naudojant MVC(Model-View-Controller) architektūros modelį. Kadangi nėra 
abibrėžtų taisyklių kaip būtent turi atrodyti MVC programoje, šiame readme yra pagrinde fokusuotas aprašymas būtent į tai
kaip tai buvo panaudotas šioje užduotyje.

![MVC](https://i.imgur.com/hzg66n8.png)

Viršuje matote vieną iš MVC informacijos tekmės galimybių:
 1. Naudotojas padaro veiksmą programos sąsajoje (View) ir ji savo ruožtu apie tai praneša Controller'iui.
 2. Controlleri'is atlieka logines operacijas ir atnaujina modelį su naujomis reikšmėmis.
 3. Modelis, po to kai jį atnaujina controlleri'is, pranešą apie tai kitai controller'io daliai, tai kuri rūpinasi 
 išvestimi.
 4. Tuomet Controller'io dalis atsakingą už pranešimą išveščiai (View) sužinojus kaip pasikeitė Modelis, atitinkamai 
 logiškai iškviečia nustatytas išvesties taisykles (atlieka išvestį taip kaip užprogramuota priklausomai nuo to kaip Modelis pasikeitė)      

## Projekto strukūra
![Projekto struktūra](https://i.imgur.com/UJpVNMO.png)

#### Struktųros analizė
Kadangi užduotis neprašo jokios išvesties mes galim praleisti *View* dalį iš MVC. Taigi likusios dvi dalys yra Model ir 
Controller. Tačiau trumpas View aprašymas yra įdėtas. 
##### Model
Modeliai visada būna daugiau ar mažiau POJO (Plain Old Java Object) tačiau nereikia bijoti kartais įdėti helper 
metodų (*helper method* yra trumpi, aiškūs metodai padedantys atlikti mažą funkciją ir yra susiję tik su klase kur jie 
parašyti), pvz jei norima reprezentuoti objektą kažkokiu specifiniu stringu galima overridinti toString() metodą. Modeliai 
reprezentuoja būtent tai kokius objektus programa naudos norit pasiekti savo funkcinius tikslus.
Šiame projekte vienintelis modelio darys yra `Person` klasė
##### Controller
Controller'is yra architektūros dalis kuri rūpinasi systemos funkcine logika ir jos apdorojimu. Dažnai programoje 
controller'ių dalis būna Servisai. Šiuo atvėju servisai yra klasės kurios pačios iš savės neatlieka jokios funkcinės 
logikos tačiau duoda galimybes controller'iui susirinkti reikiamas reikšmias (pvz. naudotojo įvestis, šiame projekte - 
CSV failus) ir perduoti jas controller'iui logiškai apdoroti norint gauti reikiamą rezultatą. 

Projekte pagrindinis kontroleris yra `PersonController` jis atlieka tris pagrindines funkcijas: failų nuskatymo rezultato 
perėmimas iš `FileReaderService`, duombazės manipuliacija įdarbinant `DatabaseService` ir informacijos manipuliacija (max amžiaus radimas ir jo padauginimas iš 2).

Tuo tarpu servisai rūpinasi tik pačių failų nuskatymu ir atlieka tik duombazės manipuliacijas. Servisai visada turi būti
agnostiški logiškam funkcionalumui. Tai reiškia jiem neturi rūpėti kaip reikia apdoroti informacija (pvz. padauginti amžių iš 2) 
ir jiem net neturėtų būti svarbu ar jie gauna teisinga informaciją. Vienintelis jų darbas atlikti savo funkciją: skaityti failą
ir vykdyti SQL užklausas su betkokiais kintamais kurie yra paduoti.

Pavizdys:
```java
public void updatePersonAge(int personIdToUpdate, int age) {
    try {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PERSON_AGE);
        preparedStatement.setInt(1, age);
        preparedStatement.setInt(2, personIdToUpdate);
        int executionResult = preparedStatement.executeUpdate();
        if (executionResult == 0)
            throw new SQLException("Could not update with personId: " + personIdToUpdate);
    } catch (SQLException e) {
        e.printStackTrace(); //proper handling should go here
    }
}
```
Šios funkcijos vienintelis tikslas yra modifikuoti įrašo reikšmę. Ar reikšmė teisinga ar ne - jai nerūpi.
 
##### View
View turi vienintelį tikslą, tai yra išvestį modelį į ekraną. Tai gali būti bet kas: tekstas konsolėje, internetinis puslapis,
ar stand-alone Windows programos langas. View gauna savo išvesties nuorodas ir modelį iš kontrolerio apie tai ką būtent reikia atvaizduoti ir tuo pasirūpina.

Pavizdys kaip galima būtų išvesti išrašą mūsų programoje:

Įsivaizduojam, akd egzistuoja klasė `PersonView` kurioje yra toks metodas:
```java
    public void showPerson(Person person){
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
```
Tuomet Controller'yje `PersonController` galėtų būti tokia funkcija:
```java
    public void updateView(){
        view.showPerson(model);
    }
```

Kaip kviečiama funkcija `updateView()` jau priklausytų nuo išvesties reikalavimų. Pavyzdžiui jei užduotis reikalautų
atspausdinti pasilikusį `Person` po 4 punkto (`Person` kuris liko vienintelis įrašas duombazėje ir turi savo amžių padvigubintą) - 
funkciją galima būtų kviesti iškarto kai trinimas iš duombazės yra įvykdytas.
