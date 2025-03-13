class FaceRunner{
	public static void main(String[] args){
		String shape ="oval" ;
		String skintone="brown";
		String eyecolor="black";
		
		Face face1 = new Face(shape,skintone,eyecolor);
		System.out.println(face1.shape);
		System.out.println(face1.skintone);
		System.out.println(face1.eyecolor);
		
		String shape2 ="round" ;
		String skintone2="green";
		String eyecolor2="white";
		
		Face face2 = new Face(shape2,skintone2,eyecolor2);
		System.out.println(face2.shape);
		System.out.println(face2.skintone);
		System.out.println(face2.eyecolor);
		
		String shape3 ="oval" ;
		String skintone3="black";
		String eyecolor3="white";
		
		Face face3 = new Face(shape3,skintone3,eyecolor3);
		System.out.println(face3.shape);
		System.out.println(face3.skintone);
		System.out.println(face3.eyecolor);
		
		String shape4 ="Square" ;
		String skintone4="brown";
		String eyecolor4="brown";
		
		Face face4 = new Face(shape4,skintone4,eyecolor4);
		System.out.println(face4.shape);
		System.out.println(face4.skintone);
		System.out.println(face4.eyecolor);
		
		String shape5 ="round" ;
		String skintone5="black";
		String eyecolor5="black";
		
		Face face5 = new Face(shape5,skintone5,eyecolor5);
		System.out.println(face5.shape);
		System.out.println(face5.skintone);
		System.out.println(face5.eyecolor);
	}
}