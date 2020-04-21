package de.TerraWest.timetableapp.domain;

public class StundenplanRepository {

  // private List<PlanElement> stundenListe;
  private String stundenplan;

  public StundenplanRepository(String stundenplan) {

    this.stundenplan = stundenplan;

    /*
    var csvParser = new CsvParser();
    this.stundenListe = csvParser.parseString(stundenplan);
    */
  }

  public void addNeueStunde() {

  }

  public void loescheStunde() {

  }

  public String[] getStundenplan() {
    return stundenplan.split("\n");
  }
}
