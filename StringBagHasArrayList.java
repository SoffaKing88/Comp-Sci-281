//Nick Soffa
//String Bag has ArrayList Program
//10/9
import java.util.ArrayList;

public class StringBagHasArrayList implements SimpleCollection{
	
	private ArrayList<String> bag;

	public StringBagHasArrayList(){
		this.bag = new ArrayList();
	}

	public boolean add(Object o){
		if(!(o instanceof String) || o == null){
			throw new IllegalArgumentException();
		} else {
			return this.bag.add(o.toString());
		}
	}

	public void clear(){
		this.bag.clear();
	}

	public boolean contains(Object o){
		return this.bag.contains(o.toString());
	}

	public boolean isEmpty(){
		return this.bag.isEmpty();
	}

	public boolean remove(Object o){
		return this.bag.remove(o.toString());
	}

	public int size(){
		return this.bag.size();
	}

	public Object[] toArray(){
		return this.bag.toArray();
	}
}