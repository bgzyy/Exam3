package com.hand.exam.exam3test.controller;

import com.hand.exam.exam3test.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhao'yin
 * Date 2019/7/18.
 */
@Controller
public class MainController {

    @Autowired
    private FilmService service;

    @RequestMapping("/")
    @ResponseBody
    public void insertData() {
        service.insertFilm2();
    }
}