package LambdaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        List<Integer> integerList = new ArrayList<>();

        fillArr(arrInt);
        fillArrlist(integerList);

        System.out.println(Arrays.toString(arrInt));
        System.out.println(integerList);

        for (int i = 0; i < 10; i++){
            arrInt[i] = arrInt[i] * 2;
            integerList.set(i, integerList.get(i) * 2);
        }

        System.out.println(Arrays.toString(arrInt));
        System.out.println(integerList);
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

    }

    private static void fillArrlist(List<Integer> integerList) {
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
    }
}
