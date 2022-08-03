package desktopview.dto;


import desktopview.helpers.SkillCategory;

/**************************************************************************************
 * Author thomas
 * Description : This is the DTO class for Skill module.
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/

public class SkillDTO {
	private String name;
	private String description;
	private SkillCategory category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SkillCategory getCategory() {
		return category;
	}

	public void setCategory(SkillCategory category) {
		this.category = category;
	}
}
