public class Q443 {
    public static  int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        String s="";
        int i=0;

        while(i<=chars.length-1){
            int j=i;
            int count=1;
            while(j<chars.length-1 && chars[i]==chars[j+1] )
            {
                count++;
                j++;
            }
            if(count==1){
                s=s+chars[i];
            }
            else {
                s=s+chars[i]+count;
            }

            i=j+1;

        }
        System.out.println(s);
        for (int j = 0; j < s.length(); j++) {
            chars[j]=s.charAt(j);
        }
        System.out.println(chars);
        return s.length();

    }

    public static void main(String[] args) {
        char[] s={'a'};
        System.out.println(compress(s));
    }
}
