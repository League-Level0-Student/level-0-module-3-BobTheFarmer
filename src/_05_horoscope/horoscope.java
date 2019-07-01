package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	String starSign = JOptionPane.showInputDialog(null, "What is your star sign?");
	if(starSign.equalsIgnoreCase("Aries")) {
	JOptionPane.showMessageDialog(null, "Be careful you dont upset your own balance today while you are helping others regain theirs\n" + 
			"\n" + 
			"You are naturally caring and want to help others and today youll feel the need to do this in big measures. This will use a lot of your energy so be careful you dont go too far with this. While you are helping others regain their balance you could be upsetting your own. Find the right distribution of weight between the two and dont help others at your own expense.");
}
	else if(starSign.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "If you accept that your future is different to your past you can move forward with the changes.\n" + 
				"Understand that your future is going to be very different from your past and you will need to make adjustments and changes to move forward with your own future. Dont get stuck in your past with past issues, things are always evolving and changing and the trick is to keep up or even better, keep one step ahead. Embrace this.");
	}
	else if(starSign.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "As The Moon leaves your house today follow your heart and your passions, you have strong instincts.\n" + 
				"\n" + 
				"The Moon leaves Gemini today and as it does it will set fire to your passions. This could mean you have a sudden thirst for new knowledge or you feel a need to connect with new people or start planning a new project, but whatever it is let your heart lead you forward. Make your decisions based on your feelings, you have strong instincts right now.");
	}
	else if(starSign.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "As Mars leaves your house today changes in your work life will be unexpected and unusual.\n" + 
				"\n" + 
				"Mars leaves Cancer today and this will create some ripples in your work life. Things may alter for you or there could be new opportunities coming, but whatever is happening its something not expected and out of the ordinary. This might be because of your gender or work experience. This shouldnt put you off, its time to smash some stereo-types.");
	}
	else if(starSign.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "Share your ideas with someone you trust today to help you choose one idea from a bunch of them.\n" + 
				"\n" + 
				"You have lots of new ideas floating around in your head today, which is great, but for the task in hand right now you only need one, and it needs to be the right one. If youre having trouble choosing which idea to carry forward, share your thoughts with someone you trust and let them help you to unravel all this, youll soon see clearly.");
	}
	else if(starSign.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "When you feel the complexities of your life demanding today see this as fortunate instead and be positive.\n" + 
				"\n" + 
				"You might feel overwhelmed today by the complexities of having so much going on in your life. You can see things this way or you can choose a more positive point of view. Recognise how lucky you are to have choices and opportunities and instead of seeing this as demanding see it as fortunate. This will also help you find balance.");
	}
	else if(starSign.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Gain perspective on a new work situation today and see it as an opportunity and not a challenge.\n" + 
				"\n" + 
				"A new situation in your work life today will at first seem like something of a challenge to you. Gain a different perspective and youll be able to see this as an opportunity instead. Write down what is happening and what your options are as well as a list of pros and cons. Youll soon start to see the positives emerge. Make the most of this chance.");
	}
	else if(starSign.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Take a stand today against recent resistance to something you are doing, show them you wont be put off.\n" + 
				"\n" + 
				"Theres been some resistance to you or to something youve been trying to do lately and this has been frustrating for you. Dont let this get you down or slow you down, you arent responsible for what other people think. If you are happy with what you are doing take a stand on it and show those who disagree that you wont be put off.");
	}
	else if(starSign.equalsIgnoreCase("Sagittattarius")) {
		JOptionPane.showMessageDialog(null, "When lots of little things go wrong today it will be stressful so keep taking a break and gather your strength.\n" + 
				"\n" + 
				"Lots of little things are going to go wrong today, the details wont work out and small aspects of things you are trying to do wont do what you want them to do. This can be frustrating and these little things will build up to bring you stress. Make sure you keep taking a break, you need to recharge so you can keep facing the next issue.");
	}
	else if(starSign.equalsIgnoreCase("Capicorn")) {
		JOptionPane.showMessageDialog(null, "Those things youve been putting off demand your attention today, so get the chores out of the way.\n" + 
				"\n" + 
				"Youve been procrastinating and putting things off lately and today these things are going to turn up and demand you attend to them. You cant put things off forever and today you have to face the things you dont want to do. So, do your house chores and get through your paperwork, youll feel better once youve done it and youll have a clean slate again.");
	}
	else if(starSign.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Take a closer look at your budget and your spending today and if spending habits make you feel guilty, rein them in.\n" + 
				"\n" + 
				"Focus on your finances today and especially your spending. This is the right day to take a closer look at your budget, if you have one, and what your spending habits say about you. Try to look ahead when you want to spend spontaneously, if some of your spending makes you feel guilty later, far better to not do this in the first place.");
	}
	else if(starSign.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "As you use your imagination along with logic and planning today you have your clearest thinking yet.\n" + 
				"\n" + 
				"Today your imagination is working hand in hand with your logical and rational side, which means you can plan ahead with creativity. Use your daydreaming and reflect on your thoughts later to bring about your best and most clear thinking of moving forward. This can make you powerful right now as forces come together within you.");
	}
	
}
}
