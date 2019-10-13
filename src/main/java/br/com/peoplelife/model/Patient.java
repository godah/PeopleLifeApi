package br.com.peoplelife.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_patient")
public class Patient implements Serializable {
	private static final long serialVersionUID = -3560981669779946964L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer Id;

	private String Cpf;

	private String Name;

	private String Email;

	private String Phone;

	private String BloodGroup;

	private Date Birth;

	private String Sex;

	private Double Weight;

	private Double Height;

	private String Allergies;

	private String HealthProblems;

	private String Observation;

	private Date CreatedOn;

	private Date UpdateOn;

	private Date UploadedOn;

	private Integer UserId;

	private Integer UserAllowedToViewId;

	public Patient() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getBloodGroup() {
		return BloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}

	public Date getBirth() {
		return Birth;
	}

	public void setBirth(Date birth) {
		Birth = birth;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public Double getWeight() {
		return Weight;
	}

	public void setWeight(Double weight) {
		Weight = weight;
	}

	public Double getHeight() {
		return Height;
	}

	public void setHeight(Double height) {
		Height = height;
	}

	public String getAllergies() {
		return Allergies;
	}

	public void setAllergies(String allergies) {
		Allergies = allergies;
	}

	public String getHealthProblems() {
		return HealthProblems;
	}

	public void setHealthProblems(String healthProblems) {
		HealthProblems = healthProblems;
	}

	public String getObservation() {
		return Observation;
	}

	public void setObservation(String observation) {
		Observation = observation;
	}

	public Date getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}

	public Date getUpdateOn() {
		return UpdateOn;
	}

	public void setUpdateOn(Date updateOn) {
		UpdateOn = updateOn;
	}

	public Date getUploadedOn() {
		return UploadedOn;
	}

	public void setUploadedOn(Date uploadedOn) {
		UploadedOn = uploadedOn;
	}

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer userId) {
		UserId = userId;
	}

	public Integer getUserAllowedToViewId() {
		return UserAllowedToViewId;
	}

	public void setUserAllowedToViewId(Integer userAllowedToViewId) {
		UserAllowedToViewId = userAllowedToViewId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Allergies == null) ? 0 : Allergies.hashCode());
		result = prime * result + ((Birth == null) ? 0 : Birth.hashCode());
		result = prime * result + ((BloodGroup == null) ? 0 : BloodGroup.hashCode());
		result = prime * result + ((Cpf == null) ? 0 : Cpf.hashCode());
		result = prime * result + ((CreatedOn == null) ? 0 : CreatedOn.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((HealthProblems == null) ? 0 : HealthProblems.hashCode());
		result = prime * result + ((Height == null) ? 0 : Height.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Observation == null) ? 0 : Observation.hashCode());
		result = prime * result + ((Phone == null) ? 0 : Phone.hashCode());
		result = prime * result + ((Sex == null) ? 0 : Sex.hashCode());
		result = prime * result + ((UpdateOn == null) ? 0 : UpdateOn.hashCode());
		result = prime * result + ((UploadedOn == null) ? 0 : UploadedOn.hashCode());
		result = prime * result + ((UserAllowedToViewId == null) ? 0 : UserAllowedToViewId.hashCode());
		result = prime * result + ((UserId == null) ? 0 : UserId.hashCode());
		result = prime * result + ((Weight == null) ? 0 : Weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (Allergies == null) {
			if (other.Allergies != null)
				return false;
		} else if (!Allergies.equals(other.Allergies))
			return false;
		if (Birth == null) {
			if (other.Birth != null)
				return false;
		} else if (!Birth.equals(other.Birth))
			return false;
		if (BloodGroup == null) {
			if (other.BloodGroup != null)
				return false;
		} else if (!BloodGroup.equals(other.BloodGroup))
			return false;
		if (Cpf == null) {
			if (other.Cpf != null)
				return false;
		} else if (!Cpf.equals(other.Cpf))
			return false;
		if (CreatedOn == null) {
			if (other.CreatedOn != null)
				return false;
		} else if (!CreatedOn.equals(other.CreatedOn))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (HealthProblems == null) {
			if (other.HealthProblems != null)
				return false;
		} else if (!HealthProblems.equals(other.HealthProblems))
			return false;
		if (Height == null) {
			if (other.Height != null)
				return false;
		} else if (!Height.equals(other.Height))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Observation == null) {
			if (other.Observation != null)
				return false;
		} else if (!Observation.equals(other.Observation))
			return false;
		if (Phone == null) {
			if (other.Phone != null)
				return false;
		} else if (!Phone.equals(other.Phone))
			return false;
		if (Sex == null) {
			if (other.Sex != null)
				return false;
		} else if (!Sex.equals(other.Sex))
			return false;
		if (UpdateOn == null) {
			if (other.UpdateOn != null)
				return false;
		} else if (!UpdateOn.equals(other.UpdateOn))
			return false;
		if (UploadedOn == null) {
			if (other.UploadedOn != null)
				return false;
		} else if (!UploadedOn.equals(other.UploadedOn))
			return false;
		if (UserAllowedToViewId == null) {
			if (other.UserAllowedToViewId != null)
				return false;
		} else if (!UserAllowedToViewId.equals(other.UserAllowedToViewId))
			return false;
		if (UserId == null) {
			if (other.UserId != null)
				return false;
		} else if (!UserId.equals(other.UserId))
			return false;
		if (Weight == null) {
			if (other.Weight != null)
				return false;
		} else if (!Weight.equals(other.Weight))
			return false;
		return true;
	}

}
