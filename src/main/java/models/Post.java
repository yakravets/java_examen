package models;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "title")
    private String Title;

    @Column(name = "body")
    private String Body;

    public Post(User user, String title, String body) {
        this.user = user;
        Title = title;
        Body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "user=" + user +
                ", Title='" + Title + '\'' +
                ", Body='" + Body + '\'' +
                '}';
    }

    public Post() {
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getTitle() {
        return Title;
    }

    public String getBody() {
        return Body;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setBody(String body) {
        Body = body;
    }
}
