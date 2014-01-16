package com.habuma.spitter.service;

import com.habuma.spitter.domain.Spittle;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author ralvarado
 */
@Named
public class JpaSpitterService implements SpitterService {

    @Override
    public List<Spittle> getRecentSpittles(int spittlesNumber) {
        Spittle spittle01 = new Spittle(1, new Date());
        spittle01.setText("Hello World");        
        Spittle spittle02 = new Spittle(2, new Date());
        spittle02.setText("Goodbye World");
        Spittle[] spittles = {spittle01, spittle02};
        return Arrays.asList(spittles);
    }
}
