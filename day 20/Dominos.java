class Dominos{

    public static int getPrice(String name, int size) {

  if (name.equals("Veg Pizza") && size == 1) {
    return 100;
  } else if (name.equals("Veg Pizza") && size == 2){
  return 200;

  } else if (name.equals("Chicken Pizza") && size == 1){
  return 150;
    } else if (name.equals("Chicken Pizza") && size == 2){
   return 300;

   } else if (name.equals("Cheese Burst") && size == 1){
 return 180;

 } else if (name.equals("Cheese Burst") && size == 2){
     return 360;
    } else {
    return 0;
   }
 }
}