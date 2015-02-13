package de.nj.betonWicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

public class ModelsDemoPanel extends Panel{
	private static final long serialVersionUID = 1L;

	public ModelsDemoPanel(String id) {
		super(id);
		add(new Label("simpleText", "halli hallo"));
		
	}

	

}
