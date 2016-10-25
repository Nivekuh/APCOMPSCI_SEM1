import java.util.Scanner;

public class Ex_05{
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args){
		//Define branches here. Add branches in order to tree.
		
		String[] br00op00 = {
			"Vistaru, Lord of the Mountain, is attacking small towns surrounded by his kingdom in hopes of expanding his army before his assault on the capital\nYou live in one such town, and one morning, see his forces emerging from the forest.",
			"What do you do?\n\t1. Surrender, and join his unstoppable forces.\n\t2. Alert the other townspeople.",
			"0100",
			"0101"
		};
		
		String[] br01op00 = {
			"You join, but unfortunately, during the routine physical fitness test, you roll a 3 for str. You end up as a medic. One day on the battlefield, a man with a sword wound comes to you.",
			"What do you do?\n\t1. Help him.\n\t2. Leave him to die after stealing all his gold and clothes.",
			"0200",
			"0201"
		};
		String[] br01op01 = {
			"The army comes, and despite the townspeople's best efforts, the town is captured, and you are taken prisoner and tortured.",
			"What do you do?\n\t1. Attempt to escape.\n\t2. Live the rest of your life without paying taxes or paying for food.",
			"0202",
			"0203"
		};
		
		String[] br02op00 = {
			"You forget to clean off his blood and get AIDS. The army honorably discharges you.",
			"What do you do?\n\t1. Try to find emplyoment in the capital.\n\t2. Become vengeful and warn another town which you know will be attacked of the coming army.",
			"0300",
			"0101"
		};
		String[] br02op01 = {
			"You steal his gold and clothes, but are seen when your commander walks in. You hurry and try to put on your clothes, but to your surprise, he isn't angry at all. Turns out he's gay and finds you strangely attractive. Thank God for the 20 luk you rolled.",
			"What do you do?\n\t1. Hook up.\n\t2. Push away his advances.",
			"0301",
			"0302"
		};
		String[] br02op02 = {
			"You're glad you managed to roll a 15 on luk this time, and you manage to escape. Unfortunately, on your way out of the base, you cut your hand on an old rusty nail. You think you might have tetanus.",
			"What do you do?\n\t1. Head back to the base to seek medical aid.\n\t2. Head to a nearby abandoned village to scavenge for medical supplies.",
			"0303",
			"0304"
		};
		String[] br02op03 = {
			"After being a prisoner for months, they army runs short on warriors and drafts you. You become a chef.",
			"What do you do?\n\t1. Attempt to poison their food.\n\t2. Become a Michelin-starred Chef.",
			"0307",
			"0305"
		};
		
		String[] br03op00 = {
			"You live as a poor tailor, who happens to get super-AIDS from a prostitute. You're pretty screwed, m8.",
			"What do you do?\n\t1. Become motivated and work hard to live life to its fullest.\n\t2. Give everyone you know AIDS.",
			"0305",
			"0306"
		};
		String[] br03op01 = {
			"He has AIDS, and passes it on to you. You get discharged.",
			"What do you do?\n\t1. Try to find emplyoment in the capital.\n\t2. Become vengeful and warn another town which you know will be attacked of the coming army.",
			"0300",
			"0101"
		};
		String[] br03op02 = {
			"You get fired.",
			"What do you do?\n\t1. Try to find emplyoment in the capital.\n\t2. Become vengeful and warn another town which you know will be attacked of the coming army.",
			"0300",
			"0101"
		};
		String[] br03op03 = {
			"You head back to the army's base, and plead for mercy. They refuse and throw you in a cell, continuing to torture you.",
			"What do you do?\n\t1. Attempt to escape.\n\t2. Live the rest of your life (short) in prison.",
			"0202",
			"0203"
		};
		String[] br03op04 = {
			"You enter the village and find a desk full of herbs and other drugs. You take them all, in hopes of curing your illnesses. Unfortunately for you, one of the injection drugs you take gives you AIDS.\nYou head to the capital, and give all the people there AIDS. Everyone dies of HIV.",
			"",
			"break"
		};
		String[] br03op05 = {
			"You become incredibly wealthy, grabbing the attention of many suitors, eventually making enough money to move to the capital.",
			"What do you do?\n\t1. Live a life of wealth and luxury.\n\t2. Run for Senate.",
			"0400",
			"0401"
		};
		String[] br03op06 = {
			"Literally everyone in the capital dies of AIDS. The human race goes extinct. Thanks, asshole.",
			"",
			"break"
		};
		String[] br03op07 = {
			"You forgot which plate you poisoned, and accidentally eat out of the poisoned food. You die. Idiot.",
			"",
			"break"
		};
		
		String[] br04op00 = {
			"You hire tons of prostitutes, and they bear many children. You change your name to Ghengis Khan.\nYou, having nothing to do with your money, decide to invest it in cool things, and fight crime under the alias of 'Batman'. You eventually die of AIDS.",
			"",
			"break"
		};
		String[] br04op01 = {
			"You get the Senate seat, and get involved in a plot to overthrow the King. Unfortunately, the coup is discovered, and all of you are banished from the kingdom. Luckily, you get to keep your money.",
			"What do you do?\n\t1. Join the army.\n\t2. Retire.",
			"0100",
			"0400"
		};
		
		
		String[][][] tree = {
			{br00op00},
			{br01op00,br01op01},
			{br02op00,br02op01,br02op02,br02op03},
			{br03op00,br03op01,br03op02,br03op03,br03op04,br03op05,br03op06,br03op07},
			{br04op00,br04op01}
		};
		
		String out = "";
		int br = 0;
		int op = 0;
		
		while(out != "break"){
			out = branch(tree[br][op]);
			if(out.equals("break"))
				break;
			
			br = Integer.parseInt(out.substring(0,2));
			op = Integer.parseInt(out.substring(2));
		}
		
		System.out.println("The end.\nPress enter to replay.");
		
		kb.nextLine();
		kb.nextLine();
		main(args);
	}
	
	public static String branch(String[] branch){
		System.out.println(branch[0] + "\n" + branch[1]);
		int input = 2;
		
		if(!(branch[2].equals("break")))
			input = prompt(branch.length - 2);
		else
			return branch[2];
		
		return branch[input+1];
	}
	
	public static int prompt(int choices){
		String in = kb.next();
		
		if(in.matches("\\d+")){
			int input = Integer.parseInt(in);
			if(input <= choices && input > 0){
				return input;
			}
		}
		
		System.out.println("Please enter a valid choice");
		return prompt(choices);
	}
}