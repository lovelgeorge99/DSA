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
    public static void main(String[] args) {
        int[] arr1={1,2,4,4,4};
        int[] arr2={1,3,4,5};
        ListNode l1= addNodes(arr1);
        ListNode l2= addNodes(arr2);
        ListNode l=mergeTwoLists(l1,l2);
        printData(l);
//        l.val=2;
//        l.next.val=3;
//        l.next.next=null;
//        System.out.println(addTwoNumbers(l));


    }
}
