import java.util.Random;

public class Practice {


    public static void main(String[] args) {






    Document bankStatement = new Document();
    bankStatement.setText("A bank is a financial institution that accepts deposits from the public and creates a demand deposit while simultaneously making loans. Lending activities can be directly performed by the bank or indirectly through capital markets");
    Email sendToJohn = new Email();
    sendToJohn.setDocument(bankStatement);
    sendToJohn.setEmail("john@pnc.com");
    sendToJohn.setRecipient("otherJohn@nfc.edu");
    sendToJohn.setTitle("Urgent Matter");
    sendToJohn.setSender("Abe Lincoln");

    System.out.println(sendToJohn.toString());






//        Grid grid = new Grid();
//        int [][] numbers = {{1,2,3,4},{8,7,6,5},{1,3,5,7},{2,4,6,8}};
//        grid.setGrid(numbers);
//        System.out.println(grid.getOneNumber(2,0));
//
//        int [][] arrayA = {{1, 5}, {-4, 3}};
//        int [][] arrayB = { { 2, -1}, {4, -1}};
//        int [][] emptyArr = new int[2][2];
//
//        for(int i = 0; i<arrayA.length; i++)
//        {
//            for(int j = 0; j<arrayA.length; j++)
//
//            {
//                emptyArr[i][j] = arrayA[i][j] + arrayB[i][j] ;
//
//            }
//        }
//
//        for(int i = 0; i<arrayA.length; i++)
//        {
//            for(int j = 0; j<arrayA.length; j++)
//            {
//                System.out.print(emptyArr[i][j]);
//            }
//        }


    }
}
