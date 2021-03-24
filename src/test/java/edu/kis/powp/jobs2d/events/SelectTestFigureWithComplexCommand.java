package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureWithComplexCommand implements ActionListener {
    private ComplexCommand command;
    DriverManager driverManager;

    public SelectTestFigureWithComplexCommand(ComplexCommand command, DriverManager driverManager) {
        this.driverManager = driverManager;
        this.command = command;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        command.execute(driverManager.getCurrentDriver());
    }
}
