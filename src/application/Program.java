package application;

import model.entities.Department;
import model.entities.Seller;
import model_dao.DaoFactory;
import model_dao.SellerDao;

import java.util.Date;

public class Program {
    public static  void main(String[] args){

        Department obj = new Department(1, "Developer");

        Seller seller = new Seller(21, "Paulo", "paulo@gmail.com",
                new Date(), 4500.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(obj);
        System.out.println(seller);

    }

}
