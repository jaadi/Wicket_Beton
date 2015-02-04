package de.nj;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

import de.nj.model.User;

public class FormWrapperPanel extends Panel{

	private static final long serialVersionUID = 1L;
	private List<String> genderChoises = new ArrayList<String>();

	public FormWrapperPanel(String id) {
		super(id);
		
		genderChoises.add("male");
		genderChoises.add("female");
		final User user = new User();
		
		Form<String> form = new Form<String>("userform2");

		final TextField<String> tfield = new TextField<String>("userName2",
				new PropertyModel<String>(user, "uName"));
		tfield.setOutputMarkupId(true);
		final DropDownChoice<String> ddchoise = new DropDownChoice<String>("gender2",
				new PropertyModel<String>(user, "uGender"), genderChoises);
		ddchoise.setOutputMarkupId(true);
		
		Button button = new Button("submit2"){			
			
			private static final long serialVersionUID = 1L;

			@Override
			public void onSubmit() {
				
				super.onSubmit();
				System.out.println("user name :"+ user.getuName());
				System.out.println("user gender :"+user.getuGender());
			}
		};
		
		AjaxButton ajaxButton = new AjaxButton("ajaxSubmit2") {
			
			private static final long serialVersionUID = 1L;

			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				
				super.onSubmit(target, form);
				tfield.setEnabled(false);
				ddchoise.setEnabled(false);
				
				target.add(tfield);
				target.add(ddchoise);
			}
		};
		
		add(form);
		form.add(tfield);
		form.add(ddchoise);
		form.add(button);
		form.add(ajaxButton);

		
	}

}
