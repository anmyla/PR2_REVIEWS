package A_bSampleTest_AnimailMusicians.main.java.at.campus02.testprogramme;

import A_bSampleTest_AnimailMusicians.main.java.at.campus02.musikanten.*;
public class MusikantenTest {

    public static void main(String[] args) {
        Instrument i = new Instrument("Trompete", 20.5);
        Esel e = new Esel(4, i, 10.2);
        Katze k = new Katze(4, i, 28.2);
        Hund hu = new Hund(4, i, 30.2);
        Hahn ha = new Hahn(2, i, 1);

        Quartett q = new Quartett();
        q.add(e);
        q.add(k);
        q.add(hu);
        q.add(ha);
        q.printLautStaerkeAbsteigend();

    }

}
