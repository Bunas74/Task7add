package by.epam.task7add.logic;

import java.util.*;

import by.epam.task7add.data.*;

public class SelectionFlat
{
	public List<Flat> byNumberOfRooms(List<Flat> listFlat, int numberOfRooms)
	{
		List<Flat> temp = new ArrayList<>();
		for (Flat element: listFlat)
		{
			if (element.getNumberOfRooms() == numberOfRooms)
			{
				temp.add(element);
			}
		}
		return temp;	
	}

	public List<Flat> byNumberOfRoomsAndFloor(List<Flat> listFlat, int numberOfRooms, int lowerLimitOfFloors, int upperLimitOfFloors)
	{
		List<Flat> temp = new ArrayList<>();
		for (Flat element: listFlat)
		{
			if (element.getNumberOfRooms() == numberOfRooms && element.getFloor() >= lowerLimitOfFloors && element.getFloor() <= upperLimitOfFloors)
			{
				temp.add(element);
			}
		}
		return temp;	
	}

	public List<Flat> bySelectedAreaFlat(List<Flat> listFlat, double selectedAreaFlat)
	{
		List<Flat> temp = new ArrayList<>();
		for (Flat element: listFlat)
		{
			if (element.getAreaFlat() > selectedAreaFlat)
			{
				temp.add(element);
			}
		}
		return temp;	
	}
	
}
