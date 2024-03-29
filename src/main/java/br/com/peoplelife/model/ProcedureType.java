package br.com.peoplelife.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_procedure_type")
public class ProcedureType implements Serializable {
	private static final long serialVersionUID = -4810588323184623657L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer Id;

	private String Name;

	private String Description;

	private String TissCode;

	private String TussCode;

	private Date CreatedOn;

	private Date UpdateOn;

	private Date UploadedOn;

	private Integer UserId;

	public ProcedureType() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTissCode() {
		return TissCode;
	}

	public void setTissCode(String tissCode) {
		TissCode = tissCode;
	}

	public String getTussCode() {
		return TussCode;
	}

	public void setTussCode(String tussCode) {
		TussCode = tussCode;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CreatedOn == null) ? 0 : CreatedOn.hashCode());
		result = prime * result + ((Description == null) ? 0 : Description.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((TissCode == null) ? 0 : TissCode.hashCode());
		result = prime * result + ((TussCode == null) ? 0 : TussCode.hashCode());
		result = prime * result + ((UpdateOn == null) ? 0 : UpdateOn.hashCode());
		result = prime * result + ((UploadedOn == null) ? 0 : UploadedOn.hashCode());
		result = prime * result + ((UserId == null) ? 0 : UserId.hashCode());
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
		ProcedureType other = (ProcedureType) obj;
		if (CreatedOn == null) {
			if (other.CreatedOn != null)
				return false;
		} else if (!CreatedOn.equals(other.CreatedOn))
			return false;
		if (Description == null) {
			if (other.Description != null)
				return false;
		} else if (!Description.equals(other.Description))
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
		if (TissCode == null) {
			if (other.TissCode != null)
				return false;
		} else if (!TissCode.equals(other.TissCode))
			return false;
		if (TussCode == null) {
			if (other.TussCode != null)
				return false;
		} else if (!TussCode.equals(other.TussCode))
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
		if (UserId == null) {
			if (other.UserId != null)
				return false;
		} else if (!UserId.equals(other.UserId))
			return false;
		return true;
	}

}
