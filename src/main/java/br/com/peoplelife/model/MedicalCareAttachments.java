package br.com.peoplelife.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_medical_care_attachments")
public class MedicalCareAttachments implements Serializable {
	private static final long serialVersionUID = -3349572882919603802L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer Id;

	private Integer MedicalCareId;

	private String FileName;

	@Column(name = "filebytearray", columnDefinition = "mediumtext")
	private String FileByteArray;

	private Date CreatedOn;

	private Date UpdateOn;

	private Date UploadedOn;

	private Integer UserId;

	public MedicalCareAttachments() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getMedicalCareId() {
		return MedicalCareId;
	}

	public void setMedicalCareId(Integer medicalCareId) {
		MedicalCareId = medicalCareId;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	public String getFileByteArray() {
		return FileByteArray;
	}

	public void setFileByteArray(String fileByteArray) {
		FileByteArray = fileByteArray;
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
		result = prime * result + ((FileByteArray == null) ? 0 : FileByteArray.hashCode());
		result = prime * result + ((FileName == null) ? 0 : FileName.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((MedicalCareId == null) ? 0 : MedicalCareId.hashCode());
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
		MedicalCareAttachments other = (MedicalCareAttachments) obj;
		if (CreatedOn == null) {
			if (other.CreatedOn != null)
				return false;
		} else if (!CreatedOn.equals(other.CreatedOn))
			return false;
		if (FileByteArray == null) {
			if (other.FileByteArray != null)
				return false;
		} else if (!FileByteArray.equals(other.FileByteArray))
			return false;
		if (FileName == null) {
			if (other.FileName != null)
				return false;
		} else if (!FileName.equals(other.FileName))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (MedicalCareId == null) {
			if (other.MedicalCareId != null)
				return false;
		} else if (!MedicalCareId.equals(other.MedicalCareId))
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
