public boolean stringE(String str) {
  int count = 0;
  for(char letter : str.toCharArray()){
  if(letter == 'e'|| letter == 'E'){
  count++;
  }
  }
  return count>=1 && count <=3;
}
