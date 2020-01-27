package com;

public class Address {
int pincode;
String landmark;
int houseNo;
@Override
public String toString() {
	return "Address [pincode=" + pincode + ", landmark=" + landmark + ", houseNo=" + houseNo + "]";
}
public Address(int pincode, String landmark, int houseNo) {
	super();
	this.pincode = pincode;
	this.landmark = landmark;
	this.houseNo = houseNo;
}

public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}
public int getHouseNo() {
	return houseNo;
}
public void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}

}
