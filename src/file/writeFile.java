package file;

import java.io.*;
public class writeFile
{
	public static void main(String[] args)
	{
		writeFile("F:\\19920911.txt", "1");
	}

	public static void writeFile(String path,String content)
	{
		BufferedWriter out = null;   
	    try 
	    {   
	         out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, true)));   
	         out.write(content);   
	    }
	    catch (Exception e) 
	    {   
	    	e.printStackTrace();   
	    } 
	    finally 
	    {   
            try 
            {   
                out.close();   
            } 
            catch (IOException e) 
            {   
                e.printStackTrace();   
            }   
	    }
	}
}
