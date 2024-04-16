import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int input = -1;
        MonthsInAYear[] miyArray = MonthsInAYear.values();
        MonthsInAYear miy;

        while(!(input == 0)) {
            System.out.println("Pick a month from the list below");
            System.out.println("0: Exit");
            for (int i = 0; i < miyArray.length; i++) {
                System.out.println((i+1)+ ": " + miyArray[i].toString());
            }

            try {
                input = sc.nextInt();
                miy = miyArray[input-1];

                switch (miy) {
                    case DECEMBER, JANUARY, FEBRUARY -> {
                        System.out.println("It is winter!");
                    }
                    case MARCH, APRIL, MAY -> {
                        System.out.println("It is spring!");
                    }
                    case JUNE, JULY, AUGUST -> {
                        System.out.println("It is summer!");
                    }
                    case SEPTEMBER, OCTOBER, NOVEMBER -> {
                        System.out.println("It is fall/autumn!");
                    }
                }



            } catch(RuntimeException re) {
                System.out.println("Invalid input. Please insert a number between 1 - 12");
            }




        }



    }
}
