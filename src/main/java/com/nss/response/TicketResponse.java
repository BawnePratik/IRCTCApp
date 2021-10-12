package com.nss.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TicketResponse {

	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String from;
	private String to;
	private String train;
	private String status;
	private Double price;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the doj
	 */
	public String getDoj() {
		return doj;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(String doj) {
		this.doj = doj;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the train
	 */
	public String getTrain() {
		return train;
	}
	/**
	 * @param train the train to set
	 */
	public void setTrain(String train) {
		this.train = train;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "TicketResponse [name=" + name + ", dob=" + dob + ", gender=" + gender + ", doj=" + doj + ", from="
				+ from + ", to=" + to + ", train=" + train + ", status=" + status + ", price=" + price + "]";
	}
	
}
