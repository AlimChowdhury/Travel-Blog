package com.example.travelblog.service;
import com.example.travelblog.model.Blog;
import com.example.travelblog.utils.BlogForm;

import java.io.IOException;
import java.util.List;

public interface BlogService {

    void saveBlog(BlogForm form) throws IOException;

    void saveBlog(BlogForm form, String id) throws IOException;

    List<Blog> getBlogList(String userName);

    byte[] loadImageFile(String imgPath) throws IOException;

    void deleteBlogItem(String Id);

    Blog getBlogItem(String Id) throws RuntimeException;
}