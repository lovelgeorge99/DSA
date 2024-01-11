import java.util.HashMap;
import java.util.Map;

public class Q345 {
    public static  String reverseVowels(String s) {
      Map<Character, Integer> m = new HashMap<>();
      m.put('a',1);
      m.put('e',1);
      m.put('i',1);
      m.put('o',1);
      m.put('u',1);
      m.put('A',1);
      m.put('E',1);
      m.put('I',1);
      m.put('O',1);
      m.put('U',1);

      char[] array = s.toCharArray();

    int left=0;
    int right=s.length()-1;
    while (left<right){
        if(m.containsKey(array[left]) && m.containsKey(array[right])){
           char temp=array[right];
           array[right]=array[left];
           array[left]=temp;
           left++;
           right--;

        }
        if(!m.containsKey(array[left])){
            left++;
        }
        if(!m.containsKey(array[right])){
            right--;
        }


    }

    return String.valueOf(array);
    }

    public static void main(String[] args) {
        String s="Live on evasions? NO, I save no evil.";
        System.out.println(reverseVowels(s));
    }


}
