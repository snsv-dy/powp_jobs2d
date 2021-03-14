package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;

    private DrawPanelController panel;
    private ILine line_type;

    public LineDrawerAdapter(DrawPanelController panel, ILine line){
        this.panel = panel;
        this.line_type = line;
    }

    @Override
    public void setPosition(int x, int y){
        startX = x;
        startY = y;
    }

    @Override
    public void operateTo(int x, int y){
        line_type.setStartCoordinates(this.startX, this.startY);
        line_type.setEndCoordinates(x, y);

        if(panel != null)
            panel.drawLine(line_type);

        this.startX = x;
        this.startY = y;
    }
}
