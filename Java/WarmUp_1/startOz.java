public String startOz(String str) {
  String output = "";
  if(str.length() >= 1 && str.charAt(0) == 'o'){
    output += "o";
  }
  if(str.length() > 1 && str.charAt(1) == 'z'){
    output += "z";
  }
  return output;
}
