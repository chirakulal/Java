class ChatRunner{
	public static void main(String[] args){
		String name ="Whatsapp";
		int list = 20;
		String emoji = "smiling";
		
		Chat chat1 = new Chat(name,list,emoji);
		System.out.println("the chat name is "+chat1.name);
		System.out.println("the no of friends list "+chat1.list);
		System.out.println("the emoji selected is "+chat1.emoji);
		
		String name2 = "instagram";
		int list2 = 500;
		String emoji2 = "crying";
		
		Chat chat2 = new Chat(name2,list2,emoji2);
		System.out.println("the chat name is "+chat2.name);
		System.out.println("the no of friends list "+chat2.list);
		System.out.println("the emoji selected is "+chat2.emoji);
		
		String name3 = "thread";
		int list3=300;
		String emoji3 = "laughing";
		
		Chat chat3 = new Chat(name3,list3,emoji3);
		System.out.println("the chat name is "+chat3.name);
		System.out.println("the no of friends list "+chat3.list);
		System.out.println("the emoji selected is "+chat3.emoji);
		
		String name4 = "meta";
		int list4=120;
		String emoji4 = "smiling";
		
		Chat chat4 = new Chat(name4,list4,emoji4);
		System.out.println("the chat name is "+chat4.name);
		System.out.println("the no of friends list "+chat4.list);
		System.out.println("the emoji selected is "+chat4.emoji);
		
		String name5 = "X";
		int list5 = 200;
		String emoji5  = "gost";
		
		Chat chat5 = new Chat(name5,list5,emoji5);
		System.out.println("the chat name is "+chat5.name);
		System.out.println("the no of friends list "+chat5.list);
		System.out.println("the emoji selected is "+chat5.emoji);
		
		
	}
}