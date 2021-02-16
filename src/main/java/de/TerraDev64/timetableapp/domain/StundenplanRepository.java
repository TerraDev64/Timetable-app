package de.TerraDev64.timetableapp.domain;

public class StundenplanRepository {
	private String stundenplan;

	public StundenplanRepository(String stundenplan) {

		this.stundenplan = stundenplan;
	}

	public void addNewHour() {

	}

	public void deleteHour() {

	}

	public String[] getStundenplan() {
		return stundenplan.split("\n");
	}
}
