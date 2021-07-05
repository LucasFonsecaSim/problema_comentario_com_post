package entities;

/* / Classe comentário. / */
public class Comment {
	
	private String text;
	
	/* / Construtores / */
	public Comment(){
	}

	public Comment(String text) {
		this.text = text;
	}
	
	/* / Metodos get e set. / */
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
};