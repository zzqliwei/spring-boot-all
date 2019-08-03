package com.westar.controller;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@SpringBootTest(classes =SpringController.class )
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class SpringControllerTest {

    @Autowired
    private SpringController springController;

    @Test
    public void first() {
        TestCase.assertEquals(this.springController.first(),"hello word");
    }
}