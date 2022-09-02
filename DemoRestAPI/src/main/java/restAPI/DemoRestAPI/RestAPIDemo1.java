package restAPI.DemoRestAPI;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class RestAPIDemo1 {
	public static void main(String[] args) throws Exception {
		Transcript transcript = new Transcript();
		String audioFile = "http://mp3teluguwap.net/mp3/2021/Ardhashathabdam/Ye%20Kannulu%20Choodani%20-%20SenSongsMp3.Com.mp3m@";
		transcript.setAudio_url(audioFile);
		Gson gson = new Gson();
		String jsonRequest = gson.toJson(transcript);
		System.out.println(jsonRequest);
		HttpRequest postRequest = HttpRequest.newBuilder().uri(new URI("https://api.assemblyai.com/v2/transcript"))
				.header("Authorization", "89280879291342a192667ff7187cafa8").POST(BodyPublishers.ofString(jsonRequest))
				.build();
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());
		System.out.println(postResponse.body());

		transcript = gson.fromJson(postResponse.body(), Transcript.class);
		System.out.println(transcript.getId());

		HttpRequest getRequest = HttpRequest.newBuilder()
				.uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
				.header("Authorization", "89280879291342a192667ff7187cafa8").build();
		while (true) {
			HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
			transcript = gson.fromJson(getResponse.body(), Transcript.class);
			System.out.println(transcript.getStatus());
			if ("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus())) {
				break;
			}
			Thread.sleep(1000);
		}
		System.out.println("Transcription Completed");
		System.out.println(postResponse.body());
		System.out.println(transcript.getText());

	}

}
