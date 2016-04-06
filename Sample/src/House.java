
public class House {
	
	private Room parentsRoom;
	private Room kidsRoom;
	private Room visitRoom;
	
	public House(Room parentsRoom, Room kidsRoom, Room visitRoom) {
		this.parentsRoom = parentsRoom;
		this.kidsRoom = kidsRoom;
		this.visitRoom = visitRoom;
	}

	public Room getParentsRoom() {
		return parentsRoom;
	}

	public Room getKidsRoom() {
		return kidsRoom;
	}

	public Room getVisitRoom() {
		return visitRoom;
	}
	
	public void removeChair(Room room, int chairs){
		System.out.println("Available chairs: "+room.getChairs());
		room.setChairs(room.getChairs()-chairs);
		System.out.println("New available chairs: "+room.getChairs());
	}
	
}
