package mjsd4;

public class Main {
	public static void main(String[] args) {
		CollectionCustom<Integer> integerCollection = new CollectionCustom<>();
		integerCollection.showArray();
		integerCollection.add(2);
		integerCollection.add(3);
		integerCollection.add(4);
		integerCollection.add(5);
		integerCollection.showArray();
		integerCollection.addFirst(1);
		integerCollection.showArray();
		integerCollection.add(6);
		integerCollection.add(7);
		integerCollection.add(8);
		integerCollection.add(9);
		integerCollection.add(10);
		integerCollection.add(11);
		integerCollection.add(12);
		integerCollection.showArray();
		integerCollection.remove(5);
		integerCollection.showArray();
		System.out.println(integerCollection.empty());
		integerCollection.removeAll();
		System.out.println(integerCollection.empty());
		
		CollectionCustom<String> stringCollection = new CollectionCustom<>();
		stringCollection.add(", ");
		stringCollection.add("como va");
		stringCollection.add("? ");
		stringCollection.showArray();
		stringCollection.addFirst("Hola");
		stringCollection.showArray();
		stringCollection.add("todo");
		stringCollection.add("bien");
		stringCollection.add("? ");
		stringCollection.showArray();
		stringCollection.remove("todo");
		stringCollection.showArray();
		System.out.println(stringCollection.empty());
		stringCollection.removeAll();
		System.out.println(stringCollection.empty());
	}
}
