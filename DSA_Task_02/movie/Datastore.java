package t2dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import t2dsa.Movie;

public class Datastore {

	public static void displayDetails(Map<String, Object> detail) {
		System.out.print(detail.get("moTitle"));
		System.out.print(detail.get("moActor"));
		System.out.print(detail.get("moGenere"));
		System.out.println(detail.get("moYear"));

		List<Movie> movilist = (List<Movie>) detail.get("moMovie");
		for (Movie movie : movilist) {
			String title = movie.getTitle();
			String actor = movie.getActor();
			String genere = movie.getGenere();
			int year = movie.getYear();
			

			System.out.println("[ " + title + ", " + actor + ", " + genere + ", " + year + "]");
		}
	}
	public static void main(String[] args) {
		List<Movie> Movielist = new ArrayList<>(4);
		Map<String, Object> movMap = new HashMap<String, Object>();
		
		Movie m1 = new Movie();
		m1.setTitle("Sura");
		m1.setActor("vijay");
		m1.setGenere("masala");
		m1.setYear(2008);
		
		Movie m2 = new Movie();
		m2.setTitle("Thuppakki");
		m2.setActor("vijay");
		m2.setGenere("Fight");
		m2.setYear(2012);
		
		Movie m3 = new Movie();
		m3.setTitle("Vivekam");
		m3.setActor("Ajith");
		m3.setGenere("Action");
		m3.setYear(2016);
		
		Movie m4 = new Movie();
		m4.setTitle("Arambam");
		m4.setActor("Ajith");
		m4.setGenere("Action");
		m4.setYear(2012);
		
		Movie m5 = new Movie();
		m5.setTitle("Maina");
		m5.setActor("Darma");
		m5.setGenere("romance");
		m5.setYear(2010);
		
		Movie m6 = new Movie();
		m6.setTitle("Singam");
		m6.setActor("Surya");
		m6.setGenere("Action with Romance");
		m6.setYear(2010);
		
		Movie m7 = new Movie();
		m7.setTitle("Kabali");
		m7.setActor("Rajani");
		m7.setGenere("Action");
		m7.setYear(2016);
		
		Movie m8 = new Movie();
		m8.setTitle("Pichchakaran");
		m8.setActor("VijayAntony");
		m8.setGenere("love");
		m8.setYear(2016);
		
		Movie m9 = new Movie();
		m9.setTitle("24");
		m9.setActor("Surya");
		m9.setGenere("romance");
		m9.setYear(2016);
		
		Movie m10 = new Movie();
		m10.setTitle("iraivi");
		m10.setActor("v.j.Surya");
		m10.setGenere("Action with Romance");
		m10.setYear(2016);
	
		Movielist.add(m1);
		Movielist.add(m2);
		Movielist.add(m3);
		Movielist.add(m4);
		Movielist.add(m5);
		Movielist.add(m6);
		Movielist.add(m7);
		Movielist.add(m8);
		Movielist.add(m9);
		Movielist.add(m10);
		
		movMap.put("moTitle", "Title     ");
		movMap.put("moActor", "Actor     ");
		movMap.put("moGenere", "Genere   ");
		movMap.put("moYear", "Year       ");
		movMap.put("moMovie", Movielist);

	
		
		displayDetails(movMap);
		
	}

}
