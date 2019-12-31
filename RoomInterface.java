package com.deloitte.ClassRoomManagement;

import java.util.ArrayList;

public interface RoomInterface {
	public ClassRoom createRooms(String name1,String clsid, String noOfSystems,String projector,String ac);
	public ClassRoom searchRooms(int roomId, ArrayList<ClassRoom> list);
	public ArrayList<ClassRoom> availability(int noOfSystems,ArrayList<ClassRoom> list);
	public void allocateRoom(int noOfSystems);
	public ClassRoom[] displayRoom();

}




