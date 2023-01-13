public class CustomStack {
  int[] arr;
  int size,top;

  public CustomStack(int size){
      arr=new int[size];
      this.size=size;
      top=-1;
  }

  public void push(int value){
      if(top+1==this.size) throw new RuntimeException("length exceeded");
      arr[++top]=value;
  }

  public int pop(){
      if(top==-1) throw new RuntimeException("No element present");
      return arr[top--];
  }

  public int top(){
      if(top==-1) throw new RuntimeException("No element present");
      return arr[top];
  }

  public int size(){
      return top+1;
  }


  public static void main(String[] args) {

      CustomStack s = new CustomStack(5);
      s.push(6);
      s.push(3);
      s.push(7);
      System.out.println("Top of the stack before deleting any element " + s.top());
      System.out.println("Size of the stack before deleting any element " + s.size());
      System.out.println("The element deleted is " + s.pop());
      System.out.println("Size of the stack after deleting an element " + s.size());
      System.out.println("Top of the stack after deleting an element " + s.top());
  }
}
