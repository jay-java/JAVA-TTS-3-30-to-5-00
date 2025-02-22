package core;

abstract class RBI{
	abstract public void interest();
	abstract public void HL();
	public void call() {
		System.out.println("");
	}
	public static void repoRate() {
		System.out.println("static in abstract");
	}
}

class SBI extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("SBI interest : 3%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI HL 8%");
	}
	
}
class JAVA extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("JAVA interest : 4%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("JAVA HL 9%");
	}
	
}
public class P013_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.HL();
		s.interest();
		s.repoRate();
		s.call();
		SBI.repoRate();
		
		JAVA j = new JAVA();
		j.HL();
		j.interest();
		j.call();
		JAVA.repoRate();
		
		RBI.repoRate();
		
		
	}
}
