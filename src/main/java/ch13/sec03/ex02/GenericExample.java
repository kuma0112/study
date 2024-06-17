package ch13.sec03.ex02;

public class GenericExample {

    public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
        boolean keyCompare =  p1.getKey().equals(p2.getKey());
        boolean valueCompare =  p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "사과");
        Pair<Integer, String> p2 = new Pair<>(1, "사과");
        System.out.println(compare(p1, p2));

        Pair<String, String> p3 = new Pair<>("1번", "사과");
        Pair<String, String> p4 = new Pair<>("1번", "사과");
        System.out.println(compare(p3, p4));
    }
}
