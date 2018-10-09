package fr.axa.alm.app_hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class JiraItemProcessor implements ItemProcessor<Jira, Person> {

	private static final Logger log = LoggerFactory.getLogger(JiraItemProcessor.class);

	@Override
	public Person process(Jira item) throws Exception {

		String firstName = item.getInChargeOf().split(" ")[0];
		String lastName = item.getInChargeOf().split(" ")[1];

		Person person = new Person(lastName, firstName);

		log.info("Création de " + person + ".");

		return null;
	}

}
