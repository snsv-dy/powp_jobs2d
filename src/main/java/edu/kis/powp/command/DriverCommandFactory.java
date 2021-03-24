package edu.kis.powp.command;

public class DriverCommandFactory {
    public static ComplexCommand createRectangle(){
        ComplexCommand command_chain = new ComplexCommand();

        command_chain.addCommand(new SetPositionCommand(-50, 50));
        command_chain.addCommand(new OperateToCommand(50, 50));
        command_chain.addCommand(new OperateToCommand(50, -50));
        command_chain.addCommand(new OperateToCommand(-50, -50));
        command_chain.addCommand(new OperateToCommand(-50, 50));

        return command_chain;
    }

}
