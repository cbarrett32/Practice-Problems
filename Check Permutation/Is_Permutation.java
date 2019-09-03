	public static boolean isPermutation(String word1, String word2){
		char[] word1sorted = word1.toCharArray();
		Arrays.sort(word1sorted);
		char[] word2sorted = word2.toCharArray();
		Arrays.sort(word2sorted);
		if(Arrays.equals(word1sorted, word2sorted))
			return true;
		else {
			return false;
		}
	}
	
	public static boolean isPermutation2(String word1, String word2){
		String[] word1array = word1.split("");
		List<String> myList = new ArrayList<String>(Arrays.asList(word1array));
		String[] word2array = word2.split("");
		for(String x: word2array){
			if(myList.isEmpty()){
				return false;
			}
			if(!myList.contains(x))
				return false;
			else {
				myList.remove(x);
			}
		}
		if(myList.isEmpty())
			return true;
		else
			return false;
	}
