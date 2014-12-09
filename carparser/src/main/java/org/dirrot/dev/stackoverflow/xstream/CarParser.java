package org.dirrot.dev.stackoverflow.xstream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class CarParser {

	public List<Car> parse() {

		List<Car> result = new ArrayList<Car>();

		try (InputStream inputStream = Main.class
				.getResourceAsStream("CarContent.xml")) {

			XStream xstream = new XStream();
			xstream.autodetectAnnotations(true);
//			xstream.alias("soap:Envelope", SOAPEnvelope.class);

			SOAPEnvelope soapEnvelope = (SOAPEnvelope) xstream
					.fromXML(inputStream);

			result = soapEnvelope.getSoapBody().getGetCarsResult()
					.getGetCarResult().getCars();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

}
