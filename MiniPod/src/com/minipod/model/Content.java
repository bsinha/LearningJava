package com.minipod.model;

public class Content {
	private int id; // default // datatype
	private Type type; //enum
	private int size; 
	private Genre genre;
	private Language language;
	private String title; //class
	private Status status;
	private Producer producer; //class //Composition relationship
	private String path;

	private void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
	
		setId(1);
		return id;
	}




	public Type getType() {
		if(this.type== null) {
			this.type = Type.IMAGE;
			//setType(Type.IMAGE);
		}
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		
		this.size = size + 10;
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public Language getLanguage() {
		if(this.language == null) {
			this.language = Language.ENGLISH;
		}
		return language;
	}


	public void setLanguage(Language language) {
		this.language = language;
	}


	public String getTitle() {
		return title + "- Copyright by MiniPod";
	}


	public void setTitle(String title) {
		this.title = title ;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public Producer getProducer() {
		return producer;
	}


	public void setProducer(Producer producer) {
		this.producer = producer;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	@Override
	public String toString() {
		return "Content [id=" + id + ", type=" + type + ", size=" + size + ", genre=" + genre + ", language=" + language
				+ ", title=" + title + ", status=" + status + ", producer=" + producer + ", path=" + path + "]";
	}

	
}
