import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_20 {
    public static void main(String[] args) throws IOException {

        System.out.println("請輸入5個人的分數");
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        int[] test;
        test = new int[5];

        for(int i=0;i<test.length;i++){
            String str = br.readLine();
            test[i] = Integer.parseInt(str);
        }

        for(int k=0;k<5-1;k++){
            for(int j=0;j<5-(k+1);j++){
                if(test[j]<test[j+1]){
                    int tmp = test[j];
                    test[j] = test[j+1];
                    test[j+1] = tmp;
                }
            }
        }

        for(int i=0;i<5;i++){
            System.out.println("第"+(i+1)+"名的分數是"+test[i]);
        }

    }
}
