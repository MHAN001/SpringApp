package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.*;

/**
 * Created by jt on 7/21/18.
 */
public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(ID id, T object){

        if(object != null) {
//            if(id == null){
//                id = getNextId();
//            }

            map.put(id, object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    public void deleteById(ID id){
        map.remove(id);
    }

    public void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

//    private ID getNextId(){
//
//        Long nextId = null;
//
//        try {
//            nextId = Collections.max(map.keySet()) + 1;
//        } catch (NoSuchElementException e) {
//            nextId = 1L;
//        }
//
//        return nextId;
//    }
}
