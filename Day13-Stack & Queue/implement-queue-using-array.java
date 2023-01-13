public class CustomQueue {
  int front=-1,rear=-1;
  int size;
  int[] arr;
  int current_size=0;

  public CustomQueue(int size){
      this.size=size;
      arr=new int[size];
  }

  public void push(int value){
      if((rear+1)%size==front){
          return;
      }
      if(front==-1){
          front=0;
      }
      rear=(rear+1)%size;
      arr[rear]=value;
      current_size++;
  }

  public int pop(){
      if(front==-1){
          throw new RuntimeException("NO elemnts present");
      }
      int value=arr[front];
      if(front==rear){
          front=-1;
          rear=-1;
      }else{
          front=(front+1)%size;
      }
      current_size--;
      return value;
  }
  public int top(){
      if(front==-1){
          throw new RuntimeException("NO elemnts present");
      }
      return arr[front];
  }
  public int size(){
      if(front==-1){
          throw new RuntimeException("NO elemnts present");
      }
      return current_size;
  }
  public static void main(String args[]) {
      CustomQueue q = new CustomQueue(6);
      q.push(4);
      q.push(14);
      q.push(24);
      q.push(34);
      System.out.println("The peek of the queue before deleting any element " + q.top());
      System.out.println("The size of the queue before deletion " + q.size());
      System.out.println("The first element to be deleted " + q.pop());
      System.out.println("The peek of the queue after deleting an element " + q.top());
      System.out.println("The size of the queue after deleting an element " + q.size());
  }

}
