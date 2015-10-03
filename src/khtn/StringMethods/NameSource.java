package khtn.StringMethods;

public class NameSource extends MethodsSource implements IMethodsSource{
	private String Input;

	public String getInput() {
		return Input;
	}
	public void setInput(String Input) {
		this.Input = Input;
	}

	public NameSource() {
		super();
	}
	public NameSource(String Input) {
		super();
		this.Input = Input;	
	}

	public int countUpperCase() {
		return 0;
	}
	public int countLowerCase() {
		return 0;
	}
	public int countWhiteSpace() {
		return 0;
	}

	public String changeToLowerCase() {
		return null;
	}
	public String changeToUpperCase() {
		return null;
	}
	public String firstCharUpperCase() {
		return null;
	}
	public String deleteUselessWhiteSpace() {
		return null;
	}
}
