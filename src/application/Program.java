package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

/* / Programa principal. / */
public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* / Iniciando o formato da data. / */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
		
		/* / Instanciando os coment�rios ' c1 e c2' e o post ' p1 './ */
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zealand","I'm going to visit this wonderful country!",12);
		
		/* / Adicionando os coment�rios no post, usando a fun��o addComment. / */
		p1.addComment(c1);
		p1.addComment(c2);
		
		/* / Instanciando os coment�rios ' c3 e c4' e o post ' p2 './ */
		Comment c3 = new Comment("Good night.");
		Comment c4 = new Comment("May the Force be with you.");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Good night guys","See you tomorrow",5);
		
		/* / Adicionando os coment�rios no post, usando a fun��o addComment. / */
		p2.addComment(c3);
		p2.addComment(c4);

		/* / Print dos posts, com os coment�rios. / */
		System.out.println(p1);
		System.out.println(p2);
		
		
		sc.close();
	}

}
