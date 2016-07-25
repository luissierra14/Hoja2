import java.util.Vector;

public class Stack<T> implements I_Stack<T> {
	private Vector<T> vector;
	public Stack(){
		vector = new Vector<T>();
	}
	
	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		vector.addElement(element);
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		
		if (!isEmpty()){
			T temp;
			temp=vector.lastElement();
			vector.removeElementAt(size()-1);
			return temp;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return vector.isEmpty(); //si esta vacio devuelve true y si tiene algo es false
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return vector.size();
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return pop();
	}
}
