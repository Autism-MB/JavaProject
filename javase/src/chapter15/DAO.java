package chapter15;

import java.util.*;

/**
 * @author Mr.Xiao
 * @date 2022/06/27 15:40
 * @Contain
 **/
@SuppressWarnings("all")
public class DAO<T> {
    private Map<String, T> map = new HashMap<String, T>();

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for(String key : keySet) {
            list.add(map.get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }
}
