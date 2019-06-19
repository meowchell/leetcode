package solution.leetcode.com;

import java.util.HashSet;

/**
 * Created by huijiej on 3/23/2018.
 */
public class Codec {
    static String url;
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        System.out.println(set.remove(1));
        System.out.println(set.remove(1));

    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        url = longUrl;
        System.out.println(longUrl.hashCode());
        return longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {


        return url;
    }
}
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));