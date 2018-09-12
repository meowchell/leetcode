package solution.leetcode.com;

import java.util.stream.Stream;

public class ComplexNumberMultiplication {
    public static void main(String[] args) {
        ComplexNumberMultiplication c = new ComplexNumberMultiplication();
        String[] words = new String[]{"abc", "wer"};
        for (String s: c.findWords(words)){
            System.out.println(s);
        }

    }

    public String[] findWords(String[] words) {
        Stream.of(words).filter(s->s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*]")).toArray(String[]::new);
        return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }
}
