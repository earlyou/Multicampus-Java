package frame;

import java.util.List;

public interface DAO<K, V> {
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public Object select(K k) throws Exception;
	public List<V> select() throws Exception;
	public void update(K k, K k1, K k2) throws Exception;
	public void update(K k, K k1) throws Exception;
}
