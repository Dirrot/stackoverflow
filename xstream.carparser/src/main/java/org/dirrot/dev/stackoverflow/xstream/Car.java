package org.dirrot.dev.stackoverflow.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Car")
public class Car {

	@XStreamAlias("CarId")
	private int carId;

	@XStreamAlias("CarCode")
	private String carCode;

	@XStreamAlias("CarType")
	private String carType;

	@XStreamAlias("CarName")
	private String carName;

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarCode() {
		return carCode;
	}

	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carCode == null) ? 0 : carCode.hashCode());
		result = prime * result + carId;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + ((carType == null) ? 0 : carType.hashCode());
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
		Car other = (Car) obj;
		if (carCode == null) {
			if (other.carCode != null)
				return false;
		} else if (!carCode.equals(other.carCode))
			return false;
		if (carId != other.carId)
			return false;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (carType == null) {
			if (other.carType != null)
				return false;
		} else if (!carType.equals(other.carType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carCode=" + carCode + ", carType="
				+ carType + ", carName=" + carName + "]";
	}

}
