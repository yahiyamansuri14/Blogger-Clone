package io.marsab.minorproject.service;

import java.util.List;

import io.marsab.minorproject.model.Post;

public interface PostService {
	public void savePost(Post post);
	public List<Post> showAllPost();

}
