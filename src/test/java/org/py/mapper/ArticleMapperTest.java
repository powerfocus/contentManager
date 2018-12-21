package org.py.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.py.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {App.class})
public class ArticleMapperTest {
    @Autowired
    private ArticleMapper artMapper;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test() {
        artMapper.selectAll().forEach(System.out::println);
    }
    @Test
    public void test2() {
        System.out.println(jdbcTemplate);
    }
}