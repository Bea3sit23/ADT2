package pl.sda.List;

public class SumNaturals {

    //Zadania uzupe³niaj¹ce - rekurencja / iteracja ZADANIE 1 :
    public static void SumNaturals(int[] table, int startIndex){
        int minValue = table[startIndex];
        int minValueIndex = startIndex;
        while (table[minValue] < table[minValue+1]){
            int suma = 0;
            int n = 0;
            for(n=0;minValue+1<=minValue;n++)
            {
                minValue = minValue+n;
                suma =  suma + minValue;

            }
            System.out.print(suma);
        }
    }
}
