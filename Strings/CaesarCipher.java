class CaesarCipher
{
	public static String caesarCipher(String s, int k) 
	{

    		StringBuilder result = new StringBuilder();

    		k = k % 26;

    		for(char ch : s.toCharArray()) 
		{
			if(ch >= 'a' && ch <= 'z') 
			{
				ch = (char)('a' + (ch - 'a' + k) % 26);
        		}

        		else if(ch >= 'A' && ch <= 'Z') 
			{
				ch = (char)('A' + (ch - 'A' + k) % 26);
        		}
				result.append(ch);
    		}

    		return result.toString();
	}
}