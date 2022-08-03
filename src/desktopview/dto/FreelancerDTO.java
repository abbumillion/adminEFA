package desktopview.dto;

import java.util.List;

public class FreelancerDTO {
    private SignUpDTO signUpDTO;
    private List<SkillDTO> skillDTOList;
    private List<FeedbackDTO> feedbackDTOS;
    private List<JobApplicationDTO> jobApplicationDTOS;

    public SignUpDTO getSignUpDTO() {
        return signUpDTO;
    }

    public void setSignUpDTO(SignUpDTO signUpDTO) {
        this.signUpDTO = signUpDTO;
    }

    public List<SkillDTO> getSkillDTOList() {
        return skillDTOList;
    }

    public void setSkillDTOList(List<SkillDTO> skillDTOList) {
        this.skillDTOList = skillDTOList;
    }

    public List<FeedbackDTO> getFeedbackDTOS() {
        return feedbackDTOS;
    }

    public void setFeedbackDTOS(List<FeedbackDTO> feedbackDTOS) {
        this.feedbackDTOS = feedbackDTOS;
    }

    public List<JobApplicationDTO> getJobApplicationDTOS() {
        return jobApplicationDTOS;
    }

    public void setJobApplicationDTOS(List<JobApplicationDTO> jobApplicationDTOS) {
        this.jobApplicationDTOS = jobApplicationDTOS;
    }
}
