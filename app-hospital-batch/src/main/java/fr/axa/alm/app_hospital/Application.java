package fr.axa.alm.app_hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * L'annotation SpringBootApplication contient les éléments suivants :
 * - @Configuration : détecte les classe qui contiennent des définitions de bean
 * - @EnableAutoConfiguration : indique à SpringBoot de commencer à ajouter des beans en fonction des param du classpath
 * - @ComponentScan : Indique à Spring de rechercher d'autres composants, config et services, lui permettant de trouver
 * les controleurs.
 * @author S839618
 *
 */
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
