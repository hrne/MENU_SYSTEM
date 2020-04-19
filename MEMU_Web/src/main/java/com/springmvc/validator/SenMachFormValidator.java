package com.springmvc.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springmvc.dto.SenMachDto;
import com.springmvc.service.SenMachService;

@Component
public class SenMachFormValidator implements Validator {

	@Autowired
	SenMachService senMachService;

	@Override
	public boolean supports(Class<?> clazz) {
		return SenMachDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		SenMachDto senMachDto = (SenMachDto) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "machName", "userForm.name.notEmpty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ip", "userForm.email.notEmpty");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "userForm.address.notEmpty");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "userForm.password.notEmpty");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "userForm.confirmPassword.notEmpty");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sex", "userForm.sex.notEmpty");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "userForm.country.notEmpty");

//		if (!emailValidator.valid(senMach.getEmail())) {
//			errors.rejectValue("email", "userForm.email.pattern");
//		}
//
//		if (SenMach.getHeight() == null || user.getHeight() <= 0) {
//			errors.rejectValue("height", "userForm.height.notEmpty");
//		}
//
//		if (user.getCountry().equalsIgnoreCase("NONE")) {
//			errors.rejectValue("country", "userForm.country.notEmpty");
//		}
//
//		if (!user.getPassword().equals(user.getConfirmPassword())) {
//			errors.rejectValue("confirmPassword", "userform.confirmPassword.diff");
//		}
//
//		if (user.getFramework() == null || user.getFramework().size() < 2) {
//			errors.rejectValue("framework", "userForm.framework.valid");
//		}
//
//		if (user.getSkill() == null || user.getSkill().size() < 3) {
//			errors.rejectValue("skill", "userForm.skill.valid");
//		}

	}

}