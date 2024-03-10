package Solved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution1472 {
    class BrowserHistory {
        class History{
            String url;
            History pre;
            History next;
            History(String str){
                url = str;
            }
        }

        History head, cur;
        public BrowserHistory(String homepage) {
            head = new History("");
            cur = new History(homepage);
            head.next = cur;
            cur.pre = head;
        }

        public void visit(String url) {
            cur.next = new History(url);
            cur.next.pre = cur;
            cur = cur.next;
        }

        public String back(int steps) {
            for (int i = 0; i < steps; i++) {
                if (cur.pre == null) break;
                cur = cur.pre;
            }
            if (cur.url.equals(""))
                cur = cur.next;
            return cur.url;
        }

        public String forward(int steps) {
            for (int i = 0; i < steps; i++) {
                if (cur.next == null) break;
                cur = cur.next;
            }
            return cur.url;
        }
    }
}
