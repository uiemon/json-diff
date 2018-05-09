package testMethod;

import com.fasterxml.jackson.databind.JsonNode;

import testData.SampleJsons;
import util.JsonConverter;
import util.JsonPrinter;

public class PrintJsonTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		JsonConverter jsonConverter = new JsonConverter();
		JsonNode node = jsonConverter.convertStringToJsonNode(SampleJsons.json1);

		JsonPrinter jsonPrinter = new JsonPrinter();

		jsonPrinter.JsonPrintToSystem(node);
	}

}
