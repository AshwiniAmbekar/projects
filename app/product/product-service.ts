import { Product } from './product';
import { Injectable, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable() //Dependency Injection-No need to create object of ProductService class
export class ProductService  {

         products:Product[];

    constructor(private http:HttpClient){  
        
    }
    sendToServer(product:Product){  
        //our code to communicate with the server
        }

        retrieveFromServer(url):Observable<Product[]>{

           return this.http.get<Product[]>(url);
           /*  let p1=new Product(1,"Samsung",4500,8);
            let p2=new Product(2,"Sony",15000,1);
            let p3=new Product(3,"One plus",45000,1);
            let p4=new Product(4,"Oppo",20000,5);
            let p5=new Product(5,"LG",25000,6);

            let products=[p1,p2,p3,p4,p5]; */
            
        }

        
        
    }
