package it.unisalento.ingsoftware.rubrica_telefonica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/contacts")
public class ContactsController {

    @GetMapping("/new")
    @Autowired
    public ModelAndView newContactForm(ContactForm contactForm) {
        return new ModelAndView("contact-form").addObject(contactForm);
    }

    @PostMapping("/new")
    public ModelAndView handleNewContactSubmission(@ModelAttribute ContactForm contactForm) {
        return new ModelAndView("contact-details")
                .addObject("contact", contactForm);
    }
}
 