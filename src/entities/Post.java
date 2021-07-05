package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* / Classe Post. / */
public class Post {
	
	/* / Instanciando o formato de data. / */
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	/* / Instanciando a lista coment�rios, com a classe comment. / */
	private List<Comment> comments = new ArrayList<>();

	/* / Construtor sem parametros. / */
	public Post() {
	}

	/* / Construtor com parametros. / */
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	/* / Metodos gets e sets. / */
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

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	/* / Fun��o para adicionar coment�rios na lista comment. / */
	public void addComment(Comment comment) {
		comments.add(comment);
	}

	/* / Fun��o para remover coment�rios na lista comment. / */
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	/* / Fun��o toString, usando StringBuilder com sb de vari�vel. / */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment)+ "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n" );
		for (Comment c : comments){
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
