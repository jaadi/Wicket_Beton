package de.nj.betonWicket;

import de.nj.betonWicket.layout.SimpleTemplate;

public class ModelsDemoPage extends SimpleTemplate {
	
	private static final long serialVersionUID = 1L;
	
	public ModelsDemoPage(){
		super();
		replace(new ModelsDemoPanel(CONTENT_ID));
	}

}
