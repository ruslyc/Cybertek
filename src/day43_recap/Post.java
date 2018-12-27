package day43_recap;

import java.util.Random;

public class Post {
	
	private String body;
	private String date;
	private int likes;
	private int postID;
	
	public Post() {
		
		Random random = new Random();
		this.postID = random.nextInt(1000);
		
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}
	
	public void postInfo() {
		
		System.out.println("Body : "+ this.body);
		System.out.println("Likes : "+ this.likes);
		System.out.println("Date : "+ this.date);
	}
	
	

}
