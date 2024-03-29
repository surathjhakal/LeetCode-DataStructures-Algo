  public static void sortedInsert(Stack<Integer> stack, int current) {
      if (stack.empty() || current > stack.peek()) {
          stack.push(current);
          return;
      }

      // Remove the top element
      int top = stack.peek();
      stack.pop();
      // Recursion for the remaining elements in the stack
      sortedInsert(stack, current);
      // Insert the popped element back in the stack
      stack.push(top);
  }

  public static void sortStack(Stack<Integer> stack) {
      // Base case: stack is empty
      if (stack.empty()) {
          return;
      }

      // Remove the top element
      int top = stack.peek();
      stack.pop();
      // Recursion for the remaining elements in the stack
      sortStack(stack);
      // Insert the popped element back in the sorted stack
      sortedInsert(stack, top);
  }
