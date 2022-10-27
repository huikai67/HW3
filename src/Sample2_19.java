import java.io.IOException;

public class Sample2_19 {
    public static void main(String[] args) throws IOException {

        int[] test;
        test = new int[5];

        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;

        for(int i=0;i<test.length;i++){
            System.out.println("第"+(i+1)+"個人分數是"+test[i]+"分");
        }
        System.out.println("考試人數為"+test.length+"人");

    }
}
