package com.kamidox.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import com.kamidox.helloworld.model.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RegisterAction extends ActionSupport {
    private static final Logger LOG = LogManager.getLogger(ActionSupport.class);
    private static final long serialVersionUID = 1L;

    private Person personBean;


    public String execute() {
        //call Service class to store personBean's state in database
        LOG.debug(personBean);
        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person person) {
        personBean = person;
    }

    public void validate() {
        if (personBean.getFirstName().length() == 0) {
            addFieldError("personBean.firstName", "First name is required.");
        }

        if (personBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "Email is required.");
        }

        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }
    }
}
