package desktopview.helpers;

import desktopview.dto.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 */
public class Model {
    /**
     * this is a backend model class for
     * this applications getting data from
     * spring boot backend rest
     * api for administration module
     */
    List admins = new ArrayList();
    List customers = new ArrayList();
    List freelancers = new ArrayList();
    List jobs = new ArrayList();
    List jobapplications = new ArrayList();
    List feedbacks = new ArrayList();
    List skills = new ArrayList();

    /**
     * initializing some random test data
     */
    public Model() {
        SignUpDTO signUpDTO1 = new SignUpDTO();
        signUpDTO1.setFullName("Million Sharbe");
        signUpDTO1.setEmail("sharbemillion599@gmail.com");
        signUpDTO1.setPassword("password");
        signUpDTO1.setPhoneNumber("0923683988");
        signUpDTO1.setRole("ADMIN");
        signUpDTO1.setActive(true);
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setSignUpDTO(signUpDTO1);
        JobDTO jobDTO = new JobDTO();
        jobDTO.setBudget(233);
        jobDTO.setCategory(SkillCategory.CHEMISTRY.name());
        jobDTO.setCustomerDTO(customerDTO);
        jobDTO.setDescription("this is a job description");
        jobDTO.setEndDate(new Date());
        jobDTO.setPosted(new Date());
        jobDTO.setTitle("Software Engineer");
        jobDTO.setType(SkillCategory.SOFTWARE.name());
        jobDTO.setVacancy(4);
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setSignUpDTO(signUpDTO1);

        FeedbackDTO feedbackDTO = new FeedbackDTO();
        feedbackDTO.setComments("this is some random feedback");
        feedbackDTO.setDate(new Date());



        for (int i = 0; i < 100; i++) {
            customers.add(customerDTO);
            jobs.add(jobDTO);
            admins.add(adminDTO);
            feedbacks.add(feedbackDTO);
        }
    }

    /**
     * @return list of admins
     */
    public List getAdmins() {
        return admins;
    }

    /**
     * @return list of customers
     */
    public List getCustomers() {
        return customers;
    }

    /**
     * @return list of freelancers
     */
    public List getFreelancers() {
        return freelancers;
    }

    /**
     * @return list of jobs
     */
    public List getJobs() {
        return jobs;
    }

    /**
     * @return list of job applications
     */
    public List getJobapplications() {
        return jobapplications;
    }

    /**
     * @return list fo feedbacks from the model
     */
    public List getFeedbacks() {
        return feedbacks;
    }

    /**
     * @return list of skills from model
     */
    public List getSkills() {
        return skills;
    }
}
