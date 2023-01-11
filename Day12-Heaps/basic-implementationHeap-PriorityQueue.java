public class Heap {
  private int[] H;
  private int size;
  private int maxSize;

  public Heap(int maxSize){
      this.maxSize=maxSize;
      this.size=0;

      this.H=new int[maxSize+1];
      this.H[0]=Integer.MIN_VALUE;
  }

  private int getParent(int pos){
      return pos/2;
  }

  private int getLeftChild(int pos){
      return pos*2;
  }

  private int getRightChild(int pos){
      return (pos*2)+1;
  }

  private boolean isLeaf(int pos){
      return (pos>this.size/2);
  }

  private void swap(int fpos,int spos){
      int temp=this.H[fpos];
      this.H[fpos]=this.H[spos];
      this.H[spos]=temp;
  }

  private void minHeapify(int pos)
  {
      if(!this.isLeaf(pos)){
          int swapPos= pos;
          // swap with the minimum of the two children
          // to check if right child exists. Otherwise default value will be '0'
          // and that will be swapped with parent node.
          if(getRightChild(pos)<=size)
              swapPos = H[getLeftChild(pos)]< H[getRightChild(pos)]?getLeftChild(pos):getRightChild(pos);
          else
              swapPos= H[getLeftChild(pos)];

          if(H[pos]> H[getLeftChild(pos)] || H[pos]> H[getRightChild(pos)]){
              swap(pos,swapPos);
              minHeapify(swapPos);
          }

      }
  }

  public void insert(int number){
      if(this.size>=this.maxSize) return;
      this.H[++size]=number;

      int current=this.size;
      while (this.H[current] < this.H[this.getParent(current)]) {
          this.swap(current, this.getParent(current));
          current = this.getParent(current);
      }
  }

  public void print()
  {
      for (int i = 1; i <= size / 2; i++) {

          // Printing the parent and both childrens
          System.out.print(
                  " PARENT : " + H[i]
                          + " LEFT CHILD : " + H[2 * i]
                          + " RIGHT CHILD :" + H[2 * i + 1]);

          // By here new line is required
          System.out.println();
      }
  }

  public int remove(){
      int pop=this.H[1];
      this.H[1]=this.H[size--];
      this.minHeapify(1);
      return pop;
  }
  
   public static void maxHeap(int[] arr){
      PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
      for(int num:arr){
          heap.add(num);
          System.out.print(heap.peek()+ " ");
      }
      System.out.println();

      for (int num:arr){
          heap.poll();
          System.out.print(heap.peek()+ " ");
      }

      System.out.println();
  }

  public static void minHeap(int[] arr){
      PriorityQueue<Integer> heap=new PriorityQueue<>();
      for(int num:arr){
          heap.add(num);
          System.out.print(heap.peek()+ " ");
      }
      System.out.println();

      for (int num:arr){
          heap.poll();
          System.out.print(heap.peek()+ " ");
      }

      System.out.println();
  }
}
