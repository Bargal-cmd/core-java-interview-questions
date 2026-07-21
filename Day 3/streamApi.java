import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamApi {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        List<String> lsd = new ArrayList<>();
        ls.add("Raj");
        ls.add("ganu");
        ls.add("amar");
        ls.add("Raj");
        ls.add("ganu");
        // without stream api
        for (String string : ls) {
            if (!ls.contains(string))
                lsd.add(string);

        }
        // with Stream api

        ls.stream().distinct().forEach(
                (x) -> lsd.add(x));
        System.out.println(lsd);
        // how to convert array to stream obj
        int a[] = { 12, 34, 56, 23, 54, 67, 23, 12, 34, 45, 56 };
        Arrays.stream(a).forEach(x -> System.out.println(x));

        // find duplicate from given array
        Arrays.stream(a).distinct().forEach(x -> System.out.println(x));

        // print all element in asending order
        System.out.println("sorted data ");
        Arrays.stream(a).sorted().forEach(x -> System.out.println(x));

        // print all element in asending orde without duplicate
        System.out.println("sorted without duplicate");
        Arrays.stream(a).distinct().sorted().forEach(x -> System.out.println(x));
        // sum of element
        int sum = Arrays.stream(a).distinct().sum();
        System.out.println("sum of all without duplicate :" + sum);
        // avg of element
        System.out.println(Arrays.stream(a).average());

        // find even number 
        Arrays.stream(a).filter(value -> value%2==0).forEach(x ->System.out.println(x) );
    }
}