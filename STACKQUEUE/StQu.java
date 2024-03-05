package SQ;

public interface StQu<type> {
		public void enqueue(type data);
		public type dequeue();
		public type front();
		public boolean isEmpty();
		public void show();
		public int size();
		void push(type item);
		type pop();
		type top();

		}
