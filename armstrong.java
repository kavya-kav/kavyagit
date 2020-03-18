public class armstrong {

    public static void main(String[] args) {

        int n = 371, t, remainder, r = 0;

        t = n;

        while (t != 0)
        {
            remainder = t % 10;
            r+= Math.pow(remainder, 3);
            t /= 10;
        }

        if(r == n)
            System.out.println(n + " is an armstrong number.");
        else
            System.out.println(n + " is not an armstrong number.");
    }
}