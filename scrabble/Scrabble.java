package scrabble;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Марина on 02.06.2018.
 * This is task from SoloLearn
 * Give a variable number of words, create a program to output the word with the maximum score, based on the following scoring system:
 * The score of a word is calculated based on its character values, according to this table:
 * e, a, i, o, n, r, t, l, s, u are equal 1 point
 * d, g 2 points
 * b, c, m, p 3 points
 * f, h, v, w, y 4 points
 * k 5 points
 * j, x points
 * q, z 10 points
 *
 * The max length of a word is 10 letters.
 *
 * for example:
 * input {"This", "is", "a", "cool", "Challenge"}
 * output: Challenge
 * 
 */
class Scrabble {

    HashMap<Character, Integer> setHashMap(HashMap<Character, Integer> h) {
        h.put('a', 1);
        h.put('b', 3);
        h.put('c', 3);
        h.put('d', 2);
        h.put('e', 1);
        h.put('f', 4);
        h.put('g', 2);
        h.put('h', 4);
        h.put('i', 1);
        h.put('j', 8);
        h.put('k', 5);
        h.put('l', 1);
        h.put('m', 3);
        h.put('n', 1);
        h.put('o', 1);
        h.put('p', 3);
        h.put('q', 10);
        h.put('r', 1);
        h.put('s', 1);
        h.put('t', 1);
        h.put('u', 1);
        h.put('v', 4);
        h.put('w', 4);
        h.put('x', 8);
        h.put('y', 4);
        h.put('z', 10);
        return h;
    }

    int getScore(String s, HashMap<Character,Integer> hashMap) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += hashMap.get(s.charAt(i));
        }
        return res;
    }

    ArrayList<String> splitter(String pattern, ArrayList<String> arrayList) {
        for (String s : pattern.split(" ")) {
            arrayList.add(s);
        }
        return arrayList;
    }
}
