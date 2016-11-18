package br.com.tutorialstruts.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.tutorialstruts.forms.HelloWorldForm;

public class HelloWorldAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest arg2, ServletResponse arg3)
			throws Exception {
		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		helloWorldForm.setMessage("Hello World! Struts");
		return mapping.findForward("success");
	}
}
