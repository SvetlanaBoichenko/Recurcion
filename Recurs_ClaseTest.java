import org.junit.Test;

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

    }


