public class Bricks {
    public static void main(String args[]) {
        int n =1;
        int p = 1, m = 2;
        int cnt = 0;
        boolean pa = false, mo = false;

        while (n > cnt) {
            if (n > cnt) {    //Patlu
                cnt += p;
                p++;
                pa = true;
                mo = false;
            }

            if (n > cnt) {   //Motu
                cnt += m;
                m += 2;
                mo = true;
                pa = false;
            }
        }
        if (mo == true)  //Mo = true
            System.out.println("Motu is the winner!\n");
        if (pa == true)
            System.out.println("Patlu is the winner!\n");
    }
}
