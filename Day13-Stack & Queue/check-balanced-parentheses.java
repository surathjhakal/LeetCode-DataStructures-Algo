  public static boolean checkBalancedParentheses(String s) {
      Stack<Character> st = new Stack<Character>();
      for (char current : s.toCharArray()) {
          if (current == '(' || current == '[' || current == '{')
              st.push(current);
          else {
              if(st.isEmpty()) return false;
              char poppedValue = st.pop();
              if((current == ')' && poppedValue == '(') ||  (current == ']' && poppedValue == '[') || (current == '}' && poppedValue == '{')) continue;
              else return false;
          }
      }
      return st.isEmpty();
  }
