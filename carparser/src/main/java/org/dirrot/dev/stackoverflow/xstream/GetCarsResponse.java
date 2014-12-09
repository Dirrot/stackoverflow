package org.dirrot.dev.stackoverflow.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("GetCarsResponse")
public class GetCarsResponse {

	@XStreamAlias("GetCarsResult")
	private GetCarResult getCarResult;

	public GetCarResult getGetCarResult() {
		return getCarResult;
	}

	public void setGetCarResult(GetCarResult getCarResult) {
		this.getCarResult = getCarResult;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getCarResult == null) ? 0 : getCarResult.hashCode());
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
		GetCarsResponse other = (GetCarsResponse) obj;
		if (getCarResult == null) {
			if (other.getCarResult != null)
				return false;
		} else if (!getCarResult.equals(other.getCarResult))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GetCarsResponse [getCarResult=" + getCarResult + "]";
	}

}
