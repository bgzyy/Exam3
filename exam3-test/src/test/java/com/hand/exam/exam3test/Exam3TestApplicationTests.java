package com.hand.exam.exam3test;

import com.hand.exam.exam3test.dao.FilmMapper;
import com.hand.exam.exam3test.service.FilmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Exam3TestApplicationTests {

    @Autowired
    private FilmMapper filmMapper;

    @Test
    public void contextLoads() {
        filmMapper.insertFilm();
    }

    @Autowired
    private FilmService filmService;

    @Test
    public void test() {
        filmService.insertFilm2();
    }
}
