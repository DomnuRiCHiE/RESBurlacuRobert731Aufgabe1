package Model;

public class Log {
    private int id;
    private String charakterName;
    private Stufe stufe;
    private String beschreibung;
    private String datum;
    private double kraftpunkte;

    public Log(int id, String charakterName, Stufe stufe, String beschreibung, String datum, double kraftpunkte) {
        this.id = id;
        this.charakterName = charakterName;
        this.stufe = stufe;
        this.beschreibung = beschreibung;
        this.datum = datum;
        this.kraftpunkte = kraftpunkte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharakterName() {
        return charakterName;
    }

    public void setCharakterName(String charakterName) {
        this.charakterName = charakterName;
    }

    public Stufe getStufe() {
        return stufe;
    }

    public void setStufe(Stufe stufe) {
        this.stufe = stufe;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public double getKraftpunkte() {
        return kraftpunkte;
    }

    public void setKraftpunkte(double kraftpunkte) {
        this.kraftpunkte = kraftpunkte;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", charakterName='" + charakterName + '\'' +
                ", stufe=" + stufe +
                ", beschreibung='" + beschreibung + '\'' +
                ", datum='" + datum + '\'' +
                ", kraftpunkte=" + kraftpunkte +
                '}';
    }
}
