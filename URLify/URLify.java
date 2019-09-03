public static String URLify(String ogWord){
  char[] ogWordArray = ogWord.toCharArray();
  String x = "";
  for (char y: ogWordArray){
    if(Character.toString(y).equals(" ")){
      x+="%20";
    }
    else{
      x+=y;
    }
  }
  return x;
}
