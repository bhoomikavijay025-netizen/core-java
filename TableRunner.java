class TableRunner{

    public static void main(String[] args) {

  Table table1 = new Table();

  table1.brandName = "Nilkamal";
 table1.material = "Wood";
  table1.height = 3.5f;
 table1.price = 4500.75;
 table1.size = 'L';
 table1.tableId = 201;
 table1.isAvailable = true;
		
   Table table2 = new Table();
 table2.brandName = "Godrej";
 table2.material = "Steel";
 table2.height = 3.0f;
  table2.price = 3800.50;
  table2.size = 'M';
 table2.tableId = 202;
 table2.isAvailable = false;
     
  Table table3 = new Table();
  table3.brandName = "Ikea";
  table3.material = "Plastic";
  table3.height = 2.8f;
  table3.price = 2500.99;
  table3.size = 'S';
  table3.tableId = 203;
  table3.isAvailable = true;
		
	Table table4 = new Table();
    table4.brandName = "Durian";
    table4.material = "Glass";
    table4.height = 3.2f;
    table4.price = 5200.00;
    table4.size = 'L';
    table4.tableId = 204;
    table4.isAvailable = false;

    System.out.println("***** Printing Table Details *****");

  System.out.println("Table1 Brand: " + table1.brandName);
  System.out.println("Table1 Material: " + table1.material);
  System.out.println("Table1 Height: " + table1.height);
  System.out.println("Table1 Price: " + table1.price);
  System.out.println("Table1 Size: " + table1.size);
 System.out.println("Table1 ID: " + table1.tableId);
 System.out.println("Table1 Available: " + table1.isAvailable);

   System.out.println("***** Printing Table Details *****");

  System.out.println("Table2 Brand: " + table2.brandName);
 System.out.println("Table2 Material: " + table2.material);
 System.out.println("Table2 Height: " + table2.height);
   System.out.println("Table2 Price: " + table2.price);
   System.out.println("Table2 Size: " + table2.size);
  System.out.println("Table2 ID: " + table2.tableId);
 System.out.println("Table2 Available: " + table2.isAvailable);

   System.out.println("***** Printing Table Details *****");

 System.out.println("Table3 Brand: " + table3.brandName);
  System.out.println("Table3 Material: " + table3.material);
  System.out.println("Table3 Height: " + table3.height);
  System.out.println("Table3 Price: " + table3.price);
  System.out.println("Table3 Size: " + table3.size);
 System.out.println("Table3 ID: " + table3.tableId);
 System.out.println("Table3 Available: " + table3.isAvailable);

  System.out.println("***** Printing Table Details *****");
  System.out.println("Table4 Brand: " + table4.brandName);
  System.out.println("Table4 Material: " + table4.material);
 System.out.println("Table4 Height: " + table4.height);
  System.out.println("Table4 Price: " + table4.price);
 System.out.println("Table4 Size: " + table4.size);
   System.out.println("Table4 ID: " + table4.tableId);
System.out.println("Table4 Available: " + table4.isAvailable);
    }
}