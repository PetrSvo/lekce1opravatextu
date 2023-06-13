
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) { //přesunl jsem dopředu a chybělo mi zavorky, proto aso neslo tisknout

    }

    public static void ukol1() {
        System.out.println("Hello world!");
        //chybí uvozovky v tisku a za zavorkami strednik
    }
    public static void ukol2() {
        String uzivatel ="Karel"; // zas to samé, text zadávám rucně, tak uvzovky
        System.out.println(uzivatel);    }

    public static void ukol3() {
        int pocetLekci = 10; //císlo int místo textu String
        System.out.println(pocetLekci);}

    public static void ukol4() {
        double cena =10.0; //čárká místo desetinné tečky
        System.out.println(cena);
    }
    public static void ukol5() {
        BigDecimal cena = BigDecimal.valueOf((0));//použít BigDecimal pro zaokrouhlovaní, akorát nevím, jak vše změnit v intervalu místo i
        // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        // hodnotě navíc 0.1
             for (BigDecimal = 0; BigDecimal < 10; BigDecimal++)
                  cena += BigDecimal.valueOf(0,1);           // operátor "+=" znamená: přičti ke stávající
        //     System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        BigDecimal cena =BigDecimal.valueOf(0); //přidal jsem před BigDecimal.value.Of
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);//mělo by vytisknout 2 ceny
    }
    public static void ukol7() {
        int vykonMotoru = 120;    //odendal jsem uvozovky, text místo čísla
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println(velikostKosile);//odstranil jsem Stringy, něco zde bylo špatně napsano
    }

    public void ukol9() {
        System.out.println("Metoda skoro bez chybičky!");//hvězdicky mají jiný význam, dany pryč z textu
    }

    //public static void main(String[] args) //dáno pryč
    {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}
