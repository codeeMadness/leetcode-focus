package DataStructures.Arrays;

import java.util.HashSet;
import java.util.Set;

public class _929 {

    public static int numUniqueEmails(String[] emails) {
        Set<String> results = new HashSet<>();
        for(String email : emails) {
            String item = "";
            boolean metPlus = false;
            int i = 0;
            while(email.charAt(i) != '@') {
                Character current = email.charAt(i);
                if(!metPlus && current == '+')
                    metPlus = true;
                else if(!metPlus && current != '.')
                    item += current;
                i++;
            }
            item += email.substring(i);
            results.add(item);
        }
        return results.size();
    }

    public static void main(String[] args) {
//        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}; //2
        String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"}; //3
        System.out.println(numUniqueEmails(emails));
    }
}
