    import java.util.*;

    public class Test_grila {
        public static void main(String[]arg){
            System.out.println("Test_grila");
//  // ---- 1.Care din urmatoarele sunt valide? ----
            List<String> list = new Vector<>(); //a.valid
            //List<Objects> values = new HashSet<Objects>(); // b.eroare
            Map<String,Integer> hm = new HashMap<String,Integer>(); //  c.valid
            System.out.println("1.Care din urmatoarele sunt valide?");
            System.out.println("a.valid");
            System.out.println("b.eronat");
            System.out.println("c.valid");
            System.out.println("");

            // ----- 2.Ce va afisa urmatorul cod?
            TreeSet<String> tree = new TreeSet<String>();
            tree.add("one");
            tree.add("One");
            tree.add("ONE");
            System.out.println("2.Ce va afisa urmatorul cod?");
            System.out.println("c." + tree.ceiling  ("On")); // c.One
            System.out.println("");

            // ---- 3.Ce va afisa urmatorul program?
            Test_grila t1 = new Test_grila() ;
            Test_grila t2 = new Test_grila();
            System.out.println("3.Ce va afisa urmatorul program?");
            System.out.println("b." + t1.equals((t2))); // b.false
            System.out.println("");

            // ---- 4.Ce va afisa urmatorul program? ----
            Test_grila tt1 = new Test_grila();
            Test_grila tt2 = tt1;
            System.out.println("4.Ce va afisa urmatorul program?");
            System.out.println("f." + tt1.equals(tt2)); // e.true
            System.out.println("");

            // ----- 5.Ce va afisa urmatorul program? -----
            int x= 10;
            int y = 10;
            // System.out.println(x.equals(y)); // l.eroare
            System.out.println("5.Ce va afisa urmatorul program?");
            System.out.println("l.Eroare");
        }
}
