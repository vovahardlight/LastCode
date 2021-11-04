import java.util.ArrayList;
import java.util.Scanner;

public class TwoEqualParts {
    ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {
        TwoEqualParts ammount = new TwoEqualParts();
        Scanner sca = new Scanner(System.in);
        int sum = sca.nextInt();
        ammount.array.add(sum);
        if(ammount.array.get(0)%2!=0){
            System.out.println((ammount.array.get(0)/2)+1);}
        else {
            System.out.println(ammount.array.get(0)/2);
        }
    }
}
