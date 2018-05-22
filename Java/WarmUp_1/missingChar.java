public String missingChar(String str, int n) {
 String beginning = str.substring(0,n);
 String end = str.substring(n+1, str.length());
 return beginning + end;
}
