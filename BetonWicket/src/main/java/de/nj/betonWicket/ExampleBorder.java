package de.nj.betonWicket;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.border.Border;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;

import de.nj.model.Person;

public class ExampleBorder extends Border {

	private static final long serialVersionUID = 1L;
	private Form<Person> personsform;
	private DropDownChoice<Person> personsList;

	public ExampleBorder(String id) {

		super(id);

		Model<Person> listModel = new Model<Person>();
		ChoiceRenderer<Person> personRender = new ChoiceRenderer<Person>() {
			private static final long serialVersionUID = 1L;

			@Override
			public Object getDisplayValue(Person person) {
				return person.getName() + " " + person.getSurname();
			}
		};
		personsList = new DropDownChoice<Person>("persons", listModel,
				personsPojo(), personRender) {

			private static final long serialVersionUID = 1L;

			@Override
			protected boolean wantOnSelectionChangedNotifications() {
				return true;
			}
		};
		
		addToBorder(personsList);
		
		personsform = new Form<Person>("personsform", new CompoundPropertyModel<Person>(listModel)) ;
		personsform.add(new TextField<Object>("name"));
		personsform.add(new TextField<Object>("surname"));
		personsform.add(new TextField<Object>("address"));
		personsform.add(new TextField<Object>("email"));
		
		addToBorder(personsform);
		

	}

	private List<Person> personsPojo() {
		List<Person> persons = new ArrayList<Person>();
		Person person = new Person("John", "Smith");

		person.setAddress("Corner street");
		person.setEmail("john.smith@gmail.com");
		persons.add(person);

		person = new Person("Jill", "Smith");

		person.setAddress("Main street");
		person.setEmail("jill.smith@gmail.com");

		persons.add(person);

		person = new Person("Tim", "Spencer");

		person.setAddress("Second street");
		person.setEmail("tim.spencer@gmail.com");

		persons.add(person);

		return persons;
	}
}
