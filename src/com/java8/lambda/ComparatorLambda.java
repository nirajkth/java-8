import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        // before
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return x.compareTo(y);
            }
        };
        System.out.println(c1.compare(1000, 200));

        // after
        Comparator<Integer> c2 = (x, y) -> x.compareTo(y);
        System.out.println("Comparing value " + c2.compare(2000, 1));
    }
}
