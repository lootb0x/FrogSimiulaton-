import java.util.Scanner;


public class FrogSimulation
{
/** Distance, in inches, from the starting position to the goal. */
private int goalDistance=0;;
/** Maximum number of hops allowed to reach the goal. */
private int maxHops = 0;
private Scanner s = new Scanner(System.in);
public FrogSimulation(int dist, int numHops)
{
goalDistance = dist;
maxHops = numHops;
}
/** Returns an integer representing the distance, in inches, to be moved when the frog hops.
*/
private int hopDistance()
{
    return (int)(Math.random()*21)-10;

}


public boolean simulate()
{ 
    int start = goalDistance;
    for(int x= 0; x<maxHops; x++)
    {

        goalDistance -= hopDistance();
        if(goalDistance> start) return false;
        if(goalDistance<=0) return true;
    }
    return false;

}

/** Runs num simulations and returns the proportion of simulations in which the frog
* successfully reached or passed the goal.
* Precondition: num > 0
*/
public double runSimulations(int num)
{ 
    double count =0.0;
    for(int x =0; x<num; x++)
    if(this.simulate() == true) count++;



    return (double)count/num;
}
}
