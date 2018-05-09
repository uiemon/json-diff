package testData;

public class SampleJsons {

	public static final String json1 = "{" +
										"  \"reservations\": [" +
										"    {" +
										"      \"instances\": [" +
										"        {\"type\": \"small\"," +
										"         \"state\": {\"name\": \"running\"}," +
										"         \"tags\": [{\"Key\": \"Name\"," +
										"                   \"Values\": [\"Web\"]}," +
										"                  {\"Key\": \"version\"," +
										"                   \"Values\": [\"1\"]}]}," +
										"        {\"type\": \"large\"," +
										"         \"state\": {\"name\": \"stopped\"}," +
										"         \"tags\": [{\"Key\": \"Name\"," +
										"                   \"Values\": [\"Web\"]}," +
										"                  {\"Key\": \"version\"," +
										"                   \"Values\": [\"1\"]}]}" +
										"      ]" +
										"    }, {" +
										"      \"instances\": [" +
										"        {\"type\": \"medium\"," +
										"         \"state\": {\"name\": \"terminated\"}," +
										"         \"tags\": [{\"Key\": \"Name\"," +
										"                   \"Values\": [\"Web\"]}," +
										"                  {\"Key\": \"version\"," +
										"                   \"Values\": [\"1\"]}]}," +
										"        {\"type\": \"xlarge\"," +
										"         \"state\": {\"name\": \"running\"}," +
										"         \"tags\": [{\"Key\": \"Name\"," +
										"                   \"Values\": [\"DB\"]}," +
										"                  {\"Key\": \"version\"," +
										"                   \"Values\": [\"1\"]}]}" +
										"      ]" +
										"    }" +
										"  ]" +
										"}";
}
