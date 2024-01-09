public class AddTwoNumbers {

      public static class ListNode {
          int val;
         ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static int addTwoNumbers(ListNode l1) {
      int n=0;
      int d=1;
        while(l1.next!=null){
            n=n+(d*l1.val);
            d=d*10;
        }
        return n;


    }

    public static void main(String[] args) {
        ListNode l1= new ListNode();
//        l.val=2;
//        l.next.val=3;
//        l.next.next=null;
//        System.out.println(addTwoNumbers(l));

    }
}
