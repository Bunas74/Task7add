package by.epam.task7add.view;

import java.util.*;

import by.epam.task7add.data.*;

public class Output
{
	
	public void printFlat(String title, List<Flat> listFlat)
	{		
		System.out.println(title);
		System.out.println("---------------------------------------------------------------");
		System.out.printf("|%-6s|%-6s|%-6s|%-6s|%-10s|%-13s|%-8s|\n", "N FLAT", "AREA", "FLOOR", "ROOMS", "STREET",
				"TYPE BUILDING", "LIFETIME");
		System.out.println("---------------------------------------------------------------");
		for (Flat element : listFlat)
		{
			System.out.printf("|%-6d|%-6.1f|%-6d|%-6d|%-10s|%-13s|%-8d|\n", element.getNumberFlat(),
					element.getAreaFlat(), element.getFloor(), element.getNumberOfRooms(), element.getStreet(),
					element.getTypeBuilding(), element.getLifetime());
		}
		System.out.println("---------------------------------------------------------------");
	}
	
}
