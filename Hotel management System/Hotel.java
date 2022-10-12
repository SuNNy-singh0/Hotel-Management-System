import java.util.Scanner;

	class Hotel   {
		public static void main(String[] args) {
	        System.out.println("welcome to taj hotel \n hope you wil delicous food");
	        System.out.println("press 1 for veg  \n press2 for non veg ");
	        Scanner s = new Scanner(System.in);
	        int k = s.nextInt();
	        if(k==1){
	            System.out.println("Enter 1 for snacks \n enter 2 for main course");
	            int choice1 = s.nextInt();
	            if(choice1==1){
	                System.out.println(" 1 for dosa  \n  2 bread Pakora -  " +
	                        " \n 3.  3 chai samosa  -  \n  4 cheese sandwich  ");
	                int veg = s.nextInt();
	              switch(veg){
	                  case 1:
	                      System.out.println("thank for order dosa your bill is "+135);
	                  break;
	                  case 2:
	                      System.out.println("thank for order bread Pakora your bill is "+35);
	                      break;
	                  case 3:
	                      System.out.println("thank for order chai samosa your bill is "+65);
	                      break;
	                  case 4:
	                      System.out.println("thank for order cheese sandwich your bill is "+95);
	                      break;
	                }
	            }
	            else if(choice1==2){
	                System.out.println(" 1 for deluxe thali  \n  2 chaap with roti -  " +
	                        " \n 3.  3 biryani  -  \n  4 panner with roti  ");
	                int veg2 = s.nextInt();
	                switch(veg2){
	                    case 1:
	                        System.out.println("thank for order deluxe thali your bill is "+450);
	                        break;
	                    case 2:
	                        System.out.println("thank for order chaap with roti your bill is "+180);
	                        break;
	                    case 3:
	                        System.out.println("thank for order biryani your bill is "+200);
	                        break;
	                    case 4:
	                        System.out.println("thank for order panner with roti your bill is "+250);
	                        break;
	                }

	            }

	        }
	        else if(k==2){
	            System.out.println("Enter 1 for snacks \n enter 2 for main course");
	            int choice1 = s.nextInt();
	            if(choice1==1){
	                System.out.println(" 1 for chicken chili  \n  2 chicken chili -  " +
	                        " \n 3.  3 fish fry   -  \n  4 chicken pakora  ");
	                int nonveg = s.nextInt();
	                switch(nonveg){
	                    case 1:
	                        System.out.println("thank for order chicken chili your bill is "+135);
	                        break;
	                    case 2:
	                        System.out.println("thank for order chicken chiliy our bill is "+90);
	                        break;
	                    case 3:
	                        System.out.println("thank for order fish fry your bill is "+165);
	                        break;
	                    case 4:
	                        System.out.println("thank for order chicken pakora your bill is "+95);
	                        break;
	                }
	            }
	            else if(choice1==2){
	                System.out.println(" 1 for chicken curry with roti  \n  2 mutton with roti -  " +
	                        " \n 3.  3 chicken biryani  -  \n  4 fish with roti  ");
	                int nonveg2 = s.nextInt();
	                switch(nonveg2){
	                    case 1:
	                        System.out.println("thank for order chicken curry your bill is "+190);
	                        break;
	                    case 2:
	                        System.out.println("thank for order mutton with roti your bill is "+180);
	                        break;
	                    case 3:
	                        System.out.println("thank for order chicken biryani your bill is "+200);
	                        break;
	                    case 4:
	                        System.out.println("thank for order fish with roti your bill is "+350);
	                        break;
	                }

	            }
	        }
	      s.close();
	    }
	}
