
import java.util.*;
// expression 10+20-24*4/2-4.5=
public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter arithmetic expression:");
        String s = sc.nextLine();

        double result=0,n=0;
        char op='+';
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch==' '){
                i++;
                continue;
            }
            if(Character.isDigit(ch) || ch=='.'){
                String num=" ";
                while(i<s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) =='.')){
                    num+=s.charAt(i);
                    i++;
                }
                n=Double.parseDouble(num);
                if(ch=='+'){
                    result += n;
                } else if(ch=='-'){
                    result -= n;
                } else if(ch=='*'){
                    result *= n;
                } else if(ch=='/'){
                    if(n==0){
                        System.out.println("Cannot divide by zero");
                        return;  
                    }
                    result -= n;
                }
                continue;
            }
            if(ch=='='){
                break;
            }
            op=ch;
            i++;
        }

        System.out.println("Result = " + result);
    }
}
