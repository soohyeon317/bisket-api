package com.bisket.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Transactional
class BisketApiApplicationTests {

    @Autowired
    EntityManager entityManager;

//    @Test
//    void contextLoads() {
//    }

}
