package be.pxl.h6.voorbeeldPersoon;

public class Student extends Persoon {
    private int leerkrediet;
    private String studentnummer;
    private String opleiding;
    private static int aantal;


    public Student() {
        this("onbekend", "onbekend");
    }

    public Student(String naam, String voornaam) {
        this(naam, voornaam, "15999999", "XXX");
    }

    public Student(String naam, String voornaam, String studentnummer, String opleiding) {
        super(naam, voornaam);
        setStudentnummer(studentnummer);
        setOpleiding(opleiding);
        setLeerkrediet(140);
        aantal++;
    }

    public Student (Student kopie) {
        this(kopie.getNaam(), kopie.getVoornaam(), kopie.getStudentnummer(), kopie.getOpleiding());
        setLeerkrediet(kopie.getLeerkrediet());
    }



    public void setStudentnummer(String studentnummer) {
        this.studentnummer = studentnummer;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }

    public void setLeerkrediet(int leerkrediet) {
        if (leerkrediet < 0) {
            leerkrediet = 0;
        }
        else if (leerkrediet > 140) {
            leerkrediet = 140;
        }
        this.leerkrediet = leerkrediet;
    }



    public String getStudentnummer() {
        return studentnummer;
    }

    public String getOpleiding() {
        return opleiding;
    }

    public int getLeerkrediet() {
        return leerkrediet;
    }

    public static int getAantal() {
        return aantal;
    }


    public void wijzijgLeerkrediet(int delta) {
        setLeerkrediet(leerkrediet + delta);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("studentnummer: " + studentnummer);
        System.out.println("opleiding: " + opleiding);
        System.out.println("leerkrediet: " + leerkrediet);
    }
}
