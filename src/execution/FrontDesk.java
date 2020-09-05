/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_A_BOOK = 2;
    private static final int SHOW_MY_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        int studentChoice;
        Library library = new Library();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            final Scanner scanner = new Scanner(System.in);
            studentChoice = scanner.nextInt();
            scanner.nextLine(); // eat the extra \n from the buffer.
            System.out.println("Please enter your first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Please enter your middle name, leave blank if none, just press Enter: ");
            String middleName = scanner.nextLine();
            System.out.println("Please enter your last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Please enter your university roll number: ");
            long universityRollNumber = scanner.nextLong();
            Student currentStudent = new Student(firstName, middleName, lastName, universityRollNumber);
            switch (studentChoice) {
                case ISSUE_NEW_BOOK:
                    System.out.println("Enter the isbn number of the book you want to issue: ");
                    long isbn = scanner.nextLong();
                    break;
                case RETURN_A_BOOK:
                    break;
                case SHOW_MY_ISSUED_BOOKS:
                    break;
                default:
                    break;
            }
        } while (studentChoice != EXIT);
    }
}
