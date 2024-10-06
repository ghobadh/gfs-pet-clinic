package ca.gforcesoftware.gargamelclinic.services;

import java.util.Set;

/**
 * @author gavinhashemi on 2024-10-05
 */
public interface CrudService <T,ID> {
    Set<T> findAll();
    T findById(ID id) ;
    T save(T t) ;
    void delete(T t) ;
    void deleteById(ID id) ;

}
