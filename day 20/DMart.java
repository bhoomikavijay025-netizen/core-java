class DMart {

    public static int getPrice(String name, int size) {

  if (name.equals("Rice") && size == 1) {
     return 50;
 } else if (name.equals("Rice") && size == 2) {
     return 100;

  } else if (name.equals("Oil") && size == 1) {
    return 120;
   } else if (name.equals("Oil") && size == 3) {
   return 360;

   } else if (name.equals("Sugar") && size == 1) {
  return 45;
    } else if (name.equals("Sugar") && size == 2) {
    return 90;
  } else if (name.equals("Sugar") && size == 3) {
    return 135;
 } else {
     return 0;
    }
 }
  }