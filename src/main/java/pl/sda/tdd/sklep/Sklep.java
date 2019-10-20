package pl.sda.tdd.sklep;

public class Sklep {
    public static void dokonajZakupu(KartaKlienta karta, double kwotaZakupu) {
        //TODO: dodaj algorytm na liczenie ilości kuponów jakie należą się za zakup

        double rabat = (kwotaZakupu < 50 ? 0 : (kwotaZakupu < 100 ? 0.05 : 0.1));

        double ileKuponow = (kwotaZakupu * (1 - rabat)) / 40;

        karta.dodajKupony(ileKuponow > 3 ? 3 : (int)ileKuponow);

//        to samo, tylko w zapytaniu if
//        if (ileKuponow > 3) {
//            karta.dodajKupony(3);
//        } else {
//            karta.dodajKupony((int) ileKuponow);
//        }
    }

    public static KartaKlienta wydajNowaKarte(){
        return new KartaKlienta();
    }
}
