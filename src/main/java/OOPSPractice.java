import java.util.ArrayList;

public class OOPSPractice {

    enum Week {
          Monday,Tuesday,Wednesday
    }


    Integer xyx = 60;
    Integer abc;

    public OOPSPractice() {
        super();
    }


    public static void main(String[] args) {
        Week day = Week.Monday;
        OOPSPractice oopsPractice = new OOPSPractice();
        oopsPractice.xyx = 70;
        oopsPractice.abc = oopsPractice.xyx;
        oopsPractice.xyx = 90;
        System.out.println(oopsPractice.abc);
    }

}