public class Entry<K, V> {
	
	private int hash;
	private K key;
	private V value;
	private Entry<K, V> next;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public Entry(int hash, K key, V value, Entry<K, V> next) {
		this.hash = hash;
		this.key = key;
		this.value = value;
		this.next = next;
	}

	public void setHash(int newHash) {
		hash = newHash;
	}

	public void setKey(K newKey) {
		key = newKey;
	}

	public void setValue(V newValue) {
		value = newValue;
	}

	public void setNext(Entry<K, V> newEntry) {
		next = newEntry;
	}

	public int getHash() {
		return hash;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public Entry<K, V> getNext() {
		return next;
	}
}
