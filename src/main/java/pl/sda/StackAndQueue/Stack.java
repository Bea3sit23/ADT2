package pl.sda.StackAndQueue;

public class Stack<T> {

    //TO DO :
//    public void stack(String[] args) {
//
//        Stack stosik = new Stack();
//        if(i=   ; i =  , i++){

//       stack.push(warzywko.co�tamco�tamChar(i))
//
//    }




//    // Zdefiniowanie tablicy i element�w odpowiedzialnych za wierzcho�ek.
//    double[] tab;
//    int firstLetter;
//
//    // Konstruktor, kt�ry zainicjuje wierzcho�ek i stos o odpowiedniej
//    // wielko�ci.
//    public Stack(int MaxSize) {
//        tab = new double[MaxSize];
//        firstLetter = 0;
//    }
//
//    // Metoda zwracaj�ca maksymalny rozmiar stosu
//    int getMaximumStackSize() {
//        return tab.length;
//    }
//
//    // Metoda zwracaj�ca prawd�, je�eli stos jest pusty
//    boolean isEmpty() {
//        if (firstLetter == 0) {
//            return true;
//        } else
//            return false;
//    }
//
//    // Metoda zwracaj�ca rozmiar stosu
//    int getSize() {
//        return firstLetter;
//    }
//
//    // Metoda dodaj�ca na stos
//    void Push(double E) throws ArrayIndexOutOfBoundsException {
//        if (firstLetter < tab.length) {
//            tab[firstLetter] = E;
//            firstLetter++;
//
//        } else {
//            throw new ArrayIndexOutOfBoundsException(
//                    "Przepe�nienie stosu");
//        }
//    }
//
//    // Metoda zdejmuj�ca ze stosu
//    double Pop() throws IndexOutOfBoundsException {
//        if (firstLetter <= 0) {
//            throw new IndexOutOfBoundsException(
//                    "Stos jest pusty");
//        }
//
//        double temp = tab[firstLetter - 1];
//        firstLetter--;
//        return temp;
//    }
//
//    // Metoda wy�wietlaj�ca zawarto�� stosu
//    void display() throws IndexOutOfBoundsException {
//        if (firstLetter == 0) {
//            throw new IndexOutOfBoundsException(
//                    "Stos jest pusty");
//        }
//
//        int temp = firstLetter - 1;
//        do {
//            System.out.println(tab[temp]);
//            temp--;
//        } while (temp > -1);
//
//    }
//
//    // Metoda wielokrotnego zdj�cia
//    void multiPop(int k) {
//        if (k < firstLetter) {
//            for (int i = k; i > 0; i--) {
//                System.out.println(Pop());
//            }
//        }
//    }
//
//    // Metoda czyszcz�ca stos
//    void clear() {
//        for (int i = 0; i < firstLetter; i++) {
//            tab[i] = 0.0;
//
//        }
//
//        firstLetter = 0;
//    }
//
//    // Metoda odwracaj�ca kolejno�� element�w na stosie
//    void reverse() {
//        for (int i = 0; i < firstLetter / 2; i++) {
//            double temp = tab[i];
//            tab[i] = tab[firstLetter - 1 - i];
//            tab[firstLetter - 1 - i] = temp;
//
//        }
//    }
}
