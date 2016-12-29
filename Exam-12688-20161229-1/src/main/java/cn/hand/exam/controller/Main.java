package cn.hand.exam.controller;

import java.util.Scanner;

import org.apache.ibatis.annotations.Insert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hand.exam.dao.FilmDao;
import cn.hand.exam.entity.FilmInformation;

public class Main {
	static Scanner in=new Scanner(System.in);
	static ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	public static void main(String[] args) {
		context.start();
		insertIntoFilm();
		context.stop();
	}

	private static FilmInformation insertIntoFilm() {
		System.out.println("请输入电影名称（title）：");
		String title=in.nextLine();
		System.out.println("请输入电影描述（description）:");
		String description=in.nextLine();
		System.out.println("请输入语言ID（language_id）");
		int language_id=in.nextInt();
		FilmInformation film =new FilmInformation();
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(language_id);
		return film;
		
	}

	
		
		
	}

