package com.westar.controller;

import com.westar.pojo.User;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.directory.SearchResult;
import java.util.List;

@Controller
public class ElasticSearchController {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @ResponseBody
    @RequestMapping("/search")
    private String findDoc(){
        QueryBuilder builder = QueryBuilders.existsQuery("first name");

        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(builder)
                .build();

        List<User> userList = elasticsearchTemplate.queryForList(searchQuery,User.class);
        for (User user:userList) {
            System.out.println(user.toString());
        }
        return "success";

    }
}
