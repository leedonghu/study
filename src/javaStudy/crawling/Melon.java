package javaStudy.crawling;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Melon {
	public static void main(String[] args) {
		
		String url = "https://www.melon.com/chart/index.htm";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements titles = doc.select("div.ellipsis.rank01>span>a");
		Elements artists = doc.select("div.ellipsis.rank02>span");
		Elements rankElement = doc.select("td>div.wrap.t_center>span.rank");
		for(Element e : titles) {
			String song = e.text();
			System.out.println("제목: " + song);
			System.out.println(song.length());
		}
		System.out.println("================================");
		for(Element e : artists) {
			String artist = e.text();
			System.out.println("가수: " + artist);
			System.out.println(artist.length());
		}
		
		for(Element e : rankElement) {
			String rank = e.text();
			int iRank = Integer.parseInt(rank);
			System.out.println("랭킹: " + iRank);
			
		}
		
		System.out.println("================================");
		
	}
}
