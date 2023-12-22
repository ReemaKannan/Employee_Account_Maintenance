package com.optimum.employee.EmployeeMaster.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="emp_id")
	private Integer empid;
	
	@Column (name="first_name")
	private String firstname;
	
	@Column (name="last_name")
	private String lastname;
	
	@Column (name="contact")
	private double contact;
	
	@Column (name="mailid")
	private String mailid;
	
	@Column (name="exp")
	private Integer experience;
	
	@Column (name="certification")
	private String certification;
	
	@Column (name="desi")
	private String designation;
	
	
	
	public EmployeeMaster() {
		
	}

	public EmployeeMaster(Integer empid, String firstname, String lastname,
		 double contact,String mailid, Integer experience, String certification, String designation	) {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact=contact;
		this.mailid=mailid;
		this.experience=experience;
		this.certification=certification;
		this.designation=designation;

	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getContact() {
		return contact;
	}

	public void setContact(double contact) {
		this.contact = contact;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
		
		
		/*@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="EmpId")
		private Integer empid;
		
		@Column(name="EmpName")
		private String empname;
		
		@Column(name="BankId")
		private Integer bankid;
		
		@Column(name="Status")
		private String status;
		
		@Column(name="AccountId")
		private Integer accountid;
		
		@Column(name="Contact")
		private Integer contact;
		
		@Column(name="MailId")
		private String mailid;
		
		@Column(name="PracId")
		private Integer pracid;
		
		@Column(name="PracGrpId")
		private Integer pracgrpid;
		
		@Column(name="PrimSkill")
		private Integer primaryskill;
		
		@Column(name="SecSkill")
		private String secondaryskill;
		
		@Column(name="Exp")
		private Integer experience;
		
		@Column(name="DomId")
		private Integer domainid;
	
		@Column(name="Certification")
		private String certification;
		
		@Column(name="Design")
		private String designation;
		
		@Column(name="LrnId")
		private Integer lrnid;

		public EmployeeMaster() {
		}

		public EmployeeMaster(Integer empid, String empname, Integer bankid, String status, Integer accountid,
				Integer contact, String mailid, Integer pracid, Integer pracgrpid, Integer primaryskill,
				String secondaryskill, Integer experience, Integer domainid, String certification, String designation,
				Integer lrnid) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.bankid = bankid;
			this.status = status;
			this.accountid = accountid;
			this.contact = contact;
			this.mailid = mailid;
			this.pracid = pracid;
			this.pracgrpid = pracgrpid;
			this.primaryskill = primaryskill;
			this.secondaryskill = secondaryskill;
			this.experience = experience;
			this.domainid = domainid;
			this.certification = certification;
			this.designation = designation;
			this.lrnid = lrnid;
		}

		public Integer getEmpid() {
			return empid;
		}

		public void setEmpid(Integer empid) {
			this.empid = empid;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}

		public Integer getBankid() {
			return bankid;
		}

		public void setBankid(Integer bankid) {
			this.bankid = bankid;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getAccountid() {
			return accountid;
		}

		public void setAccountid(Integer accountid) {
			this.accountid = accountid;
		}

		public Integer getContact() {
			return contact;
		}

		public void setContact(Integer contact) {
			this.contact = contact;
		}

		public String getMailid() {
			return mailid;
		}

		public void setMailid(String mailid) {
			this.mailid = mailid;
		}

		public Integer getPracid() {
			return pracid;
		}

		public void setPracid(Integer pracid) {
			this.pracid = pracid;
		}

		public Integer getPracgrpid() {
			return pracgrpid;
		}

		public void setPracgrpid(Integer pracgrpid) {
			this.pracgrpid = pracgrpid;
		}

		public Integer getPrimaryskill() {
			return primaryskill;
		}

		public void setPrimaryskill(Integer primaryskill) {
			this.primaryskill = primaryskill;
		}

		public String getSecondaryskill() {
			return secondaryskill;
		}

		public void setSecondaryskill(String secondaryskill) {
			this.secondaryskill = secondaryskill;
		}

		public Integer getExperience() {
			return experience;
		}

		public void setExperience(Integer experience) {
			this.experience = experience;
		}

		public Integer getDomainid() {
			return domainid;
		}

		public void setDomainid(Integer domainid) {
			this.domainid = domainid;
		}

		public String getCertification() {
			return certification;
		}

		public void setCertification(String certification) {
			this.certification = certification;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public Integer getLrnid() {
			return lrnid;
		}

		public void setLrnid(Integer lrnid) {
			this.lrnid = lrnid;
		}
*/ 
		

	}
