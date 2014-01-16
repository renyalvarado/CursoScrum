package com.habuma.spitter.persistence;

import com.habuma.spitter.domain.Spitter;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ralvarado
 */
@Repository
public class JpaSpitterDAO implements SpitterDAO {
   
    @Override
    public void addSpitter(Spitter spitter) {

    }

    @Override
    public Spitter getSpitterById(Integer id) {
        Spitter spitter = new Spitter(1, "johndoe");
        return spitter;
    }
    
}
