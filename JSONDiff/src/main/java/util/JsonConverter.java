package util;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {

	public JsonNode convertStringToJsonNode(String jsonString) {

		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonRootNode = null;

		try {
			jsonRootNode = mapper.readTree(jsonString);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return jsonRootNode;
	}

}
