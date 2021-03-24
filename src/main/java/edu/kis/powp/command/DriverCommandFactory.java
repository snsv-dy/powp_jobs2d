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

    public static ComplexCommand createDiamond(int start_x, int start_y){
        ComplexCommand command_chain = new ComplexCommand();

        command_chain.addCommand(new SetPositionCommand(0 + start_x, 50 + start_y));
        command_chain.addCommand(new OperateToCommand(50 + start_x, 0 + start_y));
        command_chain.addCommand(new OperateToCommand(0 + start_x, -50 + start_y));
        command_chain.addCommand(new OperateToCommand(-50 + start_x, 0 + start_y));
        command_chain.addCommand(new OperateToCommand(0 + start_x, 50 + start_y));

        return command_chain;
    }
}
