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
    public static int CountPops (LinkedList listA) {
    if (listA.isEmpty())
        return 0;

        listA.pop();
        return 1 + CountPops (listA);
    };

    public static int LenghtOfList (LinkedList listA) {
        LinkedList listB = new LinkedList<>(listA);

        return CountPops (listB);
    };
//------------------------------------------

//------------------------------------------
  //  проверка, является ли строка палиндромом;
  public boolean LenghtOfStr (String str) {
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
//linkedList.removeFirst();
 //   String str = "Jamaica".substring(1);
   // str = str.substring(0, str.length() - 1);


    public static void main (String[] args) {
        System.out.printf("Hello and welcome!");
        LinkedList A = new LinkedList <Integer>();
        A.push(1);
        A.push(3);
        A.push(2);
        A.push(4);

     //   int ret = LenghtOfList (A);

        String teststr = "vvggvv";

    //   boolean ret1 = LenghtOfStr (teststr);
    }

}




    // 1. Найти остаток - каждый раз находть остаток
    // Сложить с сум
    // Когда остаток = 0 -выйти









