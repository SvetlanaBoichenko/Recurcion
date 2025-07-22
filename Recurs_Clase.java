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

    return CompStringChars (str,0);
}

   
public boolean CompStringChars (String str, int firstIndex) {
   
   if (firstIndex < 0 || firstIndex > str.length() - 1)
        return false;

    int lastIndex = str.length() - firstIndex -1;

    if (str.charAt (firstIndex) != str.charAt (lastIndex))
        return false;

    lastIndex++;
    firstIndex--;
    
    if (lastIndex >= firstIndex)
        return true;

        return CompStringChars (str, firstIndex);
    }
  
 //----------------------------------------------------
 
   void PrintChetValues (List <Integer> valueList) {
        CheckChetValues (valueList, 0);
        }

    void CheckChetValues (List <Integer> valueList, int index) {
        if (index >= valueList.size() || index < 0)
            return;

        int val = valueList.get(index);
       
        if (val % 2 == 0) {
            System.out.println(val);
        }
        
        CheckChetValues (valueList,  index + 1);
    }
 //---------------------------------------------------------------
 
   void PrintChetIndex  (List <Integer> valueList) {
        ChetIndexValue (valueList, 0);
    }

    void ChetIndexValue (List <Integer> valueList, int index) {
        if (index >= valueList.size() || index < 0)
            return;
       
         System.out.println(valueList.get(index));
       
         ChetIndexValue (valueList, index + 2);
    };
//-----------------------------------------------------------------

int SecondMax ( int inputArray [])   {

        if (inputArray.length < 2) {
            throw new ArrayIndexOutOfBoundsException ("\n Длина массива должна быть больше 2! \n");
        }

       int [] smalArray = new int[2];
       if (inputArray[1] > inputArray[0]) {
           smalArray[0] = inputArray[1];
           smalArray[1] = inputArray[0];
       }
       else {
           smalArray[0] = inputArray[0];
           smalArray[1] = inputArray[1];
       }

       if (inputArray.length == 2)
           return smalArray[1];

        return LookSecondMax (inputArray, smalArray, 2);   
    }

    
   int LookSecondMax (int[] inpArr, int[] smalArr, int nextIndex) {
       
       if (nextIndex >= inpArr.length)
           return smalArr[1];

        int nextNumber = inpArr[nextIndex];

        if (nextNumber >= smalArr[1]) {
            smalArr[1] = nextNumber;
        }

        if (nextNumber >= smalArr[0]) {
            int temp = smalArr[0];
            smalArr[0] = nextNumber;
            smalArr[1] = temp;
        }

        return LookSecondMax (inpArr, smalArr, nextIndex +1);
    }
   
   //----------------------------------------------------------------

 public static  ArrayList <String> ListFileNames (String inputDir) {
        ArrayList <String> fielNamesList =  new ArrayList<>();
      
        File[] faFiles = new File(inputDir).listFiles();
        for (File file : faFiles) {
            if (file.isDirectory()) {
                ListFileNames (file.getAbsolutePath());
            }

            if (!file.isDirectory() ) {
                fielNamesList.add(file.getAbsolutePath());
            }
        }
    
        return fielNamesList;
    }

   //---------------------------------------------------------------------------





