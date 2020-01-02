package com.deloitte.ClassRoomManagement;

import java.util.*;

public class Demo {
	public static void main(String atgs[]) {
		ClassRoom[] obja = null;
		Scanner sc = new Scanner(System.in);
		ArrayList<ClassRoom> list=new ArrayList<ClassRoom>();                                                        
		while (true) {
			System.out.println("1.Add New Room.");
			System.out.println("2.Search for the room.");
			System.out.println("3.Display Room Details.");
			System.out.println("4.Allocate the room.");
			System.out.println("5.Exit the application.");
			System.out.println("6.Number of Rooms added.");
			System.out.println("7.Login User.");
			System.out.println("Please Enter your choice : ");
			String choice = sc.next();
			ClassRoomImpl objimpl=new ClassRoomImpl();
			switch (Integer.parseInt(choice)) {
			case 1:
					System.out.println("Enter Class Name: ");
					String name1 = sc.next();
					System.out.println("Enter ClassRoom ID: ");
					String clsid = sc.next();
					System.out.println("Enter the Number of Systems needed: ");
					String noOfSystems = sc.next();
					System.out.println("Do you need a projector: ");
					String projector = sc.next();
					System.out.println("Do you need Air Conditioning: ");
					String ac = sc.next();					
					ClassRoom rooms1 = objimpl.createRooms(name1, clsid, noOfSystems, projector, ac);
					list.add(rooms1);
				break;
			case 2:
				if (obja.length > 0) {
					System.out.println("Enter the Room ID you wish to search : ");
					int id = sc.nextInt();
					ClassRoom rooms=objimpl.searchRooms(id, list);
					if(rooms==null) {System.out.println("No room found!!");}
					else {System.out.println(rooms);}					
				}				
				else {System.out.println("No Rooms to search");}
				break;
			
			case 3:
				for (ClassRoom obj : list) {
					System.out.println(obj);
				}
				break;
			case 4:
				System.out.println("Enter the minimum of systems : ");
				int val = sc.nextInt();
				System.out.println("Enter the number of rooms : ");
				int val1 = sc.nextInt();
				ArrayList<ClassRoom> availablerooms=objimpl.availability(val, list);
				
				if(availablerooms.size()>=val1) {
					for(ClassRoom availroom:availablerooms) {
						for(ClassRoom roomList:list) {
							if(availroom.getClassRoomId()==roomList.getClassRoomId()) {
								System.out.println("Enter the name of the Faculty : ");
								String facul=sc.next();
								roomList.setFaculty(facul);
								roomList.setAvailability(false);
								break;
							}
						}
					}
					
				}
				else {
					System.out.println("Do not have enough Rooms.");
				}
				break;
			case 5:
				System.exit(0);
				break;
			case 6:
				System.out.println("Number of rooms added are : " + ClassRoom.getCount());
			case 7:
				System.out.println("Welcome to the Signup page.\nPlease Enter the username :");
				String username=sc.next();
				System.out.println("Please Enter the password : ");
				String password=sc.next();
				boolean flag = objimpl.loginValidate(username, password);
				if(flag)
					System.out.println("Login validated!! :)");
				else
					System.out.println("Please enter the right details");
			}

		}
		// System.out.println("Class Name : "+obj.getName());
		// System.out.println("Class Room ID : "+obj.getClassRoomId());
		// System.out.println("Number of Systems : "+obj.getNumberOfSystems());
		// System.out.println("Projector : "+obj.isProjector());
		// System.out.println("AirConditioning : "+obj.isAc());
		// System.out.println("Faculty : "+obj.getFaculty());
		// System.out.println("Availability of ClassRoom "+obj.isAvailability());

	}

}
