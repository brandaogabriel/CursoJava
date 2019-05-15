package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private int likes;
	private ArrayList<Comment> comment;
	
	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		this.comment = new ArrayList<>();
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public ArrayList<Comment> getComment() {
		return comment;
	}	
	
	public void addComment(Comment comment) {
		this.comment.add(comment);
	}
	
	public void removeComment(Comment comment) {
		this.comment.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + System.lineSeparator());
		sb.append(this.likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(this.moment) + System.lineSeparator());
		sb.append(this.content + System.lineSeparator());
		sb.append("Comments: " + System.lineSeparator());
		for (Comment c : this.comment) {
			sb.append(c.getText() + System.lineSeparator());
		}
		return sb.toString();
	}
	
	
	
}
