import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class Recurs_ClaseTest {
    @Test
    public void test0() {
        Recurs_Clase RecClasObj = new Recurs_Clase();
        int res1  = RecClasObj.mySum(6007);
        assertTrue (res1 == 13);
        res1  = RecClasObj.mySum(60070);
        assertTrue (res1 == 13);

        res1  = RecClasObj.mySum(11111);
        assertTrue (res1 == 5);

        res1  = RecClasObj.mySum(3);
        assertTrue (res1 == 3);

       int res2  = RecClasObj.myMult(2, 3);
        assertTrue (res2 == 8);

         res2  = RecClasObj.myMult(0, 3);
        assertTrue (res2 == 0);

        res2  = RecClasObj.myMult(3, 0);
        assertTrue (res2 == 1);
    }
    @Test
    public void test1() {
        Recurs_Clase RecClasObj = new Recurs_Clase();
        LinkedList A = new LinkedList <Integer>();

        A.add((Integer)1);
        A.add((Integer)3);
        A.add((Integer)2);
        A.add((Integer)4);
        A.add((Integer)4);
        A.add((Integer)4);

        int ret = RecClasObj.LenghtOfList (A);
        assertTrue (ret == 6);

        A.add((Integer)5);
        ret = RecClasObj.LenghtOfList (A);
        assertTrue (ret == 7);

        String str = "mama";
        boolean ret2 = RecClasObj.IsPoliandr(str);
        assertTrue (ret2 == false);

        String str2 = "mamam";
        ret2 = RecClasObj.IsPoliandr(str2);
        assertTrue (ret2 == true);

        String str3 = "a";
        ret2 = RecClasObj.IsPoliandr(str3);
        assertTrue (ret2 == true);

        String str4 = "ananana";
        ret2 = RecClasObj.IsPoliandr(str4);
        assertTrue (ret2 == true);

        String str5 = "иф";
        ret2 = RecClasObj.IsPoliandr(str5);
        assertTrue (ret2 == false);

        String str6 = "anananan";
        ret2 = RecClasObj.IsPoliandr(str6);
        assertTrue (ret2 == false);

        String str7 = "коту тащат уток";
        ret2 = RecClasObj.IsPoliandr(str7);
        assertTrue (ret2 == true);

        String str8 = "abba";
        ret2 = RecClasObj.IsPoliandr(str8);
        assertTrue (ret2 == true);

        String str9 = "bb";
        ret2 = RecClasObj.IsPoliandr(str9);
        assertTrue (ret2 == true);

        LinkedList L = new LinkedList <Integer>();
        L.push(10);
        L.push(3);
        L.push(2);
        L.push(4);
        L.push(4);
        L.push(5);
        L.push(6);
        L.push(70);
        L.push(8);

        //RecClasObj.PrintChetValues (L);
        //RecClasObj.PrintChetValues (A);

         RecClasObj.PrintChetIndex (L);
         RecClasObj.PrintChetIndex(A);


        int Arr [] =  {15,6,4,3,2,1};
        int sec_max = RecClasObj.SecondMax (Arr);
        assertTrue (sec_max == 6);


        int Arr1 [] =  {15,60,4,3,2,1};
         sec_max = RecClasObj.SecondMax (Arr1);
        assertTrue (sec_max == 15);

        int Arr2 [] =  {150,60,4,3,2,1};
        sec_max = RecClasObj.SecondMax (Arr2);
        assertTrue (sec_max == 60);

        int Arr3 [] =  {1,1,1,1,1,11};
        sec_max = RecClasObj.SecondMax (Arr3);
        assertTrue (sec_max == 1);

        int Arr4 [] =  {111,1,1,1,1,11};
        sec_max = RecClasObj.SecondMax (Arr4);
        assertTrue (sec_max == 11);

        int Arr5 [] =  {111,1,1,1,1,11, 12, 12, 12};
        sec_max = RecClasObj.SecondMax (Arr5);
        assertTrue (sec_max == 12);

        int Arr6 [] =  {13,14,1,1,1,11, 12, 12, 12};
        sec_max = RecClasObj.SecondMax (Arr6);
        assertTrue (sec_max == 13);

        int Arr7 [] =  {13,14,1,1,1,11, 12, 12, 15};
        sec_max = RecClasObj.SecondMax (Arr7);
        assertTrue (sec_max == 14);

        int Arr8 [] =  {130,14,1,1,1,11, 12, 12, 15};
        sec_max = RecClasObj.SecondMax (Arr8);
        assertTrue (sec_max == 15);

        int Arr9 [] =  {1,5};
        sec_max = RecClasObj.SecondMax (Arr9);
        assertTrue (sec_max == 1);

        int Arr10 [] =  {5,1};
        sec_max = RecClasObj.SecondMax (Arr10);
        assertTrue (sec_max == 1);

        int Arr11 [] = {5,4,3,2,5};
        sec_max = RecClasObj.SecondMax (Arr11);
        assertTrue (sec_max == 5);
    }
}


