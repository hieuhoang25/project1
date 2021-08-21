package EpKieuThuaKe;

public class Main {
	public static void main(String[] args) {
//		Ep xuong
		Animal animal = new Cat("Tom", 12, "Black", "Fish");
//		animal.catchMouse(); flase
		animal.eat();
// 		Ep len
		Cat cat = (Cat) animal;
	
		cat.catchMouse();//-> su dung duoc
//		Cachs ep kieu dung
		if(animal instanceof Cat) {
			Cat cat1 = (Cat) animal;
			cat1.catchMouse();
		}
	}
}
