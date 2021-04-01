package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	Cat dog = new Cat("dog");
	dog.meow();
	dog.printName();
	for (int i = 0; i < 9; i++) {
		dog.kill();
}}
}
