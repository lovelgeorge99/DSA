import java.util.List;

public class Q1239 {
    public static int maxLength(List<String> arr) {
        return solve(arr, 0, "");
    }


    public static int solve(List<String> arr, int i, String soFar)
    {
        if(i == arr.size())
        {

            if(hasDuplicate(soFar))
            {
                return soFar.length();
            }
            return 0;
        }

        int take = solve(arr, i+1, soFar);
        int dont = solve(arr, i+1, soFar+arr.get(i));

        return Math.max(take, dont);

    }


    public static boolean hasDuplicate(String s)
    {
        int[] freq = new int[26];

        for(int i=0;i<s.length();i++)
        {
            int val = s.charAt(i) - 'a';
            freq[val]++;

            if(freq[val]>1)
            {
                return false;
            }
        }

        return true;
    }

//    public static boolean hasDuplicate(String temp,String s){
//        int[] ch = new int[26];
//        System.out.println(temp);
//        for (int i = 0; i < temp.length(); i++) {
//            if(ch[temp.charAt(i)-'a']>0) {
//
//                return true;
//            }
//            ch[temp.charAt(i)-'a']+=1;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)>0){
//                return true;
//            }
//        }
//
//
//        return false;
//    }
//    public static int solve(List<String> arr,String temp,int i,int n){
//        if(i>=n){
//            return temp.length();
//        }
//        int take=0;
//        int dont=0;
//
//        if(hasDuplicate(arr.get(i), temp)){
//            dont = solve(arr,temp,i+1,n);
//
//
//        }
//        else {
//            take =solve(arr,temp+arr.get(i),i+1,n);
//            dont = solve(arr,temp,i+1,n);
//        }
//
//        return Math.max(take,dont);
//
//
//    }
//    public static  int maxLength(List<String> arr) {
//        String temp="";
//        int n=arr.size();
//        return solve(arr,temp,0,n);
//    }

    public static void main(String[] args) {
//        String[] arr= {"cha","r","act","ers"};
        String[] arr= {"boyigtseknrzdw","zonypbkfqma","izyufqpgmoek","xkmvl","agrtujmhyzdseck","vmhsigowfqejuap","bqxaueskmdyifjvptro","sztlidyoqjfrkbg","ndwaijysqfbzh","mnazfdiph","bha","vgfcjwpieunm","jagonvhpbkq","pfowzdtsemrjgahc","yinfdcgwljs"};
        System.out.println(maxLength(List.of(arr)));
    }
}
