//Nick Soffa
//String Bag has ArrayList Program
//10/9

public class StringBagIsArrayList extends java.util.ArrayList implements SimpleCollection{

	public boolean add(Object o){
		if(!(o instanceof String) || o == null){
			throw new IllegalArgumentException();
		} else {
			return super.add(o.toString());
		}
	}

	public void clear(){
		super.clear();
	}

	public boolean contains(Object o){
		return super.contains(o.toString());
	}

	public boolean isEmpty(){
		return super.isEmpty();
	}

	public boolean remove(Object o){
		return super.remove(o.toString());
	}

	public int size(){
		return super.size();
	}

	public Object[] toArray(){
		return super.toArray();
	}
}