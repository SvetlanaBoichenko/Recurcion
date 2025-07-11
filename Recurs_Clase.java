import java.util.*;

public class  Recurs_Clase  {

public  int myMult (int N, int M ) {
   if (N == 0 )
       return 0;

   if (M == 0)
       return 1;

    return N * myMult(N, M-1);
};
//---------------------------------------------------
public  int mySum (int n) {
    if (n == 0)
        return 0;

    return (mySum (n/10) + n % 10);
};

//-----------------------------------------------
   public static int LenghtOfList (LinkedList listA) {
        LinkedList listB = new LinkedList<>(listA);

        return CountPops (listB);
    };
   
   public static int CountPops (LinkedList listA) {
    if (listA.isEmpty())
        return 0;

        listA.pop();
        return 1 + CountPops (listA);
    };


//--------------------------------------------------
 public boolean IsPoliandr (String str) {
    
    if (str.length() == 1 || str.isEmpty())
        return true;

    return CompStringChars (str,0, str.length()-1);
}

public boolean CompStringChars (String str, int first, int last) {
   
    if (str.charAt(first) != str.charAt(last))
        return false;

    if (++first >= --last)
        return true;

        return CompStringChars ( str, first, last);
    }
  
//-----------------------------------------------




   









