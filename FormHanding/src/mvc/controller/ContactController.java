package mvc.controller;

import mvc.form.Contact;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class ContactController {

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")
							Contact contact, BindingResult result) {
		
		/*System.out.println("First Name:" + contact.getFirstname() + 
					"Last Name:" + contact.getLastname());*/
		Contact addContact=new Contact();
		addContact.setFirstname(contact.getFirstname());
		addContact.setLastname(contact.getLastname());
		addContact.setEmail(contact.getEmail());
		addContact.setTelephone(contact.getTelephone());
		
		createContact(addContact);
		
		return "redirect:contacts.html";
	}
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	
	private void createContact(Contact addContact) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(addContact);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully created " + addContact.toString());	
		
	}

	@RequestMapping("/contacts")
	public ModelAndView showContacts() {
		
		return new ModelAndView("contact", "command", new Contact());
	}
}