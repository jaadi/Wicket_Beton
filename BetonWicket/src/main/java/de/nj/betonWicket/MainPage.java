package de.nj.betonWicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

import de.nj.betonWicket.layout.SimpleTemplate;

public class MainPage extends SimpleTemplate {

	private static final long serialVersionUID = 1L;
//	private List<String> genderChoises = new ArrayList<String>();
//	private Form<String> form;
//	private Form<String> hideButtonForm;
//	private ModalWindow modalWindow;

	public MainPage() {
		super();		
		replace(createSimpleLabel());
//		addSimpleLabel();
//		addSimpleForm();
//		addHideButtonForm();
//		add(new FormWrapperPanel("formPanel"));
//		addModalWindow();
//		addModalWindowLink();
		
	}

//	private void addModalWindow() {
//		modalWindow = new ModalWindow("simpleModalWindow");
//		modalWindow.setTitle("modal window");
//		modalWindow.setPageCreator(new ModalWindow.PageCreator() {			
//			private static final long serialVersionUID = 1L;
//			@Override
//			public Page createPage() {				
//				return new SimpleModalWindow();
//			}
//		});		
//		add(modalWindow);		
//	}
//
//	private void addModalWindowLink() {
//		
//		AjaxLink<String> ajaxLink = new AjaxLink<String>("modalWindowLink") {
//			private static final long serialVersionUID = 1L;
//			@Override
//			public void onClick(AjaxRequestTarget target) {				
//				modalWindow.show(target);
//			}
//		};		
//		add(ajaxLink);
//	}

//	private void addHideButtonForm() {
//		hideButtonForm = new Form<String>("hidebuttonform");
//		Button hidingformButton = new Button("hideform") {
//
//			private static final long serialVersionUID = 1L;
//
//			@Override
//			public void onSubmit() {
//				super.onSubmit();
//
//				if (form.isVisible()) {
//					form.setVisible(false);
//				} else {
//					form.setVisible(true);
//				}
//			}
//		};
//
//		hideButtonForm.add(hidingformButton);
//		add(hideButtonForm);
//
//	}
//
//	private void addSimpleForm() {
//		populateDropDowunChoise();
//		final User user = new User();
//		form = new Form<String>("userform");
//		form.setOutputMarkupId(true);
//		form.setOutputMarkupPlaceholderTag(true);
//
//		final TextField<String> tfield = new TextField<String>("userName",
//				new PropertyModel<String>(user, "uName"));
//		tfield.setOutputMarkupId(true);
//		final DropDownChoice<String> ddchoise = new DropDownChoice<String>(
//				"gender", new PropertyModel<String>(user, "uGender"),
//				genderChoises);
//		ddchoise.setOutputMarkupId(true);
//
//		Button button = new Button("submit") {
//			private static final long serialVersionUID = 1L;
//
//			@Override
//			public void onSubmit() {
//				super.onSubmit();
//				System.out.println("user name :" + user.getuName());
//				System.out.println("user gender :" + user.getuGender());
//			}
//		};
//
//		AjaxButton ajaxButton = new AjaxButton("ajaxSubmit") {
//			private static final long serialVersionUID = 1L;
//
//			@Override
//			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
//				super.onSubmit(target, form);
//				tfield.setEnabled(false);
//				ddchoise.setEnabled(false);
//				target.add(tfield);
//				target.add(ddchoise);
//			}
//		};
//
//		add(form);
//		form.add(tfield);
//		form.add(ddchoise);
//		form.add(button);
//		form.add(ajaxButton);
//		// form.add(hidingformButton);
//		// add(hidingformButton);
//
//	}
//
//	private void addSimpleLabel() {
//		add(new Label("lbl", new Model<String>(
//				" a simple label that will be deleted !")));
//
//	}
	
	private Label createSimpleLabel(){
		
		return new Label(CONTENT_ID, new Model<String>(
				" a simple label that will be deleted !"));
	}

//	private void populateDropDowunChoise() {
//		genderChoises.add("male");
//		genderChoises.add("female");
//
//	}
}
