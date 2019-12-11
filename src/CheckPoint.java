import java.util.ArrayList;
import java.util.Random;

public class CheckPoint {
public static void main(String[] args) {
	ArrayList<Cow> list=new ArrayList<Cow>();
	Random ran=new Random();
	
	int Ran=ran.nextInt(20);
	for (int i = 0; i < Ran; i++) {
		Cow moo=new Cow();
		list.add(moo);
		list.get(i).feed();
	}
	for (int i = 0; i < list.size(); i++) {
		
		
	}
	
}
}
class Cow {
    public void feed(){}
  }
