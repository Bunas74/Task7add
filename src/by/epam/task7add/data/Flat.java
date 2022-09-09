package by.epam.task7add.data;

import java.io.*;
import java.util.Objects;

public class Flat implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int numberFlat;
	private double areaFlat;
	private int floor;
	private int numberOfRooms;
	private String street;
	private String typeBuilding;
	private int lifetime;

	public Flat()
	{

	}

	public Flat(int numberFlat, double areaFlat, int floor, int numberOfRooms, String street, String typeBuilding, int lifetime)
	{
		this.numberFlat = numberFlat;
		this.areaFlat = areaFlat;
		this.floor = floor;
		this.numberOfRooms = numberOfRooms;
		this.street = street;
		this.typeBuilding = typeBuilding;
		this.lifetime = lifetime;
	}

	public void setNumberFlat(int numberFlat)
	{
		this.numberFlat = numberFlat;
	}

	public int getNumberFlat()
	{
		return numberFlat;
	}

	public void setAreaFlat(double areaFlat)
	{
		this.areaFlat = areaFlat;
	}

	public double getAreaFlat()
	{
		return areaFlat;
	}

	public void setFloor(int floor)
	{
		this.floor = floor;
	}

	public int getFloor()
	{
		return floor;
	}

	public void setNumberOfRooms(int numberOfRooms)
	{
		this.numberOfRooms = numberOfRooms;
	}

	public int getNumberOfRooms()
	{
		return numberOfRooms;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getStreet()
	{
		return street;
	}

	public void setTypeBuilding(String typeBuilding)
	{
		this.typeBuilding = typeBuilding;
	}

	public String getTypeBuilding()
	{
		return typeBuilding;
	}

	public void setLifetime(int lifetime)
	{
		this.lifetime = lifetime;
	}

	public int getLifetime()
	{
		return lifetime;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(areaFlat, floor, lifetime, numberFlat, numberOfRooms, street, typeBuilding);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flat other = (Flat) obj;
		return Double.doubleToLongBits(areaFlat) == Double.doubleToLongBits(other.areaFlat) && floor == other.floor
				&& lifetime == other.lifetime && numberFlat == other.numberFlat && numberOfRooms == other.numberOfRooms
				&& Objects.equals(street, other.street) && Objects.equals(typeBuilding, other.typeBuilding);
	}

	@Override
	public String toString()
	{
		return "Flat [numberFlat=" + numberFlat + ", areaFlat=" + areaFlat + ", floor=" + floor + ", numberOfRooms="
				+ numberOfRooms + ", street=" + street + ", typeBuilding=" + typeBuilding + ", lifetime=" + lifetime
				+ "]";
	}
	
}
