package de.nj.betonWicket;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

import de.nj.model.Person;

public class ModelsDemoPanel extends Panel {
	private static final long serialVersionUID = 1L;
	
	private Person person;

	public ModelsDemoPanel(String id) {
		
		super(id);
		add(getTimeStampLabel());		
		createPerson();	
		add(new Label("personname", new PropertyModel<Object>(person, "name")));
		add(new Label("personspouse", new PropertyModel<Object>(person, "spouse.name")));
		add(new Label("personsecondchildname", new PropertyModel<Object>(person, "children.1.name")));
		
		setDefaultModel(new CompoundPropertyModel<Person>(person));
		person.setEmail("bla@tx.com");
		add(new Label("email"));
		
	}

	
	private void createPerson() {
		person = new Person("Gandi", "Gures");
		person.setSpouse(new Person("Angelina","Gures"));
		ArrayList<Person> children = new ArrayList<Person>();
		children.add(new Person("Miki", "Gures"));
		children.add(new Person("Tores", "Gures"));
		person.setChildren(children);		
	}

	private Label getTimeStampLabel() {
		IModel<String> timeStampModel = new Model<String>() {
			private static final long serialVersionUID = 1L;
			@Override
			public String getObject() {
				return new Date().toString();
			}
		};
		
		return new Label("todaydate", timeStampModel);
	}
	
	

	
	
	

}
