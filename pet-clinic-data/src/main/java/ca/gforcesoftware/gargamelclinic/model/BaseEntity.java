package ca.gforcesoftware.gargamelclinic.model;

import java.io.Serializable;

/**
 * @author gavinhashemi on 2024-10-05
 */
public class BaseEntity  implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
