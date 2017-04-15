package org.usfirst.frc.team1884.robot.commands;

import org.usfirst.frc.team1884.robot.commands.autonomous.TrapezoidBackup;
import org.usfirst.frc.team1884.robot.commands.autonomous.TrapezoidForwardBoilerPeg;
import org.usfirst.frc.team1884.robot.commands.autonomous.TrapezoidSideTurnLeft;
import org.usfirst.frc.team1884.robot.commands.autonomous.TrapezoidToBoilerPeg;
import org.usfirst.frc.team1884.robot.commands.autonomous.WaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoGearRedBoiler extends CommandGroup {

    public AutoGearRedBoiler() {
    	addSequential(new PutGearInUpPosition());
    	addSequential(new WaitCommand(.5));
    	addSequential(new TrapezoidForwardBoilerPeg());
    	addSequential(new TrapezoidSideTurnLeft());
    	addSequential(new TrapezoidToBoilerPeg());
    	addSequential(new WaitCommand(.5));
    	addSequential(new GearManOpen());
    	addSequential(new WaitCommand(.2));
    	addSequential(new TrapezoidBackup());
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
