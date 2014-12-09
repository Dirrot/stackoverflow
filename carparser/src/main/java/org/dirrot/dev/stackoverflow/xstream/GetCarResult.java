package org.dirrot.dev.stackoverflow.xstream;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("GetCarsResult")
public class GetCarResult {

	@XStreamAlias("ResponseCode")
	private ResponseCode responseCode;

	@XStreamAlias("ResponseText")
	private ResponseText responseText;

	@XStreamAlias("Cars")
	private List<Car> cars;

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public ResponseCode getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	}

	public ResponseText getResponseText() {
		return responseText;
	}

	public void setResponseText(ResponseText responseText) {
		this.responseText = responseText;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cars == null) ? 0 : cars.hashCode());
		result = prime * result
				+ ((responseCode == null) ? 0 : responseCode.hashCode());
		result = prime * result
				+ ((responseText == null) ? 0 : responseText.hashCode());
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
		GetCarResult other = (GetCarResult) obj;
		if (cars == null) {
			if (other.cars != null)
				return false;
		} else if (!cars.equals(other.cars))
			return false;
		if (responseCode == null) {
			if (other.responseCode != null)
				return false;
		} else if (!responseCode.equals(other.responseCode))
			return false;
		if (responseText == null) {
			if (other.responseText != null)
				return false;
		} else if (!responseText.equals(other.responseText))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GetCarResult [responseCode=" + responseCode + ", responseText="
				+ responseText + ", cars=" + cars + "]";
	}

}
