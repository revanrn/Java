package com.deloitte.ClassRoomManagement;

import java.util.ArrayList;

public class ClassRoomImpl implements RoomInterface{

	
	@Override
	
	public ClassRoom createRooms(String name1, String clsid, String noOfSystems, String projector, String ac) {
		// TODO Auto-generated method stub
		ClassRoom obj = new ClassRoom();
		obj.setName(name1);
		obj.setClassRoomId(Integer.parseInt(clsid));
		obj.setNumberOfSystems(Integer.parseInt(noOfSystems));
		obj.setProjector(Boolean.parseBoolean(projector));
		obj.setAc(Boolean.parseBoolean(ac));
		obj.setAvailability(true);
		return obj;		
	}

	@Override
	public ClassRoom searchRooms(int roomId,ArrayList<ClassRoom> list) {
		// TODO Auto-generated method stub
		for(ClassRoom room:list) {
			if(room.getClassRoomId()==roomId)
				return room;
		}
		return null;
	}


	@Override
	public ArrayList<ClassRoom> availability(int noOfSystems, ArrayList<ClassRoom> list) {
		// TODO Auto-generated method stub
		ArrayList<ClassRoom> availableRooms = new ArrayList<ClassRoom>();
		for(ClassRoom room:list) {
			if(room.getNumberOfSystems()>=noOfSystems && room.isAvailability()) {
				availableRooms.add(room);
			}
		}
		return availableRooms;
	}


	@Override
	public boolean loginValidate(String username, String password) {
		// TODO Auto-generated method stub
		String uid="Revanth";
		String paswd="Classroom2019!";
		if(uid.equals(username) && paswd.equals(password))
			return true;
		else
		return false;
	}

}
