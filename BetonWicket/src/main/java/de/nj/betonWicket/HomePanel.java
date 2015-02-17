package de.nj.betonWicket;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.Page;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow.WindowClosedCallback;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

import de.nj.model.User;

public class HomePanel extends Panel {

	private static final long serialVersionUID = 1L;
	private List<String> genderChoises = new ArrayList<String>();
	private String action;

	public HomePanel(String id) {
		super(id);

		genderChoises.add("male");
		genderChoises.add("female");

		Form<String> form = createForm("userform");
		add(form);
	}

	private ModalWindow createModalWindow() {

		ModalWindow modalWindow = new ModalWindow("simpleModalWindow");
		modalWindow.setTitle("modal window");
		modalWindow.setInitialWidth(200);
		modalWindow.setInitialHeight(200);
		modalWindow.setPageCreator(new ModalWindow.PageCreator() {
			private static final long serialVersionUID = 1L;

			@Override
			public Page createPage() {
				return new SimpleModalWindow(action);
			}
		});

		modalWindow.setWindowClosedCallback(new WindowClosedCallback() {

			private static final long serialVersionUID = 1L;

			@Override
			public void onClose(AjaxRequestTarget arg0) {

			}
		});

		return modalWindow;
	}

	private Form<String> createForm(String id) {

		final User user = new User();
		Form<String> form = new Form<String>(id);

		final TextField<String> tfield = new TextField<String>("userName2",
				new PropertyModel<String>(user, "uName"));
		tfield.setOutputMarkupId(true);
		final DropDownChoice<String> ddchoise = new DropDownChoice<String>(
				"gender2", new PropertyModel<String>(user, "uGender"),
				genderChoises);
		ddchoise.setOutputMarkupId(true);

		Button button = new Button("submit2") {

			private static final long serialVersionUID = 1L;

			@Override
			public void onSubmit() {

				super.onSubmit();
				System.out.println("user name :" + user.getuName());
				System.out.println("user gender :" + user.getuGender());
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

		form.add(tfield);
		form.add(ddchoise);
		form.add(button);
		form.add(ajaxButton);

		ModalWindow modalWindow = createModalWindow();

		AjaxLink<String> labelmodalWindowLink = createModalWindowLink(
				modalWindow, "view");
		form.add(labelmodalWindowLink);
		AjaxLink<String> textfieldmodalWindowLink = createModalWindowLink(
				modalWindow, "edit");
		form.add(textfieldmodalWindowLink);

		form.add(modalWindow);
		
		return form;
	}

	private AjaxLink<String> createModalWindowLink(
			final ModalWindow modalWindow, final String id) {

		AjaxLink<String> ajaxLink = new AjaxLink<String>(id) {

			private static final long serialVersionUID = 1L;

			@Override
			public void onClick(AjaxRequestTarget target) {
				action = id;
				modalWindow.show(target);
			}
		};

		return ajaxLink;

	}

}
