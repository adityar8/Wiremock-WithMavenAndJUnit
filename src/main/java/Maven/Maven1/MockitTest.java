package Maven.Maven1;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

import com.github.tomakehurst.wiremock.WireMockServer;

public class MockitTest {

	
	public static void main(String args[]){
		
		WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));
		//No-args constructor will start on port 8080, no HTTPS
		wireMockServer.start();

		
		System.out.println("Started Wiremock on 8089...");
		// Do some stuff

	//	WireMock.reset();

		// Finish doing stuff

		//wireMockServer.stop();
	}
	
	
}
