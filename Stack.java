import java.util.Vector;

/**
 * 
 */

/**
 * @author luisd
 *
 */
public class Stack<T> implements I_Stack<T> {

	private Vector<T> vector;
	public Stack(){
		vector = new Vector<T>();
	}
	
	@Override
	public void Push(T element) {
		// TODO Auto-generated method stub
		vector.addElement(element);
	}

	@Override
	public T Pop() {
		// TODO Auto-generated method stub
		
		if (!IsEmpty()){
			T temp;
			temp=vector.lastElement();
			vector.removeElementAt(Size()-1);
			return temp;
		}
		return null;
	}

	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return vector.isEmpty(); //si esta vacio devuelve true y si tiene algo es false
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return vector.size();
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return Pop();
	}

}
