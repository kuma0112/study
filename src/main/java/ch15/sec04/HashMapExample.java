package ch15.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 50);
        map.put("aaa", 50);
        map.put("aaa", 50);
        map.put("aaa", 50);
        map.put("bbb", 60);
        map.put("ccc", 40);
        System.out.println(map.size());

        // 순회
        Set<String> keySet = map.keySet();
        Iterator<String> itr = keySet.iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            Integer value = map.get(key);
            System.out.println(key + "," + value);
        }

        // 삭제
        Integer index = map.remove("art");
        System.out.println(index); // "art"라는 없는 키로 찾아서 index에 값ㅇ들 집어넣으면 출력 null
        System.out.println(map.size()); //3
    }
}
