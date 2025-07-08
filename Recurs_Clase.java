import java.util.*;

public class  Recurs_Clase  {

public  int myMult (int N, int M ) {
   if (N == 0 )
       return 0;

    if (M == 0)
        return 1;
    return N * myMult(N, M-1);
};


    public  int mySum (int n) {
        if (n == 0)
            return 0;

        return (mySum (n/10) + n % 10);
    };

    public static void main (String[] args) {
        System.out.printf("Hello and welcome!");

        //int ret = mysum(-510000000);

       // ret = myMult(3,5);
    }

}




    // 1. Найти остаток - каждый раз находть остаток
    // Сложить с сум
    // Когда остаток = 0 -выйти









