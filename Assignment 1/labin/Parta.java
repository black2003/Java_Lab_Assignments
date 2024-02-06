package labin;
import java.io.*; 
public class Parta  
{
	public int getData() throws IOException
		{
			System.out.println("Get data");
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			String str=bf.readLine();
			return Integer.parseInt(str);
		}
}
	
