package by.epam.task7add.main;

import java.util.*;

import by.epam.task7add.data.*;
import by.epam.task7add.logic.*;
import by.epam.task7add.view.*;

public class Main
{
	public static void main(String[] args)
	{

		/* Создайте класс Flat, спецификация которого приведена ниже.
		 Создайте второй класс, агрегирующий объекты типа Flat.
		 Определите подходящие методы для реализации этих классов.
		 Задайте критерии выбора данных и выведите эти данные на консоль. 

		 Flat: Номер квартиры, Площадь, Этаж, Количество комнат,
		 Улица,Тип задния, Срок эксплуатации. 

		 Найти и вывести: 
		 a) список квартир, имеющих заданное количество комнат; 
		 b) список квартир, имеющих заданное количество комнат и
		 расположенных на этаже, который находится в заданном промежутке; 
		 c) список квартир, имеющих площадь, превосходящую заданную. */

		final int NUMBER_OF_ROOMS = 2;
		final int LOWER_LIMIT_OF_FLOORS = 2;
		final int UPPER_LIMIT_OF_FLOORS = 4;
		final double SELECTED_AREA_FLAT = 50.5;

		Output output = new Output();
		SelectionFlat selectionFlat = new SelectionFlat();
		Building building = new Building();

		building.add(new Flat(12, 29.7, 3, 1, "Krasnaya", "brick", 19));
		building.add(new Flat(124, 45.4, 2, 2, "Serova", "panel", 16));
		building.add(new Flat(15, 61.2, 4, 3, "Landora", "brick", 21));
		building.add(new Flat(18, 52.4, 10, 2, "Kirova", "panel", 11));
		building.add(new Flat(25, 66.2, 3, 3, "Kalinina", "panel", 13));
		building.add(new Flat(116, 48.5, 2, 2, "Bunina", "panel", 19));
		building.add(new Flat(166, 50.7, 4, 2, "Bersona", "brick", 21));
		building.add(new Flat(13, 32.7, 5, 1, "Krasnaya", "brick", 19));
		building.add(new Flat(23, 49.0, 8, 2, "Svobodnaya", "panel", 3));
		building.add(new Flat(35, 67.5, 3, 3, "Gorkogo", "brick", 13));

		List<Flat> selectedByNumberOfRooms = selectionFlat.byNumberOfRooms(building.getListFlat(), NUMBER_OF_ROOMS);
		List<Flat> selectedByNumberOfRoomsAndFloor = selectionFlat.byNumberOfRoomsAndFloor(building.getListFlat(), NUMBER_OF_ROOMS, LOWER_LIMIT_OF_FLOORS, UPPER_LIMIT_OF_FLOORS);
		List<Flat> selectedByAreaFlat = selectionFlat.bySelectedAreaFlat(building.getListFlat(), SELECTED_AREA_FLAT);

		output.printFlat("List of flat:", building.getListFlat());
		output.printFlat("List of flat selected by rooms number:", selectedByNumberOfRooms);
		output.printFlat("List of flat selected by rooms number ant floors number:", selectedByNumberOfRoomsAndFloor);
		output.printFlat("List of flat selected by area of flat:", selectedByAreaFlat);
		
	}
}
