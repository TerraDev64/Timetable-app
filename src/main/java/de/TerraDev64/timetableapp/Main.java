package de.TerraDev64.timetableapp;

import de.TerraDev64.timetableapp.domain.StundenplanRepository;
import de.TerraDev64.timetableapp.adapters.FileManager;
import de.TerraDev64.timetableapp.domain.StundenplanRepository;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static final String FILEPATH = "Stundenplan.csv";
	// private static final String FILEPATH = "src/main/resources/Stundenplan_19-20.csv";

	private final StundenplanRepository stundenplanRepository;

	public Main() {

		var fileContent = "";
		try {
			fileContent = FileManager.readFile(FILEPATH);
		} catch (IOException e) {
			System.err.println("Die Datei " + FILEPATH + " konnte nicht gelesen werden");
			System.exit(-1);
		}

		stundenplanRepository = new StundenplanRepository(fileContent);

		System.out.println("Stundenplan Verwaltung von TerraWest\n");

		printMenu();

		var scanner = new Scanner(System.in);

		//noinspection InfiniteLoopStatement
		while (true) {
			var menuString = scanner.nextLine().replaceAll("\n", "");
			switch (menuString) {
				case "s", "S" -> showStundenplan();
				case "e", "E" -> saveDataInFileAndExit();
			}

			printMenu();
		}
	}

	private void printMenu() {
		System.out.println(
				"""
						Geben bitte den passenden Buchstaben für den gewünschten Menüpunkt ein:
						                
						s => Zeige Stundenplan
						e => Beenden 
						""");
	}

	private void showStundenplan() {

		var stunden = stundenplanRepository.getStundenplan();

		if (stunden.length < 1 || stunden[0].isEmpty()) {
			System.out.println("Der Stundenplan enthält keine Elemente.");
		} else {
			for (String line : stunden) {
				System.out.println(line);
			}
		}
	}

	private void saveDataInFileAndExit() {
		// TODO: save data in file
		System.exit(0);
	}

	public static void main(String[] args) {
		new Main();
	}
}