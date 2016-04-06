
public class Room {
	private String bed;
	private int chairs;
	private int windows;
	private boolean bathroom;
	
	public Room(String bed, int chairs, int windows, boolean bathroom) {
		this.bed = bed;
		this.chairs = chairs;
		this.windows = windows;
		this.bathroom = bathroom;
	}

	public String getBed() {
		return bed;
	}

	public int getChairs() {
		return chairs;
	}

	public int getWindows() {
		return windows;
	}

	public boolean isBathroom() {
		return bathroom;
	}

	public void setChairs(int chairs) {
		this.chairs = chairs;
	}
	
	
}
