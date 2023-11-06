//WAP to display different "Thought of the Day" each day of the year. The program should pick a random thought from an array of messages you provide
//and display it with current date

import java.util.*;
class Quotes
{
	public static void main(String[] args)
	{
		Date d1 = new Date();
		Random rand = new Random();
		String quotes[] =
			{
				"Life is 10% what happens to you and 90% how you react to it.",
				"Change your thoughts, and you change your world.",
				"All our dreams can come true if we have the courage to pursue them.",
				"Success is a journey not a destination.",
				"What you get by achieving your goals is not as important as what you become by achieving your goals.",
				"It always seems impossible until it's done.",
				"Success is liking yourself, liking what you do, and liking how you do it.",
				"Aim for the moon. If you miss, you may hit a star.",
				"If you cannot do great things, do small things in a great way.",
				"Success only comes to those who dare to attempt.",
				"I never dreamed about success. I worked for it.",
				"If opportunity doesn't knock, build a door."
			};		
		System.out.println("Today's date: " + d1 + "\nThought of the day: " + quotes[rand.nextInt(quotes.length)]);
	}
}
