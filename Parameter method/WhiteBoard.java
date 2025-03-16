class WhiteBoard{
	static void write( String colorpen){
		System.out.println(colorpen);
	}
	static void erase( String erasertype){
		System.out.println(erasertype);
	}
	
	static void clean( String clothtype){
		System.out.println(clothtype);
	}
	
	static void attach(String magnet, int quantity) {
		System.out.println(magnet+" "+quantity);
	}
	static void draw( int size, boolean colorful) {
		System.out.println(size+" "+colorful);
	}
	static void mount(String wallType, int height, boolean permanent) {
		System.out.println(wallType+" "+height+" "+permanent);
	}
	static void displayContent(String topic, String fontStyle, boolean readable) {
		System.out.println(topic+" "+fontStyle+" "+readable);
	}
}