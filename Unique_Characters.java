public static boolean uniqueChars(String word) {
	char[] characters = word.toCharArray();
	ArrayList<Character> newList = new ArrayList<Character>();
	for(char x: characters){
		if(newList.contains(x))
			return false;
		else {
			newList.add(x);
		}
	}
	return true;
}
