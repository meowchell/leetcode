package solution.leetcode.com;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        UniqueEmailAddresses u = new UniqueEmailAddresses();
        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        System.out.println(u.numUniqueEmails(emails));

    }
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email : emails){
            String[] words = email.split("@");
            String[] parts = words[0].split("\\+");

//            System.out.println(parts[0].replace(".","")+"@"+words[1]);
            emailSet.add(parts[0].replace(".","")+"@"+words[1]);
        }
        return emailSet.size();
    }

}
