package es.upm.miw.apaw.ecp2.api.entities;

public enum Level {
	BEGINNER("BEGINNER"),
	NORMAL("NORMAL"),
	EXPERT("EXPERT");
	
	private String level;

	Level(String level) {
		this.level = level;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
}
