import { Component, OnInit } from '@angular/core';
import { Product } from './product';
import { ProductService } from './product-service';


@Component({
selector:'prod-list',
templateUrl:'./product-list.component.html'
})

export class ProductListComponent {
 products:Product[];
 currentPosition:number=1;
 pageSize:number=2;

    constructor(private ps:ProductService) {
               
    }

    loadProducts() {
        this.currentPosition=1;
        let url='http://localhost:9219/ajax-pagination-jquery-web-app/ProdController1';
        this.ps.retrieveFromServer(url).subscribe(
            data => {
            this.products = data;
            });
    }

    next() {
      this.currentPosition+=this.pageSize;
      let url = 'http://localhost:9219/ajax-pagination-jquery-web-app/ProdController1?cp='+this.currentPosition;
      this.ps.retrieveFromServer(url).subscribe(
        data => {
        this.products = data;
        });
    }

    prev() {
        this.currentPosition-=this.pageSize;
        let url = 'http://localhost:9219/ajax-pagination-jquery-web-app/ProdController1?cp='+this.currentPosition;
        this.ps.retrieveFromServer(url).subscribe(
            data => {
            this.products = data;
            });
    }

}
