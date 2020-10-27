package First

class Exercise_1 {
	static void main(args) {
		//Un-initialized variables
		def x //In Groovy
		int y //In Java
		
		//Array
		def arr = [1, 2.0, "Test", true, x, y]
		arr.each { println  it.getClass()}
		}
}
