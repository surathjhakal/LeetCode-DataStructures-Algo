class MinStack {
    Stack<Pair> ls;

    public MinStack() {
        ls = new Stack < > ();
    }
    public void push(int val) {
        int minVal=val;
        if(!ls.isEmpty() && ls.peek().minVal<minVal) minVal=ls.peek().minVal;
        ls.add(new Pair(val,minVal));
    }
    public void pop() {
        ls.pop();
    }
    public int top() {
        return ls.peek().val;
    }
    public int getMin() {
        return ls.peek().minVal;
    }
}
