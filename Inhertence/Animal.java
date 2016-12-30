public class Animal{
	private  int age;
    private String color;
/*if you use the emty constructor you do not need to use the setters */
    public Animal(){

    }
/*if you use this constructor you neeed to use the setters and geter*/
public Animal(int a, String c){
	 age = a;
	 color = c;

}
     public void setAge(int a){
              age =a;
     }

     public int getAge(){
     	return age;
     }

     public void setColor(String c){
     	color = c;
     }

     public String getColor(){
     	return color;
     }


}