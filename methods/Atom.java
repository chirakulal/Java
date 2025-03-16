class Atom{
	static void combine(){
		System.out.println("Combine to formatoms");
	}
	static void getAtomicNumber(){
		System.out.println("Atomicnumber is running");
		getmass()
	}
	static void getmass(){
		System.out.println("getmass is running");
	}
	static void getCoordinates(){
		System.out.println("getcoordinates is running");
	}
	static void getCharge(){
		System.out.println("getcharge is running");
	}
	static void getSymbol(){
		System.out.println("getsymbol is running");
		getBondedAtoms();
	}
	static void getBondedAtoms(){
		System.out.println("getBondedAtoms is running");
		getCoordinates();
	}
	static void getCoordinates(){
		System.out.println("Cgetcoordinates is running");
		getCharge();
	}
	static void getCharge(){
		System.out.println("getcharge is running");
		getElectronConfiguration();
	}
	static void getElectronConfiguration(){
		System.out.println("getElectronconfiguration is running");
	}
}