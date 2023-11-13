package datastructures.linkedlist;

//https://leetcode.com/problems/design-browser-history/
public class _1472 {

    private static int length = 0;
    private static ListNode<String> head = new ListNode<>();
    private static ListNode<String> current = head;

    static class BrowserHistory {

        public BrowserHistory(String homepage) {
            head.val = homepage;
            length++;
        }

        public void visit(String url) {
            ListNode<String> pageVisited = new ListNode<>(url);
            current.next = pageVisited;
            current = current.next;
            length++;
        }

        public String back(int steps) {
            current = head;
            if(steps > length)
                return current.val;

            int moveForward = length - steps;
            while(moveForward-- > 0) {
                current = current.next;
            }

            return current.val;
        }

        public String forward(int steps) {
            while(steps-- > 0 && current.next != null) {
                current = current.next;
            }
            current.next = null;

            return current.val;
        }
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com"); // You are in "facebook.com". Visit "youtube.com"

        System.out.println(browserHistory.back(1));    // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        System.out.println(browserHistory.back(1));                   // You are in "facebook.com", move back to "google.com" return "google.com"

        System.out.println(browserHistory.forward(1));                // You are in "google.com", move forward to "facebook.com" return "facebook.com"

        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"

        System.out.println(browserHistory.forward(2));                // You are in "linkedin.com", you cannot move forward any steps.

        System.out.println(browserHistory.back(2));                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        System.out.println(browserHistory.back(7));                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
    }
}
