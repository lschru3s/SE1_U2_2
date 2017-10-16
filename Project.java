package se_01;

public class Project {
	
	String[][] array;
	
	Project(String[][] s) {
		array = s;
	}
	
	public boolean isWellSorted(String[] sequence) {
		if(sequence.length != 0) {
			String pos0 = sequence[0];
			if(pos0=="A"&&sequence.length==1) {
				return false;
			}
			if(sequence.length==2) {
				String pos1 = sequence[0];
				if(pos0==pos1) {
					return false;
				}
			}
			String pos11 = sequence[1];
			String pos2 = sequence[2];
			if((pos0=="A"&&pos11=="B"&&pos2=="C") || (pos0=="B"&&pos11=="A"&&pos2=="C")) {
				return true;
			}
		}
		return false;
	}
}
		/*for(int i = 0; i<sequence.length; i++) {
			if(pos1 == "A" && (sequence[i+1] == "A" || sequence[i+1] == "B")) {
				
			}
		}*/

			/*for(int i = 0; i<array.length; i++) {
				for(int j = 0; j<sequence.length; j++) {
					if((array[i][0] == sequence[j])) {
						System.out.println("Hallo2");
						return false;
					} 
				}
			}
			return true;
		} else {
			return false;
		}*/