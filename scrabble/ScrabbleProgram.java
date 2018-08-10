package scrabble;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Марина on 02.06.2018.
 */
public class ScrabbleProgram {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("foo");
        arrayList.add("bar");
        arrayList.forEach(System.out::println);


        String pattern = "hello world";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        Scrabble scrabble = new Scrabble();
        scrabble.setHashMap(hashMap);
        System.out.println(hashMap.get('n'));
        System.out.println(scrabble.getScore("hello", hashMap));
        scrabble.splitter(pattern, arrayList);
        int score=0, scoreTemp;
        for (String s:arrayList) {
            System.out.println(s);
            scoreTemp = scrabble.getScore(s, hashMap);
            hashMap1.put(scoreTemp, s);
            if (score < scoreTemp) {
                score = scoreTemp;
            }
        }
        System.out.println("========================");
        System.out.println("score: " + score);
        System.out.println("champion is: " + hashMap1.get(score));
    }
}