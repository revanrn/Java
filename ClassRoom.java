package com.deloitte.ClassRoomManagement;

public final class ClassRoom {
	private String name;
	private int classRoomId;
	private int numberOfSystems;
	private boolean projector;
	private boolean ac;
	private String faculty;
	private boolean availability;
	private static int count;
	public ClassRoom() {
		count++;
	}
	static {
		count=0;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		ClassRoom.count = count;
	}
	public int getClassRoomId() {
		return classRoomId;
	}
	public void setClassRoomId(int classRoomId) {
		this.classRoomId = classRoomId;
	}
	public int getNumberOfSystems() {
		return numberOfSystems;
	}

	public boolean isProjector() {
		return projector;
	}
	public void setProjector(boolean projector) {
		this.projector = projector;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setNumberOfSystems(int numberOfSystems) {
		this.numberOfSystems = numberOfSystems;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public boolean isAvailability() {
		return availability;
	}
	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", classRoomId=" + classRoomId + ", numberOfSystems=" + numberOfSystems
				+ ", projector=" + projector + ", ac=" + ac + ", faculty=" + faculty + ", availability=" + availability
				+ "]";
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}
