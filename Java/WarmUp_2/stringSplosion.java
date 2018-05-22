public String stringSplosion(String str) {
  String result = "";
  for(int x = 0; x <= str.length(); x++){
    result += str.substring(0,x);
  }
  return result;
}
