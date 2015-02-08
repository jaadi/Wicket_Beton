package de.nj.betonWicket;

import de.nj.betonWicket.layout.SimpleTemplate;

public class MainPage extends SimpleTemplate {

	private static final long serialVersionUID = 1L;

	public MainPage() {
		
		super();	
		replace(new FormWrapperPanel(CONTENT_ID));
		
	}
}
