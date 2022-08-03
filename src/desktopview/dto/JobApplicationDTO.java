package desktopview.dto;
import java.util.Date;
public class JobApplicationDTO {
	private Long jobId;
	private String coverLetter;
	private Long freelancerId;
	private JobDTO job;
	private Date applicationDate;

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

	public JobDTO getJob() {
		return job;
	}

	public void setJob(JobDTO job) {
		this.job = job;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
}
