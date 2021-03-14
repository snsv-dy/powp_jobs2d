package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

/**
 * driver adapter to drawer with several bugs.
 */
public class DrawingAdapter implements Job2dDriver {
	private int startX = 0, startY = 0;

	DrawPanelController controller;

	public DrawingAdapter(DrawPanelController controller) {
		super();
		this.controller = controller;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		if(controller != null)
			controller.drawLine(line);

		this.startX = x;
		this.startY = y;
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
