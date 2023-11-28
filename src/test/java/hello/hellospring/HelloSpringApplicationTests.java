package hello.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

class HelloSpringApplicationTests {

    @Test
    void contextLoads() {
        Integer[] paper = {7, 5, 8, 10, 6, 9, 5};
        int answer = getGIndex(paper);
        System.out.println(answer);
    }


    public int getGIndex(Integer[] paper) {
        int n = paper.length;
        int gIndex = 0;

        Arrays.sort(paper, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int citations = paper[n - i - 1];
            int g = i + 1;

            if (citations >= g) {
                gIndex = Math.max(gIndex, g);
            }
        }
        return gIndex;
    }
}


//1번'
//        import java.util.Arrays;
//        import java.util.HashSet;
//
//class Solution {
//    public String solution(String sentence) {
//        String answer = missingAlphabetVerify(sentence);
//        return answer;
//    }
//
//    public String missingAlphabetVerify(String sentence){
//        String lowerSentence = sentence.toLowerCase();
//        HashSet<Character> missingAlph = new HashSet<>();
//        for (char alph = 'a';  alph <= 'z'; alph++) {
//            if (lowerSentence.indexOf(alph) == -1) {
//                missingAlph.add(alph);
//            }
//        }
//
//        if (missingAlph.isEmpty()) {
//            return "perfect";
//        } else {
//            Character[] sortedAlph = missingAlph.toArray(new Character[0]);
//            Arrays.sort(sortedAlph);
//            StringBuilder result = new StringBuilder();
//            for (char alph : sortedAlph) {
//                result.append(alph);
//            }
//            return result.toString();
//        }
//    }
//}