package de.nj.betonWicket;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

public class SimpleModalWindow extends WebPage {

	private static final long serialVersionUID = 1L;
	
	public SimpleModalWindow() {
		
		add(new Label("modalwindowlbl", new Model<String>(
				" i'm a simple label !")));		
	}

}
