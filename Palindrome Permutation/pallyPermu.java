public static boolean pallyPermu (String word){
  char[] wordCharred = word.toLowerCase().toCharArray();
  Hashtable<Character, Integer> counting = new Hashtable<Character, Integer>();
  for (int i = 0; i < wordCharred.length; i++) {
    if(wordCharred[i] == " ".toCharArray()[0]){
    } else if(!counting.containsKey(wordCharred[i])){
      counting.put(wordCharred[i], 1);
    } else {
      counting.put(wordCharred[i], counting.get(wordCharred[i])+1);
    }
  }
  Enumeration<Character> y = counting.keys();
  int onlyOnce = 0;
  while(y.hasMoreElements()){
    char j = y.nextElement();
    System.out.println(j + " " + counting.get(j));
    if(counting.get(j)%2==1)
      if(onlyOnce==0)
        onlyOnce++;
      else
        return false;
  }	
  return true;
}
