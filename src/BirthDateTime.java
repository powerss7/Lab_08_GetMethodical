import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "What year were you born ", 1950, 2010);
        int month = SafeInput.getRangedInt(in, "What month were you born in ",1,12);
        int day = 0;


        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                break;
            case 4: case 6:
            case 9: case 11:
                day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 30);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 28);
                break;
        }

        int hour = SafeInput.getRangedInt(in, "What hour were you born on ",1,24);
        int minutes  = SafeInput.getRangedInt(in, "How many minutes  were you into the hour befor you were born ", 0,59);


        System.out.println("you were born in " + year + " on " + month + " the " + day + " at " + hour + minutes);

/*
        switch (month)
        {
            switch (month)
            {
                case 1:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
                case 2:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 28);
                    break;
                case 3:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
                case 4:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
                case 5:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
                case 6:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
                case 7:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
                case 8:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
                case 9:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
                case 10:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
                case 11:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
                case 12:
                    day = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);
                    break;
        }

 */
        /*
        if (month = 1 || 3 || 5 || 7 || 8 || 10 || 12)
        {
            int days = SafeInput.getRangedInt(in, "What day were you born on ", 1, 31);

        }
        else if (month = 4 || 6 || 9 || 11 )
        {
            int days = SafeInput.getRangedInt(in, "What day were you born on ", 1, 30);
        }
        else
        {
            int days = SafeInput.getRangedInt(in, "What day were you born on ", 1, 28);
        }

         */
    }
}

/*
1 = 31
2 = 28
3 = 31
4 = 30
5 = 31
6 = 30
7 = 31
8 = 31
9 = 30
10 = 31
11 = 30
12 = 31
 */