package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department insert ===");

        Department newDepartment = new Department(null, "Domestic");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("=== TEST 2: department update ===");
        Department department = departmentDao.findById(5);
        department.setName("Kitchen");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("=== TEST 3: department delete ===");
        departmentDao.deleteById(5);
        System.out.println("Deleted with success!");

        System.out.println("=== TEST 4: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

//        System.out.println(seller);
//
//        System.out.println("=== TEST 2: seller findByDepartment ===");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for(Seller obj : list) {
//            System.out.println(obj);
//        }
//
//        System.out.println("=== TEST 3: seller findAll ===");
//        list = sellerDao.findAll();
//        for(Seller obj : list) {
//            System.out.println(obj);
//        }

//        System.out.println("=== TEST 4: seller insert ===");
//        Seller newSeller = new Seller(null, "Diego", "diego@gmail.com", new Date(), 3000.00, department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted! New id = " + newSeller.getId());

//        System.out.println("=== TEST 5: seller update ===");
//        seller = sellerDao.findById(1);
//        seller.setName("Bruce Wayne");
//        seller.setBirthDate(seller.getBirthDate());
//        sellerDao.update(seller);
//        System.out.println("Update completed!");

//        System.out.println("=== TEST 5: seller delete ===");
//        System.out.println("Enter id for delete test: ");
//        int id = input.nextInt();
//        sellerDao.deleteById(id);
//        System.out.println("Deletion completed!");
//        input.close();

    }
}