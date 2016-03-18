package controller;

/**
 *
 * @author Jurijs
 */
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        ProductCtrl p = new ProductCtrl();
        SupplierCtrl s = new SupplierCtrl();
        
//        s.createSupplier(1, "Star", "fake st", "7979898798");

        p.createProduct(1, "shoes", 23.99, "a1");
        p.createProduct(2, "hat", 23.99, "a5");

//        p.createScart_Prod(1);
//        p.createScart_Prod(2);
//        p.setEmployeeDepartment(1, "C01", 1);
//        p.setEmployeeDepartment(2, "C02", 1);
//        p.setEmployeeDepartment(3, "C03", 2);
//        p.setEmployeeDepartment(4, "C04", 2);
//        p.setEmployeeDepartment(5, "C05", 2);
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please press 1 to view each department & it's employees");
            System.out.println("Please press 2 to update an employee's salary");
            System.out.println("Please press 3 to delete an employee");
            System.out.println("Please press 4 to add a new employee");
            System.out.println("Please press 5 to update a department name");
            System.out.println("Please press 6 to delete a department");
            System.out.println("Please press 7 to view cubicles for each department");
            System.out.println("Press 8 to quit");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(p.findAllProducts());
                    break;
                case 2:
                    System.out.println("please enter the id of the product whose quantity you wish to update");
                    int id = in.nextInt();
                    in.nextLine();
                    System.out.println("Please enter the new quantity for product " + id);
                    int newQty = in.nextInt();
                    p.updateQty(id, newQty);
                    break;
//                case 3:
//                    System.out.println("please enter the id of the employee you wish to delete");
//                    int idDelete = in.nextInt();
//                    p.removeEmployee(idDelete);
//                    break;
//                case 4:
//                    System.out.println("please enter the ID of the employee you wish to add");
//                    int idNew = in.nextInt();
//                    in.nextLine();
//                    System.out.println("please enter the name of the employee you wish to add");
//                    String name = in.nextLine();
//                    System.out.println("please enter the salary of the employee you wish to add");
//                    double salaryNew = in.nextDouble();
//                    System.out.println("please enter the dep ID of the employee you wish to add");
//                    int depId = in.nextInt();
//                    in.nextLine();
//                    System.out.println("please enter the cubicle ID of the employee you wish to add");
//                    String cubId = in.nextLine();
//                    p.createEmployee(idNew, name, salaryNew);
//                    p.setEmployeeDepartment(idNew, cubId, depId);
//                    break;
//
//                case 5:
//                    System.out.println("please enter the id of the department whose name you wish to update");
//                    int dep = in.nextInt();
//                    in.nextLine();
//                    System.out.println("Please enter the new name for department " + dep);
//                    String newName = in.nextLine();
//                    p.updateDepName(dep, newName);
//                    break;
//
//                case 6:
//                    System.out.println("please enter the id of the department you wish to delete");
//                    int depDel = in.nextInt();
//                    p.removeDepartment(depDel);
//                    break;
//                case 7:
//                    p.findCubicleEmpList();
//                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option entered");
                    break;

            }

        }
    }
}
