package azkaban.flow;

import java.util.UUID;

import org.joda.time.DateTime;

public class CommonJobProperties {
	/*
	 * The following are Common properties that can be set in a job file
	 */
	
	/**
	 * The type of job that will be executed.
	 * Examples: command, java, etc.
	 */
	public static final String JOB_TYPE = "type";
	
	/**
	 * Comma delimited list of job names which are dependencies
	 */
	public static final String DEPENDENCIES = "dependencies";
	
	/**
	 * The number of retries when this job has failed.
	 */
	public static final String RETRIES = "retries";
	
	/**
	 * The time in millisec to back off after every retry
	 */
	public static final String RETRY_BACKOFF = "retry.backoff";
	
	/**
	 * Comma delimited list of email addresses for both failure and success messages
	 */
	public static final String NOTIFY_EMAILS = "notify.emails";
	
	/**
	 * Comma delimited list of email addresses for success messages
	 */
	public static final String SUCCESS_EMAILS = "success.emails";
	
	/**
	 * Comma delimited list of email addresses for failure messages
	 */
	public static final String FAILURE_EMAILS = "failure.emails";

	/*
	 * The following are the common props that will be added to the job by azkaban
	 */
	
	/**
	 * The attempt number of the executing job.
	 */
	public static final String JOB_ATTEMPT = "azkaban.job.attempt";
	
	/**
	 * The executing flow id
	 */
	public static final String FLOW_ID = "azkaban.flow.flowid";
	
	/**
	 * The execution id. This should be unique per flow, but may not be due to 
	 * restarts.
	 */
	public static final String EXEC_ID = "azkaban.flow.execid";
	
	/**
	 * The numerical project id identifier.
	 */
	public static final String PROJECT_ID = "azkaban.flow.projectid";
	
	/**
	 * The version of the project the flow is running. This may change if a
	 * forced hotspot occurs.
	 */
	public static final String PROJECT_VERSION = "azkaban.flow.projectversion";
	
	/**
	 * A uuid assigned to every execution
	 */
	public static final String FLOW_UUID = "azkaban.flow.uuid";
	
	/**
	 * Properties for passing the flow start time to the jobs.
	 */
	public static final String FLOW_START_TIMESTAMP = "azkaban.flow.start.timestamp";
	public static final String FLOW_START_YEAR = "azkaban.flow.start.year";
	public static final String FLOW_START_MONTH = "azkaban.flow.start.month";
	public static final String FLOW_START_DAY = "azkaban.flow.start.day";
	public static final String FLOW_START_HOUR = "azkaban.flow.start.hour";
	public static final String FLOW_START_MINUTE = "azkaban.flow.start.minute";
	public static final String FLOW_START_SECOND = "azkaban.flow.start.second";
	public static final String FLOW_START_MILLISSECOND = "azkaban.flow.start.milliseconds";
	public static final String FLOW_START_TIMEZONE = "azkaban.flow.start.timezone";

}