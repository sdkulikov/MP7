import java.util.Scanner; 
import java.lang.Math;
public class Battleship {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] compBoard = new char[10][10]; 
		char[][] userShipBoard = new char[10][10];
		char[][] userAttackBoard = new char[10][10];
		for(int row=0; row<10; row++) {
			for(int col=0; col<10; col++) {
				compBoard[row][col] = '~';
			}
		}
		for(int row=0; row<10; row++) {
			for(int col=0; col<10; col++) {
				userShipBoard[row][col] = '~';
			}
		}
		for(int row=0; row<10; row++) {
			for(int col=0; col<10; col++) {
				userAttackBoard[row][col] = '~';
			}
		}
		
		boolean valid = false; //Set up Aircraft Carrier
		while(valid == false) {
			System.out.println("Do you want your Aircraft Carrier to be vertical(1) or horizontal(0)?");
			int orient = sc.nextInt();
			if((orient != 1) && (orient !=0)) {
				valid = false;
				System.out.println("Invalid input");
			}
			else if(orient == 1) {
				System.out.println("Please enter the coordinates of the top-left corner of your Aircraft Carrier's placement.");
				System.out.println("Row? (1 - 10)");
				int shipRow = sc.nextInt();
				shipRow--;
				System.out.println("Collumn? (1 - 10)");
				int shipCol = sc.nextInt(); 
				shipCol--;
				
				if(shipRow > 5) {
					valid = false;
					System.out.println("Invalid location. Ship is not completely on grid.");
				}
				else {
					for(int i = shipRow; i < shipRow+5; i++) {
						userShipBoard[i][shipCol] = 'A';
					}
					for(int row=0; row<10; row++) {
						for(int col=0; col<10; col++) {
							System.out.print(userShipBoard[row][col] + " ");
						}
						System.out.println();
					}
					valid = true;
				}
			}
			else if(orient == 0) {
				System.out.println("Please enter the coordinates of the top-left corner of your Aircraft Carrier's placement.");
				System.out.println("Row? (1 - 10)");
				int shipRow = sc.nextInt();
				shipRow--;
				System.out.println("Collumn? (1 - 10)");
				int shipCol = sc.nextInt(); 
				shipCol--;
				
				if(shipCol > 5) {
					valid = false;
					System.out.println("Invalid location. Ship is not completely on grid.");
				}
				else {
					for(int i = shipCol; i < shipCol+5; i++) {
						userShipBoard[shipRow][i] = 'A';
					}
					for(int row=0; row<10; row++) {
						for(int col=0; col<10; col++) {
							System.out.print(userShipBoard[row][col] + " ");
						}
						System.out.println();
					}
					valid = true;
				}
			}
		}
		
		valid = false; //Set up Battleship
		while(valid == false) {
			System.out.println("Do you want your Battleship to be vertical(1) or horizontal(0)?");
			int orient = sc.nextInt();
			if((orient != 1) && (orient !=0)) {
				valid = false;
				System.out.println("Invalid input");
			}
			else if(orient == 1) {
				System.out.println("Please enter the coordinates of the top-left corner of your Battleship's placement.");
				System.out.println("Row? (1 - 10)");
				int shipRow = sc.nextInt();
				shipRow--;
				System.out.println("Collumn? (1 - 10)");
				int shipCol = sc.nextInt(); 
				shipCol--;
				
				if(shipRow > 6) {
					valid = false;
					System.out.println("Invalid location. Ship is not completely on grid.");
				}
				else {
					valid = true;
					boolean t = true;
					for(int i = shipRow; i < shipRow+4; i++) {
						if(userShipBoard[i][shipCol] != '~') {
							t = false;
							valid = false;
						}
					}
					if(valid==false) System.out.println("Invalid location. Ships overlap");
					while(t == true) {
						for(int i = shipRow; i < shipRow+4; i++) {
							userShipBoard[i][shipCol] = 'B';
						}
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								System.out.print(userShipBoard[row][col] + " ");
							}
							System.out.println();
						}
						t = false;
						valid = true;
					}
				}
			}
			else if(orient == 0) {
				System.out.println("Please enter the coordinates of the top-left corner of your Battleship's placement.");
				System.out.println("Row? (1 - 10)");
				int shipRow = sc.nextInt();
				shipRow--;
				System.out.println("Collumn? (1 - 10)");
				int shipCol = sc.nextInt(); 
				shipCol--;
				
				if(shipCol > 6) {
					valid = false;
					System.out.println("Invalid location. Ship is not completely on grid.");
				}
				else {
					valid = true;
					boolean t = true;
					for(int i = shipCol; i < shipCol+4; i++) {
						if(userShipBoard[shipRow][i] != '~') {
							t = false;
							valid = false;
						}
					}
					if(valid==false) System.out.println("Invalid location. Ships overlap");
					while(t == true) {
						for(int i = shipCol; i < shipCol+4; i++) {
							userShipBoard[shipRow][i] = 'B';
						}
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								System.out.print(userShipBoard[row][col] + " ");
							}
							System.out.println();
						}
						t = false;
						valid = true;
					}
				}
			}
		}
		
		valid = false; //Set up Submarine
		while(valid == false) {
			System.out.println("Do you want your Submarine to be vertical(1) or horizontal(0)?");
			int orient = sc.nextInt();
			if((orient != 1) && (orient !=0)) {
				valid = false;
				System.out.println("Invalid input");
			}
			else if(orient == 1) {
				System.out.println("Please enter the coordinates of the top-left corner of your Submarine's placement.");
				System.out.println("Row? (1 - 10)");
				int shipRow = sc.nextInt();
				shipRow--;
				System.out.println("Collumn? (1 - 10)");
				int shipCol = sc.nextInt(); 
				shipCol--;
				
				if(shipRow > 7) {
					valid = false;
					System.out.println("Invalid location. Ship is not completely on grid.");
				}
				else {
					valid = true;
					boolean t = true;
					for(int i = shipRow; i < shipRow+3; i++) {
						if(userShipBoard[i][shipCol] != '~') {
							t = false;
							valid = false;
						}
					}
					if(valid==false) System.out.println("Invalid location. Ships overlap");
					while(t == true) {
						for(int i = shipRow; i < shipRow+3; i++) {
							userShipBoard[i][shipCol] = 'S';
						}
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								System.out.print(userShipBoard[row][col] + " ");
							}
							System.out.println();
						}
						t = false;
						valid = true;
					}
				}
			}
			else if(orient == 0) {
				System.out.println("Please enter the coordinates of the top-left corner of your Submarine's placement.");
				System.out.println("Row? (1 - 10)");
				int shipRow = sc.nextInt();
				shipRow--;
				System.out.println("Collumn? (1 - 10)");
				int shipCol = sc.nextInt(); 
				shipCol--;
				
				if(shipCol > 7) {
					valid = false;
					System.out.println("Invalid location. Ship is not completely on grid.");
				}
				else {
					valid = true;
					boolean t = true;
					for(int i = shipCol; i < shipCol+3; i++) {
						if(userShipBoard[shipRow][i] != '~') {
							t = false;
							valid = false;
						}
					}
					if(valid==false) System.out.println("Invalid location. Ships overlap");
					while(t == true) {
						for(int i = shipCol; i < shipCol+3; i++) {
							userShipBoard[shipRow][i] = 'S';
						}
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								System.out.print(userShipBoard[row][col] + " ");
							}
							System.out.println();
						}
						t = false;
						valid = true;
					}
				}
			}
		}
		
		valid = false; //Set up Destroyer
		while(valid == false) {
			System.out.println("Do you want your Destroyer to be vertical(1) or horizontal(0)?");
			int orient = sc.nextInt();
			if((orient != 1) && (orient !=0)) {
				valid = false;
				System.out.println("Invalid input");
			}
			else if(orient == 1) {
				System.out.println("Please enter the coordinates of the top-left corner of your Destroyer's placement.");
				System.out.println("Row? (1 - 10)");
				int shipRow = sc.nextInt();
				shipRow--;
				System.out.println("Collumn? (1 - 10)");
				int shipCol = sc.nextInt(); 
				shipCol--;
				
				if(shipRow > 7) {
					valid = false;
					System.out.println("Invalid location. Ship is not completely on grid.");
				}
				else {
					valid = true;
					boolean t = true;
					for(int i = shipRow; i < shipRow+3; i++) {
						if(userShipBoard[i][shipCol] != '~') {
							t = false;
							valid = false;
						}
					}
					if(valid==false) System.out.println("Invalid location. Ships overlap");
					while(t == true) {
						for(int i = shipRow; i < shipRow+3; i++) {
							userShipBoard[i][shipCol] = 'D';
						}
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								System.out.print(userShipBoard[row][col] + " ");
							}
							System.out.println();
						}
						t = false;
						valid = true;
					}
				}
			}
			else if(orient == 0) {
				System.out.println("Please enter the coordinates of the top-left corner of your Destroyer's placement.");
				System.out.println("Row? (1 -10)");
				int shipRow = sc.nextInt();
				shipRow--;
				System.out.println("Collumn? (1 - 10)");
				int shipCol = sc.nextInt(); 
				shipCol--;
				
				if(shipCol > 7) {
					valid = false;
					System.out.println("Invalid location. Ship is not completely on grid.");
				}
				else {
					valid = true;
					boolean t = true;
					for(int i = shipCol; i < shipCol+3; i++) {
						if(userShipBoard[shipRow][i] != '~') {
							t = false;
							valid = false;
						}
					}
					if(valid==false) System.out.println("Invalid location. Ships overlap");
					while(t == true) {
						for(int i = shipCol; i < shipCol+3; i++) {
							userShipBoard[shipRow][i] = 'D';
						}
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								System.out.print(userShipBoard[row][col] + " ");
							}
							System.out.println();
						}
						t = false;
						valid = true;
					}
				}
			}
		}
		
		valid = false; //Set up Patrol Boat
		while(valid == false) {
			System.out.println("Do you want your Patrol Boat to be vertical(1) or horizontal(0)?");
			int orient = sc.nextInt();
			if((orient != 1) && (orient !=0)) {
				valid = false;
				System.out.println("Invalid input");
			}
			else if(orient == 1) {
				System.out.println("Please enter the coordinates of the top-left corner of your Patrol Boat's placement.");
				System.out.println("Row? (1 - 10)");
				int shipRow = sc.nextInt();
				shipRow--;
				System.out.println("Collumn? (1 - 10)");
				int shipCol = sc.nextInt(); 
				shipCol--;
				
				if(shipRow > 8) {
					valid = false;
					System.out.println("Invalid location. Ship is not completely on grid.");
				}
				else {
					valid = true;
					boolean t = true;
					for(int i = shipRow; i < shipRow+2; i++) {
						if(userShipBoard[i][shipCol] != '~') {
							t = false;
							valid = false;
						}
					}
					if(valid==false) System.out.println("Invalid location. Ships overlap");
					while(t == true) {
						for(int i = shipRow; i < shipRow+2; i++) {
							userShipBoard[i][shipCol] = 'P';
						}
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								System.out.print(userShipBoard[row][col] + " ");
							}
							System.out.println();
						}
						t = false;
						valid = true;
					}
				}
			}
			else if(orient == 0) {
				System.out.println("Please enter the coordinates of the top-left corner of your Patrol Boat's placement.");
				System.out.println("Row? (1 -10)");
				int shipRow = sc.nextInt();
				shipRow--;
				System.out.println("Collumn? (1 - 10)");
				int shipCol = sc.nextInt(); 
				shipCol--;
				
				if(shipCol > 8) {
					valid = false;
					System.out.println("Invalid location. Ship is not completely on grid.");
				}
				else {
					valid = true;
					boolean t = true;
					for(int i = shipCol; i < shipCol+2; i++) {
						if(userShipBoard[shipRow][i] != '~') {
							t = false;
							valid = false;
						}
					}
					if(valid==false) System.out.println("Invalid location. Ships overlap");
					while(t == true) {
						for(int i = shipCol; i < shipCol+2; i++) {
							userShipBoard[shipRow][i] = 'P';
						}
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								System.out.print(userShipBoard[row][col] + " ");
							}
							System.out.println();
						}
						t = false;
						valid = true;
					}
				}
			}
		}
		
		
		
		
		//COMPUTER
		System.out.println("Computer Placing Ships: 0% done");
		valid = false; //Set up Aircraft Carrier
		while(valid == false) {
			int orient = (int) (Math.random() * 1.99);
			if((orient != 1) && (orient !=0)) {
				valid = false;
			}
			else if(orient == 1) {
				int shipRow = (int) (Math.random() * 10);
				shipRow--;
				int shipCol = (int) (Math.random() * 10);
				shipCol--;
				
				if(shipRow > 5) {
					valid = false;
				}
				else {
					for(int i = shipRow; i < shipRow+5; i++) {
						compBoard[i][shipCol] = 'A';
					}
					valid = true;
				}
			}
			else if(orient == 0) {
				int shipRow = (int) (Math.random() * 10);
				if(shipRow > 0) shipRow--;
				int shipCol = (int) (Math.random() * 10);
				if(shipCol > 0) shipCol--;
				
				if(shipCol > 5) {
					valid = false;
				}
				else {
					for(int i = shipCol; i < shipCol+5; i++) {
						compBoard[shipRow][i] = 'A';
					}
					valid = true;
				}
			}
		}
		
		System.out.println("Computer Placing Ships: 20% done");
		valid = false; //Set up Battleship
		while(valid == false) {
			int orient = (int) (Math.random() * 1.99);
			if((orient != 1) && (orient !=0)) {
				valid = false;
			}
			else if(orient == 1) {
				int shipRow = (int) (Math.random() * 10);
				if(shipRow > 0) shipRow--;
				int shipCol = (int) (Math.random() * 10);
				if(shipCol > 0) shipCol--;
				
				if(shipRow > 6) {
					valid = false;
				}
				else {
					boolean t = true;
					for(int i = shipRow; i < shipRow+4; i++) {
						if(compBoard[i][shipCol] != '~') {
							t = false;
							valid = false;
						}
					}
					while(t == true) {
						for(int i = shipRow; i < shipRow+4; i++) {
							compBoard[i][shipCol] = 'B';
						}
						t = false;
						valid = true;
					}
				}
			}
			else if(orient == 0) {
				int shipRow = (int) (Math.random() * 10);
				if(shipRow > 0) shipRow--;
				int shipCol = (int) (Math.random() * 10);
				if(shipCol > 0) shipCol--;
				
				if(shipCol > 6) {
					valid = false;
				}
				else {
					boolean t = true;
					for(int i = shipCol; i < shipCol+4; i++) {
						if(compBoard[shipRow][i] != '~') {
							t = false;
							valid = false;
						}
					}
					while(t == true) {
						for(int i = shipCol; i < shipCol+4; i++) {
							compBoard[shipRow][i] = 'B';
						}
						t = false;
						valid = true;
					}
				}
			}
		}
		
		System.out.println("Computer Placing Ships: 40% done");
		valid = false; //Set up Submarine
		while(valid == false) {
			int orient = (int) (Math.random() * 1.99);
			if((orient != 1) && (orient !=0)) {
				valid = false;
			}
			else if(orient == 1) {
				int shipRow = (int) (Math.random() * 10);
				if(shipRow > 0) shipRow--;
				int shipCol = (int) (Math.random() * 10);
				if(shipCol > 0) shipCol--;
				
				if(shipRow > 7) {
					valid = false;
				}
				else {
					boolean t = true;
					for(int i = shipRow; i < shipRow+3; i++) {
						if(compBoard[i][shipCol] != '~') {
							t = false;
							valid = false;
						}
					}
					while(t == true) {
						for(int i = shipRow; i < shipRow+3; i++) {
							compBoard[i][shipCol] = 'S';
						}
						t = false;
						valid = true;
					}
				}
			}
			else if(orient == 0) {
				int shipRow = (int) (Math.random() * 10);
				if(shipRow > 0) shipRow--;
				int shipCol = (int) (Math.random() * 10);
				if(shipCol > 0) shipCol--;
				
				if(shipCol > 7) {
					valid = false;
				}
				else {
					boolean t = true;
					for(int i = shipCol; i < shipCol+3; i++) {
						if(compBoard[shipRow][i] != '~') {
							t = false;
							valid = false;
						}
					}
					while(t == true) {
						for(int i = shipCol; i < shipCol+3; i++) {
							compBoard[shipRow][i] = 'S';
						}
						t = false;
						valid = true;
					}
				}
			}
		}
		
		System.out.println("Computer Placing Ships: 60% done");
		valid = false; //Set up Destroyer
		while(valid == false) {
			
			int orient = (int) (Math.random() * 1.99);
			if((orient != 1) && (orient !=0)) {
				valid = false;
			}
			else if(orient == 1) {
				int shipRow = (int) (Math.random() * 10);
				if(shipRow > 0) shipRow--;
				int shipCol = (int) (Math.random() * 10);
				if(shipCol > 0) shipCol--;
				
				if(shipRow > 7) {
					valid = false;
				}
				else {
					boolean t = true;
					for(int i = shipRow; i < shipRow+3; i++) {
						if(compBoard[i][shipCol] != '~') {
							t = false;
							valid = false;
						}
					}
					while(t == true) {
						for(int i = shipRow; i < shipRow+3; i++) {
							compBoard[i][shipCol] = 'D';
						}
						t = false;
						valid = true;
					}
				}
			}
			else if(orient == 0) {
				int shipRow = (int) (Math.random() * 10);
				if(shipRow > 0) shipRow--;
				int shipCol = (int) (Math.random() * 10);
				if(shipCol > 0) shipCol--;
				
				if(shipCol > 7) {
					valid = false;
				}
				else {
					boolean t = true;
					for(int i = shipCol; i < shipCol+3; i++) {
						if(compBoard[shipRow][i] != '~') {
							t = false;
							valid = false;
						}
					}
					while(t == true) {
						for(int i = shipCol; i < shipCol+3; i++) {
							compBoard[shipRow][i] = 'D';
						}
						t = false;
						valid = true;
					}
				}
			}
		}
		
		System.out.println("Computer Placing Ships: 80% done");
		valid = false; //Set up Patrol Boat
		while(valid == false) {
			int orient = (int) (Math.random() * 1.99);
			if((orient != 1) && (orient !=0)) {
				valid = false;
			}
			else if(orient == 1) {
				int shipRow = (int) (Math.random() * 10);
				if(shipRow > 0) shipRow--;
				int shipCol = (int) (Math.random() * 10);
				if(shipCol > 0) shipCol--;
				
				if(shipRow > 8) {
					valid = false;
				}
				else {
					boolean t = true;
					for(int i = shipRow; i < shipRow+2; i++) {
						if(compBoard[i][shipCol] != '~') {
							t = false;
							valid = false;
						}
					}
					while(t == true) {
						for(int i = shipRow; i < shipRow+2; i++) {
							compBoard[i][shipCol] = 'P';
						}
						t = false;
						valid = true;
					}
				}
			}
			else if(orient == 0) {
				int shipRow = (int) (Math.random() * 10);
				if(shipRow > 0) shipRow--;
				int shipCol = (int) (Math.random() * 10);
				if(shipCol > 0) shipCol--;
				
				if(shipCol > 8) {
					valid = false;
				}
				else {
					boolean t = true;
					for(int i = shipCol; i < shipCol+2; i++) {
						if(compBoard[shipRow][i] != '~') {
							t = false;
							valid = false;
						}
					}
					while(t == true) {
						for(int i = shipCol; i < shipCol+2; i++) {
							compBoard[shipRow][i] = 'P';
						}
						t = false;
						valid = true;
					}
				}
			}
		}
		System.out.println("Computer Placing Ships: 100% done");
		
		
		
		
		
		
		
		
		boolean gameOver = false;
		int turn = 1;
		int userWin = 0;
		int compWin = 0;

		
		while(gameOver == false) {
			
			if(turn == 0) { //computer turn
				
				System.out.println("COMPUTER's TURN");
				boolean invalid = true;
				while(invalid == true) {
					invalid = false;
					int attackRow = (int) (Math.random() * 10);
					int attackCol = (int) (Math.random() * 10);
				
					if((userShipBoard[attackRow][attackCol] == 'X') || (userShipBoard[attackRow][attackCol] =='O')) {     //INVALID ATTACK
						invalid = true;
					}
					
					else if(userShipBoard[attackRow][attackCol] == 'A') {       //Hit Aircraft Carrier
						userShipBoard[attackRow][attackCol] = 'X';
						System.out.println("Your Aircraft Carrier was hit!");
						boolean sunk = false;
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								if(compBoard[row][col] == 'A') { sunk = true;}
							}
						}
						if(sunk == false) {
							System.out.println("Your Aircraft Carrier was sunk!");
							compWin++; 
						}
					}
					
					else if(userShipBoard[attackRow][attackCol] == 'B') {       //Hit Battleship
						userShipBoard[attackRow][attackCol] = 'X';
						System.out.println("Your Battleship was hit!");
						boolean sunk = false;
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								if(compBoard[row][col] == 'B') { sunk = true;}
							}
						}
						if(sunk == false) {
							System.out.println("Your Battleship was sunk!");
							compWin++; 
						}
					}
					
					else if(userShipBoard[attackRow][attackCol] == 'A') {       //Hit Submarine 
						userShipBoard[attackRow][attackCol] = 'S';
						System.out.println("Your Submarine was hit!");
						boolean sunk = false;
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								if(compBoard[row][col] == 'S') { sunk = true;}
							}
						}
						if(sunk == false) {
							System.out.println("Your Submarine was sunk!");
							compWin++; 
						}
					}
					
					else if(userShipBoard[attackRow][attackCol] == 'D') {       //Hit Destroyer
						userShipBoard[attackRow][attackCol] = 'X';
						System.out.println("Your Destroyer was hit!");
						boolean sunk = false;
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								if(compBoard[row][col] == 'D') { sunk = true;}
							}
						}
						if(sunk == false) {
							System.out.println("Your Destroyer was sunk!");
							compWin++; 
						}
					}
					
					else if(userShipBoard[attackRow][attackCol] == 'P') {       //Hit Patrol Boat
						userShipBoard[attackRow][attackCol] = 'X';
						System.out.println("Your Patrol Boat was hit!");
						boolean sunk = false;
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								if(compBoard[row][col] == 'P') { sunk = true;}
							}
						}
						if(sunk == false) {
							System.out.println("Your Patrol Boat was sunk!");
							compWin++; 
						}
					}
					
					else {
						System.out.println("The computer missed!");
						userShipBoard[attackRow][attackCol] = 'O';
					}
				}
				System.out.println("YOUR BOARD");
				for(int row=0; row<10; row++) {
					for(int col=0; col<10; col++) {
						System.out.print(userShipBoard[row][col] + " ");
					}
					System.out.println("");
			}

				turn = 1;
				if(compWin == 5) {
					System.out.println("YOU LOSE");
					gameOver = true;
					break;
				}
			}
				
			
			else if(turn == 1){ //user turn
				System.out.println("TAGRGET FIELD");
				for(int row=0; row<10; row++) {
					for(int col=0; col<10; col++) {
						System.out.print(userAttackBoard[row][col] + " ");
					}
					System.out.println("");
				}
				
				boolean invalid = true;
				while(invalid == true) {
					invalid = false;
					
					//ASK USER FOR ATTACK COORDINATES
					System.out.println("What row would you like to attack? (1 - 10)");
					int attackRow = sc.nextInt();
					attackRow--;
					System.out.println("What collumn would you like to attack? (1 - 10)");
					int attackCol = sc.nextInt(); 
					attackCol--;
					
					
					if(userAttackBoard[attackRow][attackCol] != '~') {      //INVALID ATTACK
						System.out.println("Invalid Location");
						invalid = true;
					}
					
					else if(compBoard[attackRow][attackCol] == 'A') {       //Hit Aircraft Carrier
						userAttackBoard[attackRow][attackCol] = 'X';
						compBoard[attackRow][attackCol] = 'X';
						System.out.println("Hit!");
						boolean sunk = false;
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								if(compBoard[row][col] == 'A') { sunk = true;}
							}
						}
						if(sunk == false) {
							System.out.println("You sunk my Aircraft Carrier!");
							userWin++;
						}
					}
					
					else if(compBoard[attackRow][attackCol] == 'B') {       //Hit Battleship
						userAttackBoard[attackRow][attackCol] = 'X';
						compBoard[attackRow][attackCol] = 'X';
						System.out.println("Hit!");
						boolean sunk = false;
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								if(compBoard[row][col] == 'B') { sunk = true;}
							}
						}
						if(sunk == false) {
							System.out.println("You sunk my Battleship!");
							userWin++;
						}
					}
					
					else if(compBoard[attackRow][attackCol] == 'S') {       //Hit Submarine
						userAttackBoard[attackRow][attackCol] = 'X';
						compBoard[attackRow][attackCol] = 'X';
						System.out.println("Hit!");
						boolean sunk = false;
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								if(compBoard[row][col] == 'S') { sunk = true;}
							}
						}
						if(sunk == false) {
							System.out.println("You sunk my Submarine!");
							userWin++;
						}
					}
					
					else if(compBoard[attackRow][attackCol] == 'D') {       //Hit Destroyer
						userAttackBoard[attackRow][attackCol] = 'X';
						compBoard[attackRow][attackCol] = 'X';
						System.out.println("Hit!");
						boolean sunk = false;
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								if(compBoard[row][col] == 'D') { sunk = true;}
							}
						}
						if(sunk == false) {
							System.out.println("You sunk my Destroyer!");
							userWin++;
						}
					}
					
					else if(compBoard[attackRow][attackCol] == 'P') {       //Hit Patrol Boat
						userAttackBoard[attackRow][attackCol] = 'X';
						compBoard[attackRow][attackCol] = 'X';
						System.out.println("Hit!");
						boolean sunk = false;
						for(int row=0; row<10; row++) {
							for(int col=0; col<10; col++) {
								if(compBoard[row][col] == 'P') { sunk = true;}
							}
						}
						if(sunk == false) {
							System.out.println("You sunk my Patrol Boat!");
							userWin++;
						}
					}
					
					else {
						System.out.println("You missed.");
						userAttackBoard[attackRow][attackCol] = 'O';
					}
					
					System.out.println("TAGRGET FIELD");
					for(int row=0; row<10; row++) {
						for(int col=0; col<10; col++) {
							System.out.print(userAttackBoard[row][col] + " ");
						}
						System.out.println("");
					}
				}	
			
				
				turn = 0;
				if(userWin == 5) {
					System.out.println("YOU WIN");
					gameOver = true;
					break;
				}
				// sc.close();
			}

		}
	
	}
}