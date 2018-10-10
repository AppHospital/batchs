package fr.alm.app_hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport{

	private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);
	
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void afterJob(JobExecution jobExecution) {

		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			
			log.info("Job terminé !!!");
			
			jdbcTemplate.query("SELECT first_name, last_name FROM person",
					(rs, row) -> new Person(
						rs.getString(1),
						rs.getString(2))
					).forEach(person -> log.info("Trouver <"+person+"> dans la bdd."));
			
		}
	}
}
