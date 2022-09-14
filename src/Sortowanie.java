import java.util.Scanner;

public class Sortowanie {

    public int[] tablica = new int[10];

    public void wypełnijZKlawiatury() {
        Scanner klawiaturaWczytane = new Scanner(System.in);
        System.out.println("Wprowadź elementy tablicy");

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Element " + i + " :");
            tablica[i] = klawiaturaWczytane.nextInt();
        }


    }

    public void wypiszTablice() {
        System.out.println("Tablica:");
        for (int element : tablica) {
            System.out.println(element + " ");
        }
    }

    /******************************************************

     * nazwa funkcji: szukajMaksymalnie
     * parametry wejściowe: k - indeks początku przeszukiwaniea w tablicy
     * wartość zwracana: szukany indeks posortowany
     * autor: 000000000








   ******************************************************/


    private int szukajMaksymalnej(int k) {

        int szukanyIndeks = k;
        int maksymalnaWartoc = tablica[k];
        for (int i = k + 1; i < tablica.length; i++) {
            if (maksymalnaWartoc < tablica[i]) {
                maksymalnaWartoc = tablica[i];
                szukanyIndeks = i;
            }
        }

        return szukanyIndeks;
    }

    public void sortuj() {
        for (int i = 0; i < tablica.length; i++) {
            int indeks = szukajMaksymalnej(i);
            int pomoc = tablica[i];
            tablica[i] = tablica[indeks];
            tablica[indeks] = pomoc;
        }

    }
}
