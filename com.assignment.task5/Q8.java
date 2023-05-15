import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        String str1 = "[(])";
        Stack<Character> stack = new Stack<Character>();
        boolean flag = false;
        char temp;
        for(int i=0;i<str1.length();i++){
            temp = str1.charAt(i);
            if(temp == '(' || temp == '[' || temp == '{'){
                stack.push(temp);
                continue;
            }

            if (temp == ')'){
                char check = stack.pop(); 
                if (check == '[' || check == '{'){
                    System.out.println("not balanced");
                    flag = true;
                    break;
                }
            }
            else if (temp == ']'){
                char check = stack.pop(); 
                if (check == '(' || check == '{'){
                    System.out.println("not balanced");
                    flag = true;
                    break;
                }
            }
            else if (temp == '}'){
                char check = stack.pop(); 
                if (check == '[' || check == '('){
                    System.out.println("not balanced");
                    flag = true;
                    break;
                }
            }
            else{
                continue;
            }
        }

        if (flag == false){
            System.out.println("balanced");
        }
                
        }
    }
