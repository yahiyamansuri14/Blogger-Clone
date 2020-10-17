package io.marsab.minorproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.marsab.minorproject.dao.PostRepository;
import io.marsab.minorproject.model.Post;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostRepository postRepository;
	@Override
	public void savePost(Post post) {
		postRepository.save(post);
		
	}
	@Override
	public List<Post> showAllPost() {
		return postRepository.findAll();		
	}

}
