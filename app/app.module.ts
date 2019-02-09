import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule,HttpClient} from '@angular/common/http';
import { AppComponent } from './app.component';
import { ProductListComponent } from './product/product-list.component';
import { ProductService } from './product/product-service';

@NgModule({
  declarations: [
    AppComponent,ProductListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ProductService,HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
