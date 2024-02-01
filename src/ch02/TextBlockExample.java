package ch02;

public class TextBlockExample {
	public static void main(String[] args) {
		
		String str = "" +
		"{\n" +
		"\t\"id\":\"Dongin\",\n" +
		"\t\"name\":\"원동인\"\n" +
		"}";
		
		System.out.println(str);
		System.out.println("---------------------------------------");
		
		String str2 = """
			{
					"id":"Dongin",
					"name":"원동인"
			}
			""";
		System.out.println(str2);
		System.out.println("----------------------------------------");
		
		String str3 = """
				나는 자바를 \
				학습합니다. \
				나는 자바를 마스터 합니다.
				""";
		System.out.println(str3);
		

		
		
	}

}
