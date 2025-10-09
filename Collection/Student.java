package Collection;

public class Student {
    String namn;
    int telefonNr;
    boolean aktiv;

    Student(String namn, int tnr, boolean aktiv){
        this.namn = namn;
        this.telefonNr = tnr;
        this.aktiv = aktiv;
    }

    public String getNamn(){
        return namn;

    }

    public String getTelefonNr(){
        return namn;
    }
    
}
