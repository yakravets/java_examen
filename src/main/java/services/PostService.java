package services;

import dao.PostDao;
import models.Post;
import models.User;

import java.util.List;

public class PostService {

    private final PostDao postDao = new PostDao();

    public PostService() {
    }

    public Post findPost(int id){ return postDao.findById(id);}

    public List<Post> findPostUser(User user){ return postDao.findByUser(user);}

    public void savePost(Post post){ postDao.save(post);}

    public void updatePost(Post post){ postDao.update(post);}

    public void deletePost(Post post){ postDao.delete(post);}
}
