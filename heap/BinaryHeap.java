package heap;

public class BinaryHeap<Type extends Comparable<? super Type>> implements Heap<Type>{

	private static final int DEFAULT_CAPACITY = 17;
	private Object[] array;
	private int size;
	
	public BinaryHeap() {
		array = new Object[DEFAULT_CAPACITY];
		size = 0;
	}
	
	public BinaryHeap(int capacity) {
		array = new Object[capacity+1];
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		//TODO
		
	}

	@Override
	public void makeEmpty() {
		//TODO
	}
	
	private void expandCapacity() {
		Object[] newArray = new Object[array.length*2];
		for(int i = 1; i <= size; i++) { //cannot use front & back anymore
			//back or front or both may have crossed the array's end due to circular structure
			newArray[i] = array[i];
		}
		array = newArray;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void insert(Type data) {
		if(size==array.length-1)
			expandCapacity();
		int hole=++size;
		array[0]=data;
		while(data.compareTo((Type)array[hole/2])<0){
			array[hole]=array[hole/2]
		}
		
		//TODO
	}

	@SuppressWarnings("unchecked")
	@Override
	public Type findMin() {
		//TODO 
	}

	@Override
	public Type deleteMin() {
		
		// TODO
	}
	
	@SuppressWarnings("unchecked")
	private void percolateDown(int hole) {
		
		
		//TODO
	}
	
	public BinaryHeap(Type[] array) {
		//reserve sufficient capacity
		int capacity = (int) Math.pow(2, Math.ceil(Math.log(array.length)) + 1) + 1;
		this.array = new Object[capacity];
		size = array.length; 
		
		//copy items in the order they are provided
		for(int i = 1; i <= array.length; i++)
			this.array[i] = array[i-1];
		
		//heapify all contents
		buildHeap();
	}
	
	private void buildHeap() {
		for(int i = size/2; i > 0; i--)
			percolateDown(i);
	}
	
	public String toString() { //similar to an array's String representation. skips the sentinel!
		String res = "[";
		if(size > 0)
			res = res + array[1].toString();
		for(int i = 2; i <= size; i++)
			res = res + ", " + array[i].toString();
		res = res + "]";
		return res;
	}
	
	public static void main(String[] args) {
		Heap<Integer> heap = new BinaryHeap<>();
		System.out.println("Empty heap:\n" + heap.toString());
		heap.insert(10);
		System.out.println("After insert(10):\n" + heap.toString());
		heap.insert(20);
		System.out.println("After insert(20):\n" + heap.toString());
		heap.insert(100);
		System.out.println("After insert(100):\n" + heap.toString());
		heap.insert(2);
		System.out.println("After insert(2):\n" + heap.toString());
		heap.deleteMin();
		System.out.println("After deleteMin():\n" + heap.toString());
		heap.deleteMin();
		System.out.println("After deleteMin():\n" + heap.toString());
		
		Integer[] vals = {59, 36, 58, 21, 41, 97, 31, 16, 26, 53};
		heap = new BinaryHeap<>(vals);
		System.out.println("buildHeap result:\n" + heap.toString());
		
	}
}