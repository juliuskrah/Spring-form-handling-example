package com.jipasoft.form.model;

import java.util.List;

import lombok.Data;

@Data
public class User {
	// form:hidden - hidden value
	private Integer id;

	// form:input - textbox
	private String name;

	// form:input - textbox
	private String email;

	// form:textarea - textarea
	private String address;

	// form:input - password
	private String password;

	// form:input - password
	private String confirmPassword;

	// form:checkbox - single checkbox
	private boolean newsletter;

	// form:checkboxes - multiple checkboxes
	private List<String> framework;

	// form:radiobutton - radio button
	private String sex;

	// form:radiobuttons - radio button
	private Integer number;

	// form:select - form:option - dropdown - single select
	private String country;

	// form:select - multiple=true - dropdown - multiple select
	private List<String> skill;

	public boolean isNew() {
		return (this.id == null);
	}

}
