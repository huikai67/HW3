import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Sample2_22 {
    public static void main(String[] args) throws IOException {


        int[][]test;
        test = new int[2][5];

        test[0][0] = 80;
        test[0][1] = 60;
        test[0][2] = 40;
        test[0][3] = 30;
        test[0][4] = 44;
        test[1][0] = 55;
        test[1][1] = 66;
        test[1][2] = 77;
        test[1][3] = 88;
        //test[1][4] = 99;


        for(int i=0;i<test[1].length;i++){
            System.out.println("第"+(i+1)+"個人的國語分數是"+test[0][i]+"分");
            System.out.println("第"+(i+1)+"個人的數學分數是"+test[1][i]+"分");
        }

    }
}
