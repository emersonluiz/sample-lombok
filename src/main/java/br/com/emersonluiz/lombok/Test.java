package br.com.emersonluiz.lombok;

public class Test {

	public static void main(String[] args) {
		
		Sample sample = new Sample();
		sample.setName("Mickey Mouse");
		sample.setAge(10);
		
		System.out.println("O nome é: " + sample.getName() + ", com " + sample.getAge() + " anos.");
	}

}
