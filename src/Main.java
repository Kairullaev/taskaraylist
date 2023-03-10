import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> num = new ArrayList();

        for (int i = 1; i <= 50; i++) {
            num.add(r.nextInt(1, 100));
        }
        ArrayList<Integer> jupsan = new ArrayList<>();
        ArrayList<Integer> taksan = new ArrayList<>();
        for (Integer san :num){
            if (san % 2 == 0){
                jupsan.add(san);
            }else
                taksan.add(san);
        }
        System.out.println("Jup san : "+jupsan);
        System.out.println("Tak san :"+taksan);
    }
}