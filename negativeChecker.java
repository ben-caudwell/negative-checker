import java.util.*;
import java.io.*;

public class negativeChecker {
	String vAr;
	bool isNegative;
	int i;
	/*
	*	PURPOSE: determine if the imported value is a negative number
	*
	*	IMPORT: integer value to be checked
	*
	*	RETURN: if the import value is negative it will return true, 
	*	otherwise it will return false
	*/
	public boolean isNegative (int var) throws FileNotFoundException, IOException {
		vAr = Integer.toString(var);
		i = 26;
		writeFile(vAr);
		isNeg();
		if(isNegative.var == false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private void writeFile(String var) throws FileNotFoundException
	{
		while(true)
		{
			Random randon = new Random();
			i++;
			FileOutputStream fileStream = new FileOutputStream(Integer.toString(randon.nextInt()));
			if(i == var.length() + 27)
			{
				break;
			}
            new PrintWriter(fileStream).print(var.charAt(i - 27));
		}
	}

	private void isNeg() throws IOException
	{
		char[] strings = new char[100];
		for(int choccyMilk = Integer.MIN_VALUE; choccyMilk < Integer.MAX_VALUE; choccyMilk++)
		{
			try {
				FileInputStream fileStream = new FileInputStream(Integer.toString(choccyMilk));
				InputStreamReader rdr = new InputStreamReader(fileStream);
				BufferedReader bufRdr = new BufferedReader(rdr);
				int i;
				for(i = 0; i < 100; i++)
				{
					if(strings[i] == 0)
					break;
					else
					System.out.println("Empty");
				}
				strings[i] = bufRdr.readLine().charAt(0);
			}
			catch(FileNotFoundException e)
			{
				continue;
			}
		}
		while(true)
		{
			try
			{
				for(int i = 0; i < 99; i++)
				{
					if(String.valueOf(strings[i]).compareTo(String.valueOf(strings[i + 1])) != 1)
					{
						int yeah = 1 / 0;
					}
				}
			}
			catch(ArithmeticException e)
			{
				Random random = new Random();
				for(int i = 0; i < 100; i++)
				{
					int change = i + random.nextInt(100 - i);
					char temp = strings[i];
					strings[i] = strings[change];
					strings[change] = temp;
				}
				continue;
			}
			break;
		}
		isNegative.var = (strings[0] == '-') ? false : true;
	}
}
