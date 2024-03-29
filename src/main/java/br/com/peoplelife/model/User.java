package br.com.peoplelife.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User implements Serializable {
	private static final long serialVersionUID = 3527615827091191953L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer Id;

	private String Cpf;

	private String Name;

	private String Email;

	private String Password;

	private Date Birth;

	private String Sex;

	private String IsMedical;

	private String Crm;

	private String Speciality;

	private String OccupationArea;

	private Date CreatedOn;

	private Date UpdateOn;

	private Date UploadedOn;

	public User() {
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

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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

	public String getIsMedical() {
		return IsMedical;
	}

	public void setIsMedical(String isMedical) {
		IsMedical = isMedical;
	}

	public String getCrm() {
		return Crm;
	}

	public void setCrm(String crm) {
		Crm = crm;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

	public String getOccupationArea() {
		return OccupationArea;
	}

	public void setOccupationArea(String occupationArea) {
		OccupationArea = occupationArea;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Birth == null) ? 0 : Birth.hashCode());
		result = prime * result + ((Cpf == null) ? 0 : Cpf.hashCode());
		result = prime * result + ((CreatedOn == null) ? 0 : CreatedOn.hashCode());
		result = prime * result + ((Crm == null) ? 0 : Crm.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((IsMedical == null) ? 0 : IsMedical.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((OccupationArea == null) ? 0 : OccupationArea.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + ((Sex == null) ? 0 : Sex.hashCode());
		result = prime * result + ((Speciality == null) ? 0 : Speciality.hashCode());
		result = prime * result + ((UpdateOn == null) ? 0 : UpdateOn.hashCode());
		result = prime * result + ((UploadedOn == null) ? 0 : UploadedOn.hashCode());
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
		User other = (User) obj;
		if (Birth == null) {
			if (other.Birth != null)
				return false;
		} else if (!Birth.equals(other.Birth))
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
		if (Crm == null) {
			if (other.Crm != null)
				return false;
		} else if (!Crm.equals(other.Crm))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (IsMedical == null) {
			if (other.IsMedical != null)
				return false;
		} else if (!IsMedical.equals(other.IsMedical))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (OccupationArea == null) {
			if (other.OccupationArea != null)
				return false;
		} else if (!OccupationArea.equals(other.OccupationArea))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (Sex == null) {
			if (other.Sex != null)
				return false;
		} else if (!Sex.equals(other.Sex))
			return false;
		if (Speciality == null) {
			if (other.Speciality != null)
				return false;
		} else if (!Speciality.equals(other.Speciality))
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
		return true;
	}

}
