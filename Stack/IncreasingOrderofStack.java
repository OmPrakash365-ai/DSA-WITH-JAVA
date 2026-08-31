package Stack;

import java.util.Stack;

public class IncreasingOrderofStack {

      public static void ReverseTheStack(Stack<Integer> st ){
        Stack<Integer> s = new Stack<>();
        while(!st.isEmpty()){
            int temp = st.pop();

            while(!s.isEmpty() && s.peek() < temp){
                st.push(s.pop());
            }
            s.push(temp);
        }
        while(!s.isEmpty()){
            st.push(s.pop());
        }
        
    }

    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(41);
        st.push(3);
        st.push(32);
        st.push(2);
        st.push(11);
        ReverseTheStack(st);
        System.out.println(st);
    }   
}
