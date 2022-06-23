package array;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		
		DogOwner owner1 = new DogOwner("고길동");
		owner1.addDog("곽두팔", "치와와");
		owner1.addDog("김철두", "말티즈");
		
		owner1.showInfo();
	
	}

}