package com.github.hronom.graphqlspringbootplayground.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private PostDao postDao;

    public Query(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> recentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }

    public List<Post> recentPostsAdvanced(int count, int offset, Range range) {
        return postDao.getRecentPostsAdvanced(count, offset, range.getMin(), range.getMax());
    }
}
