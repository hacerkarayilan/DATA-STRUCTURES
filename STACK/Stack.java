package stack;

public interface Stack<type> {
boolean isEmpty();
void push(type item);
type pop();
type top();
type show();
void enqueue(type data);
type dequeue();
type front();
}
