public class Main {
    public static void main(String[] args) {
        int x, y, z;
        x = 2;
        y = 2;
        z = 4;
        boolean r;
        r = x<y ^ x==y ? true:false;
        System.out.println(r);
    }
}

// ^: ou exclusivo true apenas se for uma ou outra condição