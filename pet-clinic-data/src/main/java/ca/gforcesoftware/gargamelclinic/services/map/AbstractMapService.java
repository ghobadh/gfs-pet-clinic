package ca.gforcesoftware.gargamelclinic.services.map;

import ca.gforcesoftware.gargamelclinic.model.BaseEntity;

import java.util.*;

/**
 * @author gavinhashemi on 2024-10-05
 */
public abstract class AbstractMapService <T extends BaseEntity,ID extends Long>{
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object  ){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("The object cannot be null");
        }
        return object;
    }
    void delete(T object){
        map.entrySet().removeIf( x-> x.getValue().equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }

    /* I added this method to get rid of adding ID in each data entry.
        Note that we have to extends T to BaseEntity and extend ID to Long.
        Also, we change the Map to accept Long in line 11 when we define the map.
        We removed ID from all other service maps.
     */
    private  Long getNextId(){
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException ex){
            nextId  = 1L;
        }
        return nextId;
    }
}
