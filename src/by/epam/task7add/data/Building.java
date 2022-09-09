package by.epam.task7add.data;

import java.io.*;
import java.util.*;

public class Building implements Serializable
{
	private static final long serialVersionUID = 1L;

	private List<Flat> listFlat;

	public Building()
	{
		listFlat = new ArrayList<>();
	}

	public Building(List<Flat> listFlat)
	{
		this.listFlat = listFlat;
	}

	public void setListFlat(List<Flat> listFlat)
	{
		this.listFlat = listFlat;
	}

	public List<Flat> getListFlat()
	{
		return listFlat;
	}

	public void add(Flat flat)
	{
		listFlat.add(flat);
	}

	public void delete(Flat flat)
	{
		listFlat.remove(flat);
	}

	@Override
	public int hashCode() {
		return Objects.hash(listFlat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Building other = (Building) obj;
		return Objects.equals(listFlat, other.listFlat);
	}

	@Override
	public String toString() {
		return "Building [listFlat=" + listFlat + "]";
	}

}
