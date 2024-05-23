package Praktikum07;

public class Stack {
    public int size;
    public char[] data;
    public int top;

    public Stack(int size) {
        this.size = size;
        this.data = new char[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void push(char dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            char temp = data[top];
            top--;
            return temp;
        } else {
            System.out.println("Stack kosong");
            return '\0';
        }
    }

    public char peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong");
            return '\0'; 
        }

    }

    public void clear() {
        top = -1;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}

// package Praktikum07;

// public class Stack {
//     public int size;
//     public String[] data;
//     public int top;
    

//     public Stack(int size) {
//         this.size= size;
//         this.data= new String[size];
//         this.top= -1;
//     }

//     public boolean isEmpty() {
//         return (top == -1);
//     }

//     public boolean isFull() {
//         return (top == size -1);
//     }

    

//     public void push (char dt) {
//         if (!isFull()) {
//             top ++;
//             data[top] = dt;
//         } else {
//             System.out.println("Stack penuh");
//         }
//     }
      
//     public char pop() {
//         if (!isEmpty()) {
//           char temp = data[top];
//           top--;
//           return temp;
//         } else {
//           return '\0';
//         }
//     }

//     public char peek() {
//         if (!isEmpty()) {
//             return data[top];
//         } else {
//             return '\0';
//         }
        
//     }

//     public void clear() {
//         top = -1;
//     }
    
//     public void print() {
//         for (int i = top; i>= 0; i--) {
//             System.out.println(data[i]);
//         }
//     }

      
// }
