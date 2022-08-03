package desktopview.dto;


import java.util.Date;

/**************************************************************************************
 * @author       yordanos
 * Description : This is the DTO class for Feedback module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/

public class FeedbackDTO {
	private String comments;
	private Date date;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
