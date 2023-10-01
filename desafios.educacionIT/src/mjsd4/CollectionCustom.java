package mjsd4;

public class CollectionCustom <T> {
	private T[] array;
	private int size;
	
	public CollectionCustom() {
		array = (T[]) new Object[10];
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public void addFirst(T element) {
		resize();
		T[] newArray = (T[]) new Object[size*2];
		newArray[0] = element;
		for (int i = 0; i < size; i++) {
			newArray[i+1] = array[i];
		}
		array = newArray;
		size++;
	}
	
	public void addLast(T element) {
		resize();
		array[size] = element;
		size++;
	}
	
	public void add(T element) {
		addLast(element);
	}
	
	public T remove(T element) {
		T[] newArray = (T[]) new Object[size*2];
		int index = 0;
		for (T instance : array) {
			if (instance != null && !instance.equals(element)) {
				newArray[index] = instance;
				index++;
			}
		}
		array = newArray;
		size--;
		return element;
	}
	
	public void removeAll() {
		array = (T[]) new Object [10];
		size = 0;
	}
	
	public void showArray() {
		if (empty()) {
			System.out.println("La coleccion esta vacia.");
			return;
		}
		for (T element : array) {
			if (element != null) System.out.println(element);
		}
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	private void resize() {
		if (size == array.length) {
			T[] newArray = (T[]) new Object[size * 2];
			for (int i = 0; i < size; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}
	}
}
