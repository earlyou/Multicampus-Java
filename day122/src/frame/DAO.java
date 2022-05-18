package frame;

import java.util.List;
	
public interface DAO<K,V> {	// 알파벳은 아무거나 가능
	
	// CRUD
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public Object select(K k) throws Exception;
	public List<V> select() throws Exception;
}