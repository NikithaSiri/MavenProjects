import java.util.*;
class Player
{
    String firstName;
    String lastName;
    Player(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getName()
    {
        return firstName+" "+lastName;
    }
   // abstract int getRating();
 //   {
        
   // }
}
    class CricketPlayer extends Player
    {
        double averageRuns;
        CricketPlayer( double averageRuns)
        {
            super("firstName","lastName");
            averageRuns=this.averageRuns;
        }
        public int getRating()
        {
            if(averageRuns>55)
            {
                return 7;
            }
            else if(averageRuns>50 && averageRuns<=55)
            {
                return 6;
            }
            else if(averageRuns>40 && averageRuns<=50)
            {
                return 5;
            }
            else if(averageRuns>30 && averageRuns<=40)
            {
                return 3;
            }
            else if(averageRuns>20 && averageRuns<=30)
            {
                return 2;
            }
            else
            {
                return 1;
            }
        }
    }  
    
    class FootballPlayer extends Player
    {
        int goals;
        FootballPlayer(int goals)
        { 
            super("firstName","lastName");
            this.goals=goals;
        }
        public int getRating()
        {
            if(goals>20)
            {
                return 5;
            }
            else if(goals>15 && goals<=20)
            {
                return 4;
            }
            else if(goals>10 && goals<=15)
            {
                return 3;
            }
            else if(goals>5 && goals<=10)
            {
                return 2;
            }
            else
            {
                return 1;
            }
            }
    } 
    



public class Source{
    public static void main(String[] args){
        //CODE HERE
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        String lastName=sc.next();
        double averageRuns=sc.nextDouble();
        int goals=sc.nextInt();
        Player p=new Player(firstName,lastName);
        System.out.println(p.getName());
        CricketPlayer cp=new CricketPlayer(averageRuns);
        System.out.println(cp.getRating());
        FootballPlayer fp=new FootballPlayer(goals);
        System.out.println(fp.getRating());
        }
}