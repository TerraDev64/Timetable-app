package de.TerraDev64.timetableapp.domain;

public interface StundenplanRepository {
	String stundenplan = "";

	public void addNewHour();

	public void deleteHour();

	public void deleteStundenplan();

	public String[] getStundenplan();
}
