public class Main {

    public static void main(String[] args) {
        years(18, 24);
        years(30, -20);
        years(19, 25);
        years(51, 20);
        years(68, 50);


    }

    public static int years(int old, int degree) {
        if (old >= 20 && old <= 45 && degree <= -20 && degree <= 30) {
            System.out.println("Можно идти гулять");
        } else if (old < 20 && degree >= 0 && degree <= 28) {
            System.out.println("Можно идти гулять 2");

        } else if (old > 45 && degree > -10 && degree < 25) {
            System.out.println("Можно идти гулять 3");

        } else {
            System.out.println("Оставайтесь дома");
        }
        return old + degree;
    }


        {


        }

    }








