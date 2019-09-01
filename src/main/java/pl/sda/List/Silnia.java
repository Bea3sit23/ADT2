package pl.sda.List;

public class Silnia {

    //Zadania uzupe³niaj¹ce - rekurencja / iteracja ZADANIE 2
    public static int SilniaRekurencyja (int n) {
        if (n == 0)
            return 1;
        else
            return (n * SilniaRekurencyja(n - 1));
    }

    //ZADANIE 2
    public static int SilniaIteracja (int n) {
        int iloczyn = 1;
        for (int i = 1; i == iloczyn; i++) {
            iloczyn *= i;
        }
        return iloczyn;
    }
}
