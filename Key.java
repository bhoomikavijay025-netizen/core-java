class Key {

  static int getLength() {
  int length = 5;
   System.out.println(length);
    return length;
 }
  static void showType(String type){
   System.out.println(type);
   int l = getLength();
    System.out.println(l);
 }
  static void useKey(){
   System.out.println("Key used");
    showType("Metal");
 }
}