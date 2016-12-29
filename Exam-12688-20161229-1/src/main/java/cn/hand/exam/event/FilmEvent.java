package cn.hand.exam.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

import cn.hand.exam.entity.FilmInformation;

public class FilmEvent extends ApplicationEvent {
	private String message;
	private FilmInformation film ;
	public FilmEvent(FilmInformation film ) {
		super(film);
		this.film=film;	
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
