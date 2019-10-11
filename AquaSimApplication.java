import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series: <br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Alyce Brady  (should be Your Name)
 *  @version 23 March 2008  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
    public static void main(String args[])
    {
        System.out.println("Hello World.");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.
        Random generator = new Random();
        int randNum = generator.nextInt(6);
        int randNum2;
        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(100, 200); // ... object that has now been created

        // Construct fish and add them to the aquarium.
        //      CODE MISSING HERE!
        
        AquaFish nemo;
        AquaFish dory;
        AquaFish marlin;
        AquaFish bruce;
        
        if(randNum==0)
        nemo = new AquaFish(aqua, Color.RED);
        else if(randNum==1)
        nemo = new AquaFish(aqua, Color.ORANGE);
        else if(randNum==2)
        nemo = new AquaFish(aqua,Color.YELLOW);
        else if(randNum==3)
        nemo = new AquaFish(aqua, Color.GREEN);
        else if(randNum==4)
        nemo = new AquaFish(aqua, Color.BLUE);
        else
        nemo = new AquaFish(aqua, Color.MAGENTA);
        
        randNum = generator.nextInt(10);
        
        if(randNum==0 || randNum==1 ||randNum==2)
        dory = new AquaFish(aqua, Color.RED);
        else if(randNum==3 || randNum==4)
        dory = new AquaFish(aqua, Color.ORANGE);
        else if(randNum==5)
        dory = new AquaFish(aqua,Color.YELLOW);
        else if(randNum==6)
        dory = new AquaFish(aqua, Color.GREEN);
        else if(randNum==7)
        dory = new AquaFish(aqua, Color.BLUE);
        else
        dory = new AquaFish(aqua, Color.MAGENTA);
        
        randNum = generator.nextInt(10);
        
        if(randNum==0)
        marlin = new AquaFish(aqua, Color.RED);
        else if(randNum==1)
        marlin = new AquaFish(aqua, Color.ORANGE);
        else if(randNum==2)
        marlin = new AquaFish(aqua, Color.YELLOW);
        else if(randNum==3 || randNum==4)
        marlin = new AquaFish(aqua, Color.GREEN);
        else if(randNum==5 || randNum==6 || randNum==7|| randNum==8)
        marlin = new AquaFish(aqua, Color.BLUE);
        else
        marlin = new AquaFish(aqua, Color.MAGENTA);
        
        randNum = generator.nextInt(7);
        
        if(randNum==0)
        bruce = new AquaFish(aqua, Color.RED);
        else if(randNum==1 || randNum==2)
        bruce = new AquaFish(aqua, Color.ORANGE);
        else if(randNum==3)
        bruce = new AquaFish(aqua,Color.YELLOW);
        else if(randNum==4)
        bruce = new AquaFish(aqua, Color.GREEN);
        else if(randNum==5)
        bruce = new AquaFish(aqua, Color.BLUE);
        else
        bruce = new AquaFish(aqua, Color.MAGENTA);
        
        aqua.add(nemo);
        aqua.add(dory);
        aqua.add(marlin);
        aqua.add(bruce);
        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua, true);  // ... and then GUI itself
 
        // Tell the user how to start the aquarium simulation.
        System.out.println("Press the Start button to start the simulation.");
        
        // Now wait for the user to press the start button.
        userInterface.waitForStart();
        int numberOfSteps = userInterface.getNumberOfSteps();
        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();


        // RUN THE AQUARIUM SIMULATION.

        // Make the fish move and redisplay.
        //      CODE MISSING HERE!
        
        for(int i=0; i<numberOfSteps; i++)
        {
        randNum2 = generator.nextInt(4);
        
        if(nemo.atWall() || randNum2==0)
        nemo.changeDir();
        
        nemo.moveForward();
        
        randNum2 = generator.nextInt(4);
        
        if(dory.atWall() || randNum2==0)
        dory.changeDir();
        
        dory.moveForward();
        
        randNum2 = generator.nextInt(4);
        
        if(marlin.atWall() || randNum2==0)
        marlin.changeDir();
        
        marlin.moveForward();
        
        randNum2 = generator.nextInt(4);
        
        if(bruce.atWall() || randNum2==0)
        bruce.changeDir();
        
        bruce.moveForward();
        
        userInterface.showAquarium();
        }
    

        // WRAP UP.

        // Remind user how to quit application.
        userInterface.println ("Close GUI display window to quit.");

    }//end main

}//end class
