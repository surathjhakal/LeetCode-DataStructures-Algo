import java.util.Stack;

class ImplementQueueUsingStack {
  Stack< Integer > input = new Stack < > ();
  Stack < Integer > output = new Stack < > ();

  public void push(int x) {
      input.push(x);
  }
  public int pop() {
      if (output.empty())
          while (input.empty() == false) {
              output.push(input.peek());
              input.pop();
          }
      int x = output.peek();
      output.pop();
      return x;
  }
  public int peek() {
      if (output.empty())
          while (input.empty() == false) {
              output.push(input.peek());
              input.pop();
          }
      return output.peek();
  }
  public int size() {
      return (output.size() + input.size());
  }
}
