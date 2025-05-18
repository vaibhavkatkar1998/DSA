public class OOPSPractice {



    public static void main(String[] args) {
        OOPSPractice oopsPractice = new OOPSPractice();
        try {
            System.out.println("abc");
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("yes" );
        }
    }

    @Override
    protected void finalize() throws Throwable {

    }
}