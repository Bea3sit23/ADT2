package pl.sda.List;

public class MainList {

    public static void main(String[] args) {

//        SelectionSort ss = new SelectionSort();
        QuickSort ss = new QuickSort();
        IList list = new LinkedList();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(0);
        list.add(4);
//        list = ss.sort(list);
        list = ss.sort(list, 0, list.size()-1 );

        Object[] tab = list.getHolderView();

        for (Object val:tab)
            System.out.print(val + ", ");
        System.out.println();

//        int[] tabb =  {3, 1, 5, 11, 9};

//        int[] sorted = ss.sort(tabb);
//        for(int v:sorted)
//            System.out.print(v + ", ");
    }
}


//TO DO obliczanie czasu sortowañ (zadania prezentacja V)