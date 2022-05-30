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
		
		Elements element = doc.select("tr.1st50");
		
		System.out.println("================================");
		
	}
}
