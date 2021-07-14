import models.Post;
import models.User;
import services.PostService;
import services.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        PostService postService = new PostService();

        User masha = new User("Masha","Petrova", "masha@petrova.com");
        userService.saveUser(masha);

        System.out.println(masha);

        Post post1 = new Post(masha, "My first record", "Hello world!");
        System.out.println(post1);
        Post post2 = new Post(masha, "My second record", "Hello my friend!");
        System.out.println(post2);

        postService.savePost(post1);
        postService.savePost(post2);

        System.out.println("User " + masha.getName() + " posts:");

        List<Post> posts = (List<Post>) postService.findPostUser(masha);

        for (Post savedPost:
             posts) {

            System.out.println(savedPost);

        }

    }
}
