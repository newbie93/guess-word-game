package game;

public enum WordGameLevel {
	
	EASY(4),
	MODERATE(5),
	HARD(6);
	
	private int value;
	
	private WordGameLevel(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}

}
