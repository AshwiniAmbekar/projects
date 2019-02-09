import { Product } from './product';
import { Injectable, OnInit } from '@angular/core';
import { ProductListComponent } from './product-list.component';

@Injectable() //Dependency Injection-No need to create object of ProductService class
export class ProductService  {
    sendToServer(product:Product){  
        //our code to communicate with the server
        }

        retrieveFromServer():Product[]{
            let p1=new Product(1,"Samsung",4500,8);
            let p2=new Product(2,"Sony",15000,1);
            let p3=new Product(3,"One plus",45000,1);
            let p4=new Product(4,"Oppo",20000,5);
            let p5=new Product(5,"LG",25000,6);

            let products=[p1,p2,p3,p4,p5];
            return products;
        }

        
        
    }
