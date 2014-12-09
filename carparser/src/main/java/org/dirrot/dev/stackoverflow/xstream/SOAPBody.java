package org.dirrot.dev.stackoverflow.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("soap:Body")
public class SOAPBody {

	@XStreamAlias("GetCarsResponse")
	private GetCarsResponse getCarsResult;

	public GetCarsResponse getGetCarsResult() {
		return getCarsResult;
	}

	public void setGetCarsResult(GetCarsResponse getCarsResult) {
		this.getCarsResult = getCarsResult;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getCarsResult == null) ? 0 : getCarsResult.hashCode());
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
		SOAPBody other = (SOAPBody) obj;
		if (getCarsResult == null) {
			if (other.getCarsResult != null)
				return false;
		} else if (!getCarsResult.equals(other.getCarsResult))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SOAPBody [getCarsResult=" + getCarsResult + "]";
	}

}
