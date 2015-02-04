package de.nj.betonWicket.layout;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class SimpleTemplate extends WebPage {
	
	private static final long serialVersionUID = 1L;
	public static final String CONTENT_ID = "contentComponent";
	private Component headerPanel;
	private Component menuPanel;
	private Component footerPanel;
 
    public SimpleTemplate(){
		add(headerPanel = new HeaderPanel("headerPanel"));
		add(menuPanel = new MenuPanel("menuPanel"));
		add(footerPanel = new FooterPanel("footerPanel"));
		add(new Label(CONTENT_ID, "Put your content here"));
	}
    //getters for layout areas
	protected Component getHeaderPanel() {
		return headerPanel;
	}
	protected Component getMenuPanel() {
		return menuPanel;
	}
	protected Component getFooterPanel() {
		return footerPanel;
	}
}
