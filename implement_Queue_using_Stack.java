class MyQueue {
    
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    // first choose what you want enqueue o(n)
    // deque in o(1)
    // i can make in constructor as well
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        
        s1.push(x);
        
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        
        
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s1.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return s1.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
