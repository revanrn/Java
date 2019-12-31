package com.deloitte.ClassRoomManagement;

import java.util.Scanner;

public class Demo {
	public static void main(String atgs[]) {
		ClassRoom[] obja = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Add New Room ");
			System.out.println("2.Search for the room ");
			System.out.println("3.Display Room Details ");
			System.out.println("4.Allocate the room");
			System.out.println("5.Exit the application");
			System.out.println("Please Enter your choice : ");
			String choice = sc.next();
			switch (Integer.parseInt(choice)) {
			case 1:
				System.out.println("Enter the number of Rooms: ");
				String num = sc.next();
				obja = new ClassRoom[Integer.parseInt(num)];
				for (int i = 0; i < obja.length; i++) {
					ClassRoom obj = new ClassRoom();
					System.out.println("Enter Class Name: ");
					String name1 = sc.next();
					obj.setName(name1);
					System.out.println("Enter ClassRoom ID: ");
					String clsid = sc.next();
					obj.setClassRoomId(Integer.parseInt(clsid));
					System.out.println("Enter the Number of Systems: ");
					String noOfSystems = sc.next();
					obj.setNumberOfSystems(Integer.parseInt(noOfSystems));
					System.out.println("Do you need a projector: ");
					String projector = sc.next();
					obj.setProjector(Boolean.parseBoolean(projector));
					System.out.println("Do you need Air Conditioning: ");
					String ac = sc.next();
					obj.setAc(Boolean.parseBoolean(ac));
					obj.setAvailability(true);
					obja[i] = obj;
				}
				break;
			case 2:
				if (obja.length > 0) {
					System.out.println("Enter the Room ID you wish to search : ");
					int id = sc.nextInt();
					for (int k = 0; k < obja.length; k++) {
						if (id == obja[k].getClassRoomId()) {
							System.out.println(obja[k]);
						}
						break;
					}
				} else {
					System.out.println("No Rooms to search");
				}
				break;
			case 3:
				for (ClassRoom obj : obja) {
					System.out.println(obj);
				}
				break;
			case 4:
				System.out.println("Enter the minimum of systems : ");
				int val = sc.nextInt();
				boolean flag = false;
				for (int j = 0; j < obja.length; j++) {
					if (obja[j].getNumberOfSystems() >= val && obja[j].isAvailability()) {
						obja[j].setAvailability(false);
						System.out.println("Enter the name of the faculty : ");
						String fac = sc.next();
						obja[j].setFaculty(fac);
						flag = true;
					}
				}
				if (flag)
					System.out.println("Room Assigned Sucessfully");
				else
					System.out.println("No rooms available");
				break;

			case 5:
				System.exit(0);
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
