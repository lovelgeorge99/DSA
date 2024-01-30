import java.util.Stack;

public class Q150 {
    public static  int evalRPN(String[] tokens) {
        Stack<Integer> s= new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+")){
                int a=s.pop();
                int b=s.pop();
                s.push(a+b);
            }
            else if (tokens[i]== "-") {
                int a=s.pop();
                int b=s.pop();
                s.push(b-a);
            }
            else if (tokens[i]== "*") {
                int a=s.pop();
                int b=s.pop();
                s.push(a*b);
            }
            else if (tokens[i]== "/") {
                int a=s.pop();
                int b=s.pop();
                s.push(b/a);
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
    public static void main(String[] args) {
    String[] tokens={"4","13","5","/","+"  };
        System.out.println(evalRPN(tokens));
    }
}
