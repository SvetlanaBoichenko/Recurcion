
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

  
} 















