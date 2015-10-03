package khtn.StringMethods;

import java.util.StringTokenizer;

public class ChangeName extends NameSource{
	public ChangeName(String inName) {
		super(inName);
	}

	@Override
	public String changeToLowerCase() {
		return this.getInput().toLowerCase();
	}

	@Override
	public String changeToUpperCase() {
		return this.getInput().toUpperCase();
	}
	
	@Override
	public String deleteUselessWhiteSpace() {
		String name = "";
		StringBuilder builder = new StringBuilder();
		StringTokenizer token =  new StringTokenizer(this.getInput());
		while(token.hasMoreTokens())
		{
			String str = token.nextToken();
			builder.append(str+" ");
		}
		name = builder.toString();
		return name.trim();
	}

	@Override
	public String firstCharUpperCase() {
		String name = this.getInput();
		StringBuilder builder = new StringBuilder();
		StringTokenizer token =  new StringTokenizer(name);
		while(token.hasMoreTokens())
		{
			String str = token.nextToken();
			char[]arr = str.toCharArray();
			if (arr[0]>96&&arr[0]<123)
			{
				arr[0]-=32;
			}
			builder.append(arr);
			builder.append(" ");
		}
		return builder.toString().trim();
	}
	
	@Override
	public int countUpperCase()	{
		char [] arr = this.getInput().toCharArray();
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if (Character.isUpperCase(arr[i]))
			{
				sum++;
			}
		}
		return sum;
	}

	@Override
	public int countLowerCase() {
		char [] arr = this.getInput().toCharArray();
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if (Character.isLowerCase(arr[i]))
			{
				sum++;
			}
		}
		return sum;
	}

	@Override
	public int countWhiteSpace(){
		char [] arr = this.getInput().toCharArray();
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if (Character.isWhitespace(arr[i]))
			{
				sum++;
			}
		}
		return sum;
	}
}
