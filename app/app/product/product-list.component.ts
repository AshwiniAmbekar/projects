import { Component, OnInit } from '@angular/core';
import { Product } from './product';
import { ProductService } from './product-service';


@Component({
selector:'prod-list',
templateUrl:'./product-list.component.html'
})

export class ProductListComponent {
products:Product[];

constructor(private ps:ProductService) {
    ps.retrieveFromServer;           
}

showProducts() {
    this.products=this.ps.retrieveFromServer();
}

}
