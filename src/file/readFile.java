package file;

import java.io.*;

public class readFile
{
	public static void main(String[] args)
	{
		String content=readFile("C:\\Users\\aniy\\Desktop\\����.txt",",");
		System.out.println(content);
		writeFile.writeFile("F:\\19920911.txt", content);
	}
	
	public static String readFile(String path,String add)
	{
		String allContent="";
		File file = new File(path);
		BufferedReader reader = null;
		
		try 
		{
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			while ((tempString = reader.readLine()) != null)
			{
				
				 System.out.println("line " + line + ": " + tempString);
				 allContent+=tempString;
				 allContent+=add;
				 line++;
			}
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
            if (reader != null) 
            {
                try
                {
                    reader.close();
                }
                catch (IOException e1)
                {
                	
                }
            }
		}
		return allContent;
	}
}
