import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class FlatIterator implements Iterator<Integer>{

	private LinkedList<Object> elements= new LinkedList<Object>();
	
	public FlatIterator(List<Object> list) {
		elements.addAll(list);
		unwrap();
	}
	
	private void unwrap() {
		while(!elements.isEmpty() && elements.peek() instanceof List)
		{
			 List l = (List) elements.poll();
             elements.addAll(0, l);
		}
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return !elements.isEmpty();
	}

	@Override
	public Integer next() {
		if (hasNext()) {
			Integer val=(Integer)elements.poll();
			unwrap();
			return val;
		}
		return null;
	}

	@Override
	public void remove() {
		System.out.println("unimplemented yet");
	}

}
