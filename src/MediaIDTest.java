import org.junit.Test;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static org.junit.Assert.*;

public class MediaIDTest {

    @Test
    public void generate() {



        int[] testArray = new int[100];

        for(int i = 0; i<testArray.length;i++){
            testArray[i] = MediaID.generate();
        }
        for(int i = 0; i<testArray.length; i++){
            System.out.println(testArray[i]);
        }


        for(int i=0; i<testArray.length;i++){
            for(int j= testArray.length-1; j>=0;j-- ){
                System.out.println(testArray[i] +" " +testArray[j]);
                assertNotSame(testArray[i],testArray[j]);

            }
        }


    }
}