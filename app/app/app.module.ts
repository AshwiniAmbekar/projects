import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { HelloComponent } from './hello.components';
import { ProductListComponent } from './product/product-list.component';
import { AddProductComponent } from './product/add-product.component';
import { ProductService } from './product/product-service';


@NgModule({
  declarations: [
    ProductListComponent,
    AppComponent,HelloComponent,
    AddProductComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {path:'add-prod',component:AddProductComponent},
      {path:'prod-list',component:ProductListComponent}
  ])
  ],
  providers: [ProductService],
  bootstrap: [ProductListComponent,
    AppComponent,AddProductComponent]
})
export class AppModule { }

