import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MergeSort sortInt = new MergeSort();
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ints.add((int)(Math.random()*100));
        }
        System.out.println(sortInt.split(ints));
    }
}
