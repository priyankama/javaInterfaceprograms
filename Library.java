import java.io.*;
interface Item{
    void read();
    void show();
    }
class Book implements Item{
    Console con=System.console();
    String title,author,publication;
    public  void read()
    {
        System.out.print("Enter title of book : ");
        title=new String(con.readLine());
        System.out.print("Enter author name : ");
        author=new String(con.readLine());
        System.out.print("Enter publication : ");
        publication=new String(con.readLine());
    }
    public void show()
    {
        System.out.println("Book : "+title+"    Author : "+author+"    Publication  : "+publication);
    }
}

class Dvd implements Item{
    Console con=System.console();
    String title,director,category;
    public void read()
    {    
        System.out.print("Enter title of movie : ");
        title=new String(con.readLine());
        System.out.print("Enter director name : ");
        director=new String(con.readLine());
        System.out.print("Enter category : ");
        category=new String(con.readLine());
    }
   public void show()
    {
        System.out.println("Dvd : "+title+"    Director : "+director+"    Publication  : "+category);
    }
}   
class Library
{    
    public static void main(String args[]){
        Item a[]=new Item[10];
	Console con=System.console();
        for(int i=0;i<10;i++){
        System.out.print("Book or Dvd <b/d> : ");
        String c=(con.readLine());
	String b1="b";
        if(c.equals(b1))    
        {    a[i]=new Book();
            a[i].read();
        }        
        else
        {
            a[i]=new Dvd();
            a[i].read();
        }	
	}
	for(int i=0;i<10;i++){
		a[i].show();}
    }
}   