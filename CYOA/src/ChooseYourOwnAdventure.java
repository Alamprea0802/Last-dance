import java.util.Scanner;

public class ChooseYourOwnAdventure {
	
	static Scanner in = new Scanner(System.in);
	
	
	public static void main (String[]args) {
		System.out.println("Hello there, welcome to your adventure. WOuld you like to start in...");
		System.out.println("1. a city");
		System.out.println("2. a small rural town");
		int cho = in.nextInt();
		int a = 1;
		int b = 2;
		
	if (cho == a) {
		System.out.println("you wake up as you do every day. With a cup of coffee and a scone.");
		System.out.println("You've lived here since you were but a child, and know all the best places to hang out");
		System.out.println("All of a sudden your phone rings. Its from your boss. She says that due to some unforseen dificulties, you have the day off!");
		System.out.println("You dont buy her corporate bull. She is probably just feeling lazy today and decided no one had to work. but nontheless you start thinking of where you will spend your day...");
		System.out.println("3. surf the web");
		System.out.println("4. go for a walk ");
		int cho2 = in.nextInt();
			if (cho2 == 3) {
		System.out.println("You go to turn on your computer, but suddenly realize that...");
		System.out.println("The plug is loose. You decide to be a daredevil and try to use a fork to put it back in the outlet.");
		System.out.println("You die (obviously). I mean come on, that was just stupid.");
		System.out.println("Thank you for playing, restart to try again");
			}
			else if (cho2 == 4) {
			System.out.println("You go on a walk and decide to go through a back alley. You notice someone being mugged. what do you do?");
			System.out.println("5. go towards them and save him.");
			System.out.println("6. leave them alone. youre not a hero and you never will be.");
			int cho3 = in.nextInt();
				if (cho3 == 5) {
				System.out.println("You go try and be a good person and...");
				System.out.println("are stabbed. What did you expect? You die within minutes");
				System.out.println("ABSOLUTE FAILURE. what a shame, you were doing so well too. restart to try again");
				}
					else if (cho3 == 6) {
					System.out.println("You go on with your walk and all of a sudden...");
					System.out.println("You hear police sirens all around you");
					System.out.println("It turns out what you thought were petty thieves were actually gang bossess. there is a shootout, and you run to the police when...");
					System.out.println("'hes one of them. He just let them beat me up' the man who was on the ground says. He testifies against you and you are charges with jailtime for aiding and abetting a criminal");
					System.out.println("Well at least youre still alive. restart to try again if you want.");

					
					}
					else {
						System.out.println("oh you think your funny do you? RESTART THE CODE AND CHOOSE A VALID ANSER YOU LITTLE S-");
					}
		}
			else {
				System.out.println("oh you think your funny do you? RESTART THE CODE AND CHOOSE A VALID ANSER YOU LITTLE S-");
			}
	}
		
	else if (cho == b) {
		System.out.println("The sun is setting over the city in the distance. You know that everyone ther probably has an easy life.");
		System.out.println("But you prefer a simple life. Even if it means working until dusk. You start to make your way down the worn dirt road, when you notice something");
		System.out.println("A beggar on the side of the road! they are not uncommon but what is one doing in the middle of nowhere?...");	
		System.out.println("3. mind your own buisness");
		System.out.println("4. approach him");
		int cho3 = in.nextInt();
			if (cho3 == 3) {
			System.out.println("You begin to walk away when...");
			System.out.println("the son of a b**** stabs you in the back! Then again, you understand why he did it");
			System.out.println("FATALITY. restart to try again i guess. you'll only find pain in misery. This computer program can sometimes be a...   you know.");
			}
			else if (cho3 == 4) {
				System.out.println("You walk towards him and lend a little change. the man replies...");
				System.out.println("'Thankyou stranger. Ive been needi'n a meal for quite a bit'");
				System.out.println("You say your farewells to the man who has a surprisingly thick southern accent, and make your way home");	
				System.out.println("Once you walk through the door, you know something is wrong. it is then when you see the mobsters. some idiot gang leaders just got arrested mugging a poor fellow, so their gangs are hiding out here of all places");
				System.out.println("4. ask them to leave");
				System.out.println("5. ask to join up with them. The country life just isnt enough for you anymore");
				int cho4 = in.nextInt();
					if (cho4 == 4) {
					System.out.println("You ask them to leave.");
					System.out.println("...");
					System.out.println("...");
					System.out.println("...");
					System.out.println("...");
					System.out.println("...");
					System.out.println("...");
					System.out.println("...");
					System.out.println("...");
					System.out.println("...");
					System.out.println("...");
					System.out.println("HOW ARE YOU THIS DUMB. THEY LAUGH AND SHOOT YOU. WHY WOULD YOU CHALLNGE HARDENED CRIMINALS?!?!?!?!?!?");
					System.out.println("I would say start again but at this point im not even sure you would survive through that in real life");
					}
					else if (cho3 == 5) {
						System.out.println("You talk to the group and make your case as to why you should join...");
						System.out.println("They agree, this is your house after all.");
						System.out.println("You spend the next 40 years in the gang, eventually rising to the leader's right hand man.");	
						System.out.println("Eventually you die of old age");
						System.out.println("for the record this is the 'good' ending. thank you for playing the game. It was a lot of fun to create!!");
					}
	
	
	
	
	
	
		}

	
	}
		
	else {
		System.out.println("oh you think your funny do you? RESTART THE CODE AND CHOOSE A VALID ANSER YOU LITTLE S-");
	}
		
		
	}

}
