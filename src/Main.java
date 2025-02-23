import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num [] = {2,3,1,7,6};
        int temp=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("The sec highest number is :" +num[num.length-2]);
    }
}