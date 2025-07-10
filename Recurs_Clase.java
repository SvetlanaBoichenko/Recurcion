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


//------------------------------------------
  public boolean IsPoliandr (String str) {
    String  strWork = new String (str);

    return CompSymbols (strWork);
}

  public static boolean CompSymbols (String str) {
          if (str.length() == 1 || str.isEmpty())
              return true;

          char first = str.charAt(0);
          char last = str.charAt(str.length()-1);
          if (first != last) return false;
          str = str.substring(1,str.length()-1);

          return CompSymbols (str);
  };
  
//-----------------------------------------------




   









