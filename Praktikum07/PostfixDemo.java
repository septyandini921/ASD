package Praktikum07;

public class PostfixDemo {
    public static void main(String[] args) {
     String infix = "5*4^(1+2)%3";
     System.out.println("Infix: " + infix);
     System.out.println("Postfix: " + konversi(infix)); 
       
    }

    public static boolean isOperand(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) || (c == '.');
    }

    public static boolean isOperator(char c) {
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+' );
    }

    public static int getDerajat(char c) {
        switch (c) {
          case '^':
            return 3;
          case '%':
            return 2;
          case '/':
            return 2;
          case '*':
            return 2;
          case '-':
            return 1;
          case '+':
            return 1;
          default:
            return 0;
        }
    }

    public static String konversi (String infix) {
        Stack operators = new Stack(infix.length());
        String postfix = "";
        char c;

        for (int i = 0; i< infix.length(); i++) {
            c = infix.charAt(i);

            if (isOperand(c)) {
                postfix = postfix+c;
            }
            else if (c == '(') {
                operators.push(c);
            }
            else if ( c == ')') {
                while (operators.peek() != '(') {
                    postfix = postfix + operators.pop();
                }
                operators.pop();
            }
            else if (isOperator(c)) {
                while (getDerajat(operators.peek()) >= getDerajat(c)) {
                    postfix = postfix + operators.pop();
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            postfix += operators.pop();
        }
        return postfix;
    }
      
    public static int hitungPostfix(String postfix) {
        Stack operands = new Stack(postfix.length());
        char c;
        int operand = 0;
    
        for (int i = 0; i < postfix.length(); i++) {
            c = postfix.charAt(i);
    
            if (isOperand(c)) {
                operand = operand * 10 + (c - '0'); 
            } else if (isOperator(c)) {
                operands.push((char) (operand + '0')); 
                operand = 0; 
                int operand2 = operands.pop() - '0'; 
                int operand1 = operands.pop() - '0'; 
                int hasil = 0; 
    
                switch (c) {
                    case '^':
                        hasil = (int) Math.pow(operand1, operand2);
                        break;
                    case '%':
                        hasil = operand1 % operand2;
                        break;
                    case '/':
                        hasil = operand1 / operand2;
                        break;
                    case '*':
                        hasil = operand1 * operand2;
                        break;
                    case '-':
                        hasil = operand1 - operand2;
                        break;
                    case '+':
                        hasil = operand1 + operand2;
                        break;
                }
                operands.push((char) (hasil + '0')); 
            }
        }
        
        int hasilOperasi = operands.pop() - '0';
        System.out.println("Hasil operasi = " + hasilOperasi); 
        return hasilOperasi;
    }
    
      
}
