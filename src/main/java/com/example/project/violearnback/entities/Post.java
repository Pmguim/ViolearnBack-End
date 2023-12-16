package com.example.project.violearnback.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="posts")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Post {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
	private String text;
	private String userName;
    private String postImage;
	private int likeCount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference("user_post")
    private User user;

    @Override
    public String toString() {
    	return "Post [Id=" + Id + ", text=" + text + ", userName=" + userName + ", postImage=" + postImage
    			+ ", likeCount=" + likeCount + "]";
    }
}
