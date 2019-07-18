package com.hand.exam.exam3test.service;

import com.hand.exam.exam3test.dao.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhao'yin
 * Date 2019/7/18.
 */
@Service
public class FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Autowired
    private FilmService filmService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insertFilm() throws Exception {
        filmMapper.insertFilm();
        int i = 12 / 0;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insertFilm2() {
        try {
            filmService.insertFilm();
        } catch (Exception e) {
            System.out.println("第二次插入");
        }
        filmMapper.insertFilm();
    }
}