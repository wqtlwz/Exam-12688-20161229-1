package cn.hand.exam.serviceImpl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import cn.hand.exam.dao.FilmDao;
import cn.hand.exam.entity.FilmInformation;
import cn.hand.exam.event.FilmEvent;
import cn.hand.exam.service.FilmService;



public class FilmServiceImpl implements ApplicationContextAware,FilmService{

	private ApplicationContext applicationContext;
	private FilmDao filmDao;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
		
	}

	public int addUser(FilmInformation film) {
		return 0;
	
		
	}
	

}
