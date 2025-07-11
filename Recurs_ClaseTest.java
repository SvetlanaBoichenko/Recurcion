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
    }
}


