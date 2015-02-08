package de.nj.betonWicket;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.model.Model;

public class SimpleModalWindow extends WebPage {

	private static final long serialVersionUID = 1L;
	private String action;

	public SimpleModalWindow(String cAction) {

		this.action = cAction;
		addComponents();		
	}

	private void addComponents() {

		Form<?> form = new Form<Object>("modalForm");		
		Fragment fragment;
	
		if (action.equals("view")) {
			fragment = new Fragment("container", "viewFragment", this);
			fragment.add(new Label("labelInfragment", new Model<String>(
					" i'm a simple label !")));
		} else {
			fragment = new Fragment("container",
					"editFragment", this);
			fragment.add(new TextField<String>("textfieldInFragment", new Model<String>(" i'm a simple label !")));
		}
		
		form.add(fragment);
		add(form);
		

	}

}
