package ca.gforcesoftware.gargamelclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
public abstract class AbstractMapService <T,ID>{
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(ID id, T object  ){
        if(object != null){
            map.put(id, object);
        }
        return object;
    }
    void delete(T object){
        map.entrySet().removeIf( x-> x.getValue().equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }
}
