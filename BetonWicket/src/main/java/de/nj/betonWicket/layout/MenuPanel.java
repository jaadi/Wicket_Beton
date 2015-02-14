package de.nj.betonWicket.layout;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

import de.nj.betonWicket.MainPage;
import de.nj.betonWicket.ModelsDemoPage;

public class MenuPanel extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MenuPanel(String id) {
		super(id);	
		add(new BookmarkablePageLink<Void>("homelink", MainPage.class));
		add(new BookmarkablePageLink<Void>("modelsdemolink", ModelsDemoPage.class));		
	}
}
