import java.io.*;
public class CricketTeam
{
    public static void main(String args[]) throws IOException
    {
        // Variables
        int run [] = new int [11];
        int ball [] = new int [11];
        String name [] = new String [11];
             int i, j , t1, t2, p=0;
        int total = 0;      //  Total number
        int max=100;            //  for maximum
        String t3;           // Temporary variable
        double strike;      // Strike rate calculation
        InputStreamReader in = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (in);
         // Input the elements in the arrays
         System.out.println("Enter Player name, runs and Ball played:");

        // Input data for all players
        for (i = 0; i < 11; i++) {
            System.out.print("Enter Player " + (i + 1) + " name: ");
            name[i] = br.readLine();
            System.out.print("Runs: ");
            run[i] = Integer.parseInt(br.readLine());
            System.out.print("Balls Played: ");
            ball[i] = Integer.parseInt(br.readLine());
        }
        // Sorting the player name with thier runs and balls played
        for(i=0; i<10 ;i++)
        {
            for(j=0; j<10-i; j++)
            {
                if(name[j].compareTo(name[j+1])>0)
                {
                    t3 = name[j];
                    name[j] = name[j+1];
                    name[j+1] = t3;
                    t1 = run[j];
                    run[j] = run[j+1];
                    run[j+1] = t1;
                    t2 = ball[j];
                    ball[j] = ball[j+1];
                    ball[j+1] = t2;
                }
            }
        }
System.out.println("\n\n Position\t Name\t Run\t Ball\t Strike Rate");
        System.out.println("========\t ============\t==========\t===========");
        for(i=0; i<11; i++)
        {
            strike = (double)100*run[i]/ball[i];
            total = total + run[i];
            // checking for highest run getter with the position
            if(run[i] > max)
            {
                max = run[i];
                p=i;
            }
            System.out.println(i+1 + "\t\t\t" + name[i] + "\t" + run[i] + "\t" + ball[i] + "\t" + strike);
        }
        System.out.println("=================================================");
        System.out.println("\t\t\t\t" + total);
        System.out.println("Highest run =  " + run[p] + " by " + name[p]);
    }
}