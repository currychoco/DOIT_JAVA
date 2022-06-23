package array;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		
		dogs[0] = new Dog("흰둥이", "백구");
		dogs[1] = new Dog("누렁이", "황구");
		dogs[2] = new Dog("바둑이", "시츄");
		dogs[3] = new Dog("초코", "푸들");
		dogs[4] = new Dog("곽두철", "치와와");

		System.out.println("===for문===");
		for(int i=0; i<dogs.length; i++) {
			dogs[i].showDogInfo();
		}
		
		System.out.println("===EnhanceFor문===");
		
		for(Dog dog : dogs) {
			dog.showDogInfo();
		}
	}

}
