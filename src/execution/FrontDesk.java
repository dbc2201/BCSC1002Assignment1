/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import java.util.Scanner;

public class FrontDesk {

    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_A_BOOK = 2;
    private static final int SHOW_MY_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        int studentChoice;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            final Scanner scanner = new Scanner(System.in);
            studentChoice = scanner.nextInt();
        } while (studentChoice != 4);
    }
}
