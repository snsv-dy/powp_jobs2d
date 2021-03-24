package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> commands = new ArrayList<>();

    public void addCommand(DriverCommand command){
        commands.add(command);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand c : commands)
            c.execute(driver);
    }
}
