package ComparotorLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaCompare {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Goodbye");
        stringList.add("Auf Wiedersehen");
        stringList.add("Adios");
        stringList.add("Ad");
        stringList.add("Adb");

        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1;
                } else if(o1.length() < o2.length()){
                    return -1;
                } else return 0;
            }
        });

        System.out.println(stringList);

        stringList.sort((x, y) ->{
            if(x.length() > y.length()){
                return -1;
            } else if(x.length() < y.length()){
                return 1;
            } else return 0;

        });

        System.out.println(stringList);


        /*
        Так тоже можно!!!!!!
         */

        Comparator<String> comparator = (s1, s2) -> {
            if(s1.length() > s2.length()) return 1;
            else if(s1.length() < s2.length()) return -1;
            else return 0;
        };

        stringList.sort(comparator);
        System.out.println(stringList);
    }
}
