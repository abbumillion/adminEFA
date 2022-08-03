package desktopview.dto;

import java.util.List;

public class CustomerDTO {
    private SignUpDTO signUpDTO;
    private List<JobDTO> jobDTOS;
    private List<FeedbackDTO> feedbackDTOS;

    public SignUpDTO getSignUpDTO() {
        return signUpDTO;
    }

    public void setSignUpDTO(SignUpDTO signUpDTO) {
        this.signUpDTO = signUpDTO;
    }

    public List<JobDTO> getJobDTOS() {
        return jobDTOS;
    }

    public void setJobDTOS(List<JobDTO> jobDTOS) {
        this.jobDTOS = jobDTOS;
    }

    public List<FeedbackDTO> getFeedbackDTOS() {
        return feedbackDTOS;
    }

    public void setFeedbackDTOS(List<FeedbackDTO> feedbackDTOS) {
        this.feedbackDTOS = feedbackDTOS;
    }
}
