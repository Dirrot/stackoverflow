package org.dirrot.dev.stackoverflow.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("soap:Envelope")
public class SOAPEnvelope {

	@XStreamAlias("soap:Body")
	private SOAPBody soapBody;

	public SOAPBody getSoapBody() {
		return soapBody;
	}

	public void setSoapBody(SOAPBody soapBody) {
		this.soapBody = soapBody;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((soapBody == null) ? 0 : soapBody.hashCode());
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
		SOAPEnvelope other = (SOAPEnvelope) obj;
		if (soapBody == null) {
			if (other.soapBody != null)
				return false;
		} else if (!soapBody.equals(other.soapBody))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SOAPEnvelope [soapBody=" + soapBody + "]";
	}

}
