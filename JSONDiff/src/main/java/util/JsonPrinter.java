package util;

import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonPrinter {

	private static int ROOP_COUNTER = 0;

	public void JsonPrintToSystem(JsonNode node) {

		if(node.isNull())
			return;

		if(node.isArray()) {

			System.out.println();
			printSpace();
			System.out.println("[");
			ROOP_COUNTER++;

			Iterator<JsonNode> subNodes = node.elements();

			while(subNodes.hasNext()) {

				JsonNode subNode = subNodes.next();

				JsonPrintToSystem(subNode);
			}

			System.out.println();
			printSpace();
			System.out.println("]");

		} else if(node.isObject()){

			printSpace();
			System.out.println("{");
			ROOP_COUNTER++;

			Iterator<String> subNodeFields = node.fieldNames();

			while(subNodeFields.hasNext()) {

				String field = subNodeFields.next();

				printSpace();
				System.out.print("\"" + field + "\" : ");

				JsonNode subNode = node.get(field);

				ROOP_COUNTER++;
				JsonPrintToSystem(subNode);

				if(subNodeFields.hasNext()) {
					System.out.println(" ,");
				} else {
					System.out.println();
					ROOP_COUNTER--;
					printSpace();
					System.out.println("}");
				}
			}

		} else if(node.isValueNode()) {

			System.out.print("\"" + node.textValue() + "\"");
		}

		ROOP_COUNTER--;
	}

//	public void JsonPrintToSystem(JsonNode node) {
//
//		if(node.isNull())
//			return;
//
//		if(node.isArray()) {
//			System.out.println();
//			printSpace();
//			System.out.print("[");
//			ROOP_COUNTER++;
//
//			Iterator<JsonNode> subNodes = node.elements();
//
//			while(subNodes.hasNext()) {
//
//				JsonNode subNode = subNodes.next();
//
//				System.out.println();
//				printSpace();
//				JsonPrintToSystem(subNode);
//			}
//
//			System.out.println();
//			printSpace();
//			System.out.println("]");
//
//		} else if(node.isObject()){
//
//			System.out.println();
//			printSpace();
//			System.out.println("{");
//			ROOP_COUNTER++;
//
//			Iterator<String> subNodeFields = node.fieldNames();
//
//			while(subNodeFields.hasNext()) {
//
//				String field = subNodeFields.next();
//
//				printSpace();
//				System.out.print("\"" + field + "\" : ");
//
//				JsonNode subNode = node.get(field);
//
//				ROOP_COUNTER++;
//				JsonPrintToSystem(subNode);
//
//				if(subNodeFields.hasNext()) {
//					System.out.println(" ,");
//				} else {
//					System.out.println();
//					ROOP_COUNTER--;
//					printSpace();
//					System.out.print("}");
//				}
//			}
//
//		} else if(node.isValueNode()) {
//
//			System.out.print("\"" + node.textValue() + "\"");
//		}
//
//		ROOP_COUNTER--;
//	}

	private void printSpace() {

		for(int i= 0; i < ROOP_COUNTER; i++) {
			System.out.print("  ");
		}
	}
}
