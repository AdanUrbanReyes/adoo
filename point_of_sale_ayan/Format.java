import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
public class Format{
	public static void main(String[] args){
		try{
			FileWriter format=new FileWriter("pharmacy.mysql");
			PrintWriter writer=new PrintWriter(format);		
	
			File file=new File("pharmacyDataBase.mysql");	
			FileReader reader=new FileReader(file);
			BufferedReader buffered=new BufferedReader(reader);
			String line;
			String []split;
			while((line=buffered.readLine())!=null){
				split=line.split(",");
				split[2]=split[2].replace("'","");
				split[7]=split[7].replace("'","");
				writer.println("("+split[0]+",'Pieces',"+split[1]+","+split[4]+","+split[4]+",'"+(split[2]+" "+split[7])+"','2016-09-03',"+split[1]+")");	
			}
			format.close();
		}catch(Exception e){
			System.out.print("\n"+e.toString());
		}
	}
}
