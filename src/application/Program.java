package application;

import model.entities.Department;
import model.entities.Seller;
import model_dao.DaoFactory;
import model_dao.SellerDao;

import java.util.Date;
import java.util.List;

public class Program {
    public static  void main(String[] args){

        /*Department obj = new Department(1, "Developer");

        Seller seller = new Seller(21, "Paulo", "paulo@gmail.com",
                new Date(), 4500.0, obj);

         */

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1: seller findById =====");

        Seller seller = sellerDao.findById(3);

        //System.out.println(obj);
        System.out.println(seller);

        System.out.println();


        System.out.println("=== TESTE 2: seller findByDepartment =====");

        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3: seller findAll =====");

        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }


    }

}
