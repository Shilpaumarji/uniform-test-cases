package com.training.bean;

public class UniformLoginBean {
	private String firstname;
	private String lastname;
	private String email;
	private String telephone ;
	private String address1;
	private String city;
	private String postcode;
	private String countryid;
	private String zoneid;
	private String inputpassword;
	private String confirmpassword;
	
	public UniformLoginBean() {
	}

	public UniformLoginBean(String firstname, String lastname, String email, String telephone, String address1,
			String city, String postcode, String countryid, String zoneid, String inputpassword, String confirmpassword) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.telephone = telephone;
		this.address1 = address1;
		this.city = city;
		this.postcode = postcode;
		this.countryid = countryid;
		this.zoneid = zoneid;
		this.inputpassword = inputpassword;
		this.confirmpassword = confirmpassword;
		
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}
	public String gettelephone() {
		return telephone;
	}

	public void settelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getaddress1() {
		return address1;
	}
	public void setaddress1(String address1) {
		this.address1= address1;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city= city;
	}
	public String getpostcode() {
		return postcode;
	}
	public void setpostcode(String postcode) {
		this.postcode= postcode;
	}
	public String getcountryid() {
		return countryid;
	}
	public void setcountryid(String countryid) {
		this.countryid= countryid;}
	
		public String getzoneid() {
			return zoneid;}
		public void setzoneid(String zoneid) {
			this.zoneid = zoneid;}
		public String getinputpassword() {
			return inputpassword;}
			public void setinputpassword(String inputpassword) {
				this.inputpassword = inputpassword;}
		public String  getconfirmpassword() {
			return confirmpassword;}
			public void setconfirmpassword(String confirmpassword) {
				this.confirmpassword = confirmpassword;}
						

	@Override
	public String toString() {
		return "UniformLoginBean [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ",telephone=" + telephone + ""
				+ ",address1=" + address1 +", city=" + city + ", postcode=" + postcode + ",countryid=" + countryid +", zoneid=" + zoneid +",inputpassword=" + inputpassword +",confirmpassword=" + confirmpassword +" ]";
				
	}

}
