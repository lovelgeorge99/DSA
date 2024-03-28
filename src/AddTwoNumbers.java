import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddTwoNumbers {

      public static class ListNode {
          int val;
         ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


//      Q2  ============================================================
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2) {
      ListNode l= new ListNode(0);
      ListNode tail=l;
      int c=0;

      while (l1!=null || l2!=null)
      {
          int s;
          if(l2==null){
               s =l1.val+c;
              l1=l1.next;
          }
          else if (l1==null){
                s = l2.val + c;
              l2=l2.next;
          }
          else{
          s =l1.val+l2.val+c;
              l2=l2.next;
              l1=l1.next;
          }
          ListNode temp= new ListNode();
          if(s>=10){
                temp.val=s%10;
                c=1;
          }
          else {
              c=0;
              temp.val=s;
          }
          tail.next=temp;
          tail=temp;




      }
        if(c==1){
            ListNode temp= new ListNode();
            temp.val=c;
            tail.next=temp;
            tail=temp;

        }

//        while (l1 != null) {
//            int s =l1.val+c;
//            ListNode temp= new ListNode();
//            if(s>=10){
//                temp.val=s%10;
//                c=1;
//            }
//            else {
//                c=0;
//                temp.val=s;
//            }
//            tail.next=temp;
//            tail=temp;
//            l1=l1.next;
//
//        }
//        if(c==1){
//            ListNode temp= new ListNode();
//            temp.val=c;
//            tail.next=temp;
//            tail=temp;
//
//        }
        ListNode r= l.next;
        l.next=null;

    return r;

    }
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


//    Q21===================================================
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode tail=head;

        while (list1!=null || list2!=null){
            int digit1= (list1!=null)? list1.val:Integer.MAX_VALUE;
            int digit2= (list2!=null)? list2.val:Integer.MAX_VALUE;

            ListNode newNode= new ListNode();
            newNode.val=Math.min(digit1,digit2);
            tail.next=newNode;
            tail=newNode;

            if(digit1<=digit2){
                list1=(list1!=null)?list1.next:null;
            }
            else{
                list2=(list2!=null)?list2.next:null;
            }

        }
        ListNode res=head.next;
        head.next=null;
        return res;
    }
//xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public static  void printData(ListNode l1){
          while (l1!=null){
              System.out.print(l1.val+" ");
              l1=l1.next;
          }
    }

    public static ListNode addNodes(int[] arr){
        ListNode l= new ListNode(arr[0]);
        ListNode tail=l;

        for (int i = 1; i < arr.length; i++) {

            ListNode temp= new ListNode();
            temp.val=arr[i];
            tail.next=temp;
            tail=temp;
        }
        return l;
    }



//    Q19===============================
        public static ListNode removeNthFromEnd(ListNode head, int n) {
            int c=1;
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
                c+=1;
            }

            if(n==c){
                head=head.next;
                return head;
            }
            int d=c-n;
            temp=head;
            int t=1;
            while(t!=d){
                temp=temp.next;
                t+=1;
            }
            temp.next=temp.next.next;
            return head;
        }


    //    Q141============================
    public boolean hasCycle(ListNode head) {

        ListNode t=head;
        ListNode r=head;

        while(t!=null || r!=null){
            t=t.next;
            r=r.next;
            if(t.val==r.val){
               return true;
            }

        }

        return false;

    }

//    Q1171
    public static ListNode removeZeroSumSublists(ListNode head) {
        int prefixSum = 0;
        Map<Integer, ListNode> map = new HashMap<>();

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        map.put(0, dummy);

        while (head != null) {
            prefixSum += head.val;

            if (map.containsKey(prefixSum)) {
                ListNode p = map.get(prefixSum);
                ListNode start = p;
                int pSum = prefixSum;

                while (start != head) {
                    start = start.next;
                    pSum += start.val;
                    if (start != head) {
                        map.remove(pSum);
                    }
                }

                p.next = start.next;

            } else {
                map.put(prefixSum, head);
            }

            head = head.next;
        }

        return dummy.next;
    }

//    Q1669 =========================
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
          ListNode head=list1;
          ListNode start=list2;
          while (list2.next!=null){
              list2=list2.next;
          }
          ListNode end= list2;


          int c=1;
          while (c!=a){
            list1=list1.next;
            c++;
          }
          ListNode temp1=list1;
          while(c!=b+1){
              list1=list1.next;
              c++;
          }
        System.out.println(list1.val);

          temp1.next=start;
          end.next=list1;
          return head;




    }

//    Q206 ===================
    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;

    }

//    Q234 ===========================================
    public static boolean isPalindrome(ListNode head) {
          return true;
    }
    public static void main(String[] args) {
        int[] arr1={1};
        int[] arr2={1,3,4,5};
        ListNode l1= addNodes(arr1);
//        ListNode l2= addNodes(arr2);
//        ListNode l=mergeTwoLists(l1,l2);
//        printData(l);
//        l.val=2;
//        l.next.val=3;
//        l.next.next=null;
//        System.out.println(addTwoNumbers(l));
        printData(removeNthFromEnd(l1,1));


    }
}
