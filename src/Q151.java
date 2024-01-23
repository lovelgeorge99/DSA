import java.util.ArrayList;
import java.util.List;

public class Q151 {
    public static String reverseWords(String s) {
        String str="";
        String temp="";
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)!=' '){
                temp=temp+s.charAt(i);
            }
            else if(temp!=""){
                if(str==""){
                    str=temp+str;
                }
                else{

                    str=temp+" "+str;
                }

                temp="";
            }
        }
        if(temp!=""){
            return temp+" "+str;
        }
        else{
            return str;
        }


    }

    public static void main(String[] args) {
        String s="lovel";
        System.out.println(reverseWords(s));

    }
}
