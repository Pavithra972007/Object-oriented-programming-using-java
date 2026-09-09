import java.io.*;
class Ex7{
public static void main(String[] args){
int data;
String source="Source.txt";
String destination="destination.txt";
try
{
FileInputStream fis=new FileInputStream("source.txt");
FileOutputStream fos=new FileOutputStream("destination.txt");
while((data=fis.read()) != -1)
{
fos.write(data);
}
}
catch(Exception e)
{
System.out.println("File not found");
}
finally
{
System.out.println("file copied successfully");
}
}
}

