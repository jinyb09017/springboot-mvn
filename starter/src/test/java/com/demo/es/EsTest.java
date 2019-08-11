package com.demo.es;

import com.demo.es.model.Item;
import com.xingze.demo.starter.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jinyb on 2019/8/11.
 * jyb@sina.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class EsTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

//    @Test
//    public void testCreateIndex() {
//        elasticsearchTemplate.createIndex(Item.class);
//    }
    @Test
    public void test(){

    }
}
