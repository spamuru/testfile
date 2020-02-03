package Practice;

public class Nonstatic_Static {
    static int scount=0;
    int ncount=0;

    public  void increment(){
        scount++;
        ncount++;
    }

    public int getscount(){
        return scount;
    }

    public int getncount(){
        return ncount;
    }
    public static void main(String[] args) {
        Nonstatic_Static nss1 = new Nonstatic_Static();
        Nonstatic_Static nss2 = new Nonstatic_Static();

        nss1.increment();
        nss1.increment();
        nss2.increment();

        System.out.println(nss1.getscount());
        System.out.println(nss1.getncount());
        System.out.println(nss2.getscount());
        System.out.println(nss2.getncount());

    }
}
