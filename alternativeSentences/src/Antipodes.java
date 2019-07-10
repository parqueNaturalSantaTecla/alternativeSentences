class Antipodes extends Console {
	
	public static void main(String[] agrs) {
		new Antipodes().exec();
	}

	void exec() {
		//TODO
		int latitudeGrades = readInt("Latitud? ");
		int longitudeGrades = readInt("Longitud? ");

		int latitudeGradesAbs = latitudeGrades;
		char latitudeCardinalPoint = 'N';
		if (latitudeGrades < 0) {
			latitudeGradesAbs *= -1;
			latitudeCardinalPoint = 'S';
		} 
		int longitudeGradesAbs = longitudeGrades;
		char longitudeCardinalPoint = 'E';
		if (longitudeGrades < 0) {
			longitudeGradesAbs *= -1;
			longitudeCardinalPoint = 'O';
		} 
		writeln(latitudeGradesAbs + "º" + latitudeCardinalPoint + " " + longitudeGradesAbs + "º"
				+ longitudeCardinalPoint);
		int antipodeLatitudeGrades = latitudeGradesAbs;
		char antipodeLatitudeCardinalPoint = 'N';
		if (latitudeCardinalPoint == 'N') {
			antipodeLatitudeCardinalPoint = 'S';
		} 
		int antipodeLongitudeGrades = 180 - longitudeGradesAbs;
		char antipodeLongitudeCardinalPoint = 'E';
		if (longitudeCardinalPoint == 'E') {
			antipodeLongitudeCardinalPoint = 'W';
		} 
		writeln(antipodeLatitudeGrades + "º" + antipodeLatitudeCardinalPoint + " " + antipodeLongitudeGrades
				+ "º" + antipodeLongitudeCardinalPoint);
		//
	}

}
