import java.util.*; 
  
class GfG { 
  
    static class Stack { 
        
        static Queue<Integer> q1 = new LinkedList<Integer>(); 
        static Queue<Integer> q2 = new LinkedList<Integer>(); 
  
        
        static int c_size; //current size
  
        Stack() 
        { 
            c_size = 0; 
        } 
  
        static void push(int x) 
        { 
            c_size++; 
  
           
            q2.add(x); //element in empty q2
  
            
            while (!q1.isEmpty()) { 
                q2.add(q1.peek()); 
                q1.remove(); 
            } 
  
            
            Queue<Integer> q = q1; //swap 
            q1 = q2; 
            q2 = q; 
        } 
  
        static void pop() 
        { 
  
            
            if (q1.isEmpty()) //no elements in q1
                return; 
            q1.remove(); 
            c_size--; 
        } 
  
        static int top() 
        { 
            if (q1.isEmpty()) 
                return -1; 
            return q1.peek(); 
        } 
  
        static int size() 
        { 
            return c_size; 
        } 
    } 
  
    
    public static void main(String[] args) 
    { 
        Stack s = new Stack(); 
        s.push(1); 
        s.push(2); 
        s.push(3); 
  
        System.out.println("current size: " + s.size());   //3
        System.out.println(s.top()); //3
        s.pop(); 
        System.out.println(s.top()); //2
        s.pop(); 
        System.out.println(s.top()); //1
  
        System.out.println("current size: " + s.size()); //1
    } 
} 
