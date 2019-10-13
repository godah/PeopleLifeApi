package br.com.peoplelife.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_medical_care")
public class MedicalCare implements Serializable {
	private static final long serialVersionUID = -4810588333184623657L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer Id;

	private Integer PatientId;

	private String Title;

	private String Description;

	private Integer ProcedureTypeId;

	private String Place;

	private Date DateTime;

	private String Observation;

	private String Prescription;

	private Date CreatedOn;

	private Date UpdateOn;

	private Date UploadedOn;

	private Integer UserId;

	public MedicalCare() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getPatientId() {
		return PatientId;
	}

	public void setPatientId(Integer patientId) {
		PatientId = patientId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Integer getProcedureTypeId() {
		return ProcedureTypeId;
	}

	public void setProcedureTypeId(Integer procedureTypeId) {
		ProcedureTypeId = procedureTypeId;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public Date getDateTime() {
		return DateTime;
	}

	public void setDateTime(Date dateTime) {
		DateTime = dateTime;
	}

	public String getObservation() {
		return Observation;
	}

	public void setObservation(String observation) {
		Observation = observation;
	}

	public String getPrescription() {
		return Prescription;
	}

	public void setPrescription(String prescription) {
		Prescription = prescription;
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
		result = prime * result + ((DateTime == null) ? 0 : DateTime.hashCode());
		result = prime * result + ((Description == null) ? 0 : Description.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Observation == null) ? 0 : Observation.hashCode());
		result = prime * result + ((PatientId == null) ? 0 : PatientId.hashCode());
		result = prime * result + ((Place == null) ? 0 : Place.hashCode());
		result = prime * result + ((Prescription == null) ? 0 : Prescription.hashCode());
		result = prime * result + ((ProcedureTypeId == null) ? 0 : ProcedureTypeId.hashCode());
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
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
		MedicalCare other = (MedicalCare) obj;
		if (CreatedOn == null) {
			if (other.CreatedOn != null)
				return false;
		} else if (!CreatedOn.equals(other.CreatedOn))
			return false;
		if (DateTime == null) {
			if (other.DateTime != null)
				return false;
		} else if (!DateTime.equals(other.DateTime))
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
		if (Observation == null) {
			if (other.Observation != null)
				return false;
		} else if (!Observation.equals(other.Observation))
			return false;
		if (PatientId == null) {
			if (other.PatientId != null)
				return false;
		} else if (!PatientId.equals(other.PatientId))
			return false;
		if (Place == null) {
			if (other.Place != null)
				return false;
		} else if (!Place.equals(other.Place))
			return false;
		if (Prescription == null) {
			if (other.Prescription != null)
				return false;
		} else if (!Prescription.equals(other.Prescription))
			return false;
		if (ProcedureTypeId == null) {
			if (other.ProcedureTypeId != null)
				return false;
		} else if (!ProcedureTypeId.equals(other.ProcedureTypeId))
			return false;
		if (Title == null) {
			if (other.Title != null)
				return false;
		} else if (!Title.equals(other.Title))
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
