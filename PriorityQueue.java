//import java.io.*;
/**
 * Write a description of class PriorityQueue here.
 * 
 * @author Kimberly Faiai
 * @version 
 */
public class PriorityQueue
{
    //instaintiate heap
   public int[] heap = new int[59];
   int x = 0;
    
//     /**
//      * Constructor for objects of class PriorityQueue
//      */
//     public PriorityQueue()
//     {
//        // heap = null;
//     }

 
    
    public void add(int value)
    {
       heap[0]++;
        int index = heap[0];
        heap[index]=value;
       while(index > 1)
        {
            int parentIndex = index/2;
            if(value > heap[parentIndex])
            {
                heap[index] = heap[parentIndex];
                heap[parentIndex] = value;
                index = parentIndex;
            }else{
              return;
        }
            
        } 
    }
    
    public int remove()
    {
        int root = heap[1];
       // int value = heap[heap[0]];
        int value=heap[0];
        heap[1] = value;
      
        //heap[heap[0]] = 0;
        heap[0]=0;
        int index = 1;
        while(index*2 < heap[0]){
        int leftIndex = index*2;
        int rightIndex= index*2+1;
        int leftValue = heap[leftIndex];
        int rightValue = Integer.MIN_VALUE;
        if(rightIndex < heap[0]){
        rightValue = heap[rightIndex];
        }
        int largerIndex = leftIndex;
        if(rightValue > leftValue){
        largerIndex = rightIndex;
        }
        if(value < heap[largerIndex]){
        heap[index] = heap[largerIndex];
        heap[largerIndex] = value;
        index = largerIndex;
        }else{
        break;
        }
        
        }
        heap[0]--;
        return root;
    }
    
    public int getSize(){

     for(int i = 0; i<heap.length;i++)
     if(heap[i]==0)
     {x++;}
       x = heap.length - x;
        return x;
    }
}
