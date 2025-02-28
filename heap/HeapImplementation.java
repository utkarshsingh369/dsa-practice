package heap;

import java.util.ArrayList;
import java.util.List;

class MinHeap{
    private List<Integer> heapList; 
    int heapSize;
    MinHeap(){
        this.heapList = new ArrayList<>();
        this.heapSize=0;
    }

    void push(int val){
        this.heapList.add(val);
        this.heapSize++;
        this.stepUpHeapify();
    }

    int pop(){
        if(this.heapList.isEmpty()){
            System.out.print("EMPTY HEAP");
            return Integer.MAX_VALUE;
        }
        int popped = this.heapList.get(0);
        this.heapList.set(0, this.heapList.get(this.heapSize-1));
        this.heapList.remove(this.heapSize-1);
        this.heapSize--;
        this.stepDownHeapify();
        return popped;
    }

    private void stepUpHeapify(){
        int i = this.heapSize-1;
        int pivot = (i-1)/2;
        while(pivot>=0){
            if(this.heapList.get(pivot)>this.heapList.get(i)){
                swapInHeap(pivot, i);
                i=pivot;
                pivot = (i-1)/2;
            }else{
                break;
            }
        }
    }

    private void stepDownHeapify(){
        int i=0;
        int left = 2*i+1;
        int right= 2*i+2;
        while(left<this.heapSize && right < this.heapSize){
            if(this.heapList.get(left)<this.heapList.get(i)  || this.heapList.get(right)< this.heapList.get(i)){
                if(this.heapList.get(left)<this.heapList.get(right)){
                    swapInHeap(i, left);
                    i=left;
                }else{
                    swapInHeap(i, right);
                    i=right;
                }
                left = 2* i +1;
                right=2*i +2;
            }else{
                break;
            }
        }
        if(left<this.heapSize && right>=this.heapSize){   //i.e., no right child exists, but left exists
            if(this.heapList.get(left)<this.heapList.get(i)){
                swapInHeap(i, left);
            }
        }
    }

    private void swapInHeap(int i, int j){
        int temp = this.heapList.get(i);
        this.heapList.set(i, this.heapList.get(j));
        this.heapList.set(j, temp);
    }

    @Override
    public String toString() {
        return this.heapList.toString();
    }

}

public class HeapImplementation{
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.push(3);
        minHeap.push(1);
        minHeap.push(6);
        minHeap.push(5);
        minHeap.push(2);
        minHeap.push(8);

        System.out.println("HEAP: "+minHeap.toString()+"\n\n");

        System.out.print(minHeap.pop());
        System.out.println(minHeap.toString());

        System.out.print(minHeap.pop());
        System.out.println(minHeap.toString());

        System.out.print(minHeap.pop());
        System.out.println(minHeap.toString());

        System.out.print(minHeap.pop());
        System.out.println(minHeap.toString());

        System.out.print(minHeap.pop());
        System.out.println(minHeap.toString());

        System.out.print(minHeap.pop());
        System.out.println(minHeap.toString()); 
        
        System.out.print(minHeap.pop());
        System.out.println(minHeap.toString());

        System.out.print(minHeap.pop());
        System.out.println(minHeap.toString());


        System.out.println(minHeap.toString());
    }
}
