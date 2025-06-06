
import java .util.ArrayList;
import java.util.Collections;
public class Min_Heap {
    public static void InsertElement(ArrayList<Integer> Heap , int element){
        Heap.add(element);
        int i = Heap.size() - 1;
        while (i > 0) {
            int parentIndex = (i - 1) / 2;
            if (Heap.get(parentIndex) > Heap.get(i)) {
                 int temp = Heap.get(parentIndex);
                Heap.set(parentIndex, Heap.get(i));
                Heap.set(i, temp);
            } else {
                break;
            }   
        }
    }

    public static int  DeleteElement(ArrayList<Integer> Heap) {
        if (Heap.size() == 0) {
            return 0;
        }
        int lastIndex = Heap.size() - 1;
        int root = Heap.get(0);
        Heap.set(0, Heap.get(lastIndex));
        Heap.remove(lastIndex);
        
        int i = 0;
        while (i < Heap.size()) {
            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;
            int smallestIndex = i;

            if (leftChildIndex < Heap.size() && Heap.get(leftChildIndex) < Heap.get(smallestIndex)) {
                int temp  = Heap.get(leftChildIndex);
                Heap.set(i, temp);
            }
            if (rightChildIndex < Heap.size() && Heap.get(rightChildIndex) < Heap.get(smallestIndex)) {
                smallestIndex = rightChildIndex;
            }
            if (smallestIndex != i) {
                Collections.swap(Heap, i, smallestIndex);
                i = smallestIndex;
            } else {
                break;
            }

            
        }
        return root;
    }
    public static void main(String[] args) {
          ArrayList<Integer> Heap = new ArrayList<>();
            Heap.add(21);
            Heap.add(19);
            Heap.add(20);
            Heap.add(15);
            Heap.add(14);
            Heap.add(5);
            Heap.add(0);
            Heap.add(3);
            InsertElement(Heap, 10);
            int get = DeleteElement(Heap);
            
      }
  }

