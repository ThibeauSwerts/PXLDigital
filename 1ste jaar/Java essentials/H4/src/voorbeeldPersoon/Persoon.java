package voorbeeldPersoon;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }
/* eerste versie
    public String getVolledigeNaam() {
        StringBuilder volledigeNaam = new StringBuilder();
        if (voornaam == null) {
            volledigeNaam.append("?");
        } else {
            volledigeNaam.append(voornaam);
        }
        if (naam == null) {
            volledigeNaam.append(" ?");
        } else {
            volledigeNaam.append(" ").append(naam);
        }
        return volledigeNaam.toString();

    }
   */
    public String getVolledigeNaam() {
        StringBuilder volledigeNaam = new StringBuilder();
        volledigeNaam.append(vraagtekenIndienNull(voornaam));
        volledigeNaam.append(" ");
        volledigeNaam.append(vraagtekenIndienNull(naam));
        return volledigeNaam.toString();
    }

    private String vraagtekenIndienNull(String naam) {
        if (naam == null) {
            return "?";
        }
        return naam;
    }



}
