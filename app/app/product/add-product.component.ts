import { Product } from './product';
import { Component } from '@angular/core'
import { ProductService } from './product-service';

@Component({
    selector:'add-prod',
    templateUrl:'./add-product.component.html'
})

export class AddProductComponent {

    product:Product=new Product();

    //this is where injection happens
    constructor(private ps:ProductService) {

    }
/*add() {
        console.log("Add called");
        console.log(JSON.stringify(this.product));  //stringify=toString() method in java
    } 
*/
    add(pform) {
       /*  console.log("Add called");
        console.log(pform.value);  //stringify=toString() method in java
        console.log(JSON.stringify(this.product)); */
        //let ps=new ProductService();
        
        this.ps.sendToServer(this.product);
    } 

    
}