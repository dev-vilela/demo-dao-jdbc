package application;

import model.entities.Department;
import model.entities.Seller;
import model_dao.DaoFactory;
import model_dao.SellerDao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);

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

        System.out.println("\n=== TESTE 4: seller insert =====");
        Seller newSeller = new Seller(null, "Paulo", "paulo@gmail.com", new Date(), 5600.0, department);
        sellerDao.insert(newSeller);

        System.out.println("Inserido com sucesso! Novo ID: " + newSeller.getId());

        System.out.println("\n=== TESTE 5: seller update =====");
        seller = sellerDao.findById(1);
        seller.setName("Paulo Vilela");
        seller.setEmail("paulovilela@gmail.com");
        sellerDao.update(seller);

        System.out.println("Atualizado com sucesso!  ");

        System.out.println("\n=== TESTE 6: seller delete =====");
        System.out.print("informe um ID para deletar: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);

        System.out.println("Deletado com sucesso!  ");

        sc.close();
    }

}
