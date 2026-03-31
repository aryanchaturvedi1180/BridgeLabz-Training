package corecollection;
import java.util.*;

public class RotateList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        rotateList(list, rotateBy);
        System.out.println(list);
    }

    static void rotateList(List<Integer> list, int k) {
        k = k % list.size();

        List<Integer> rotated = new ArrayList<>();

        for (int i = k; i < list.size(); i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        list.clear();
        list.addAll(rotated);
    }
}
