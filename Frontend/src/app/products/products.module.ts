import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ItemListingComponent } from './item-listing/item-listing.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';



@NgModule({
  declarations: [
    ItemListingComponent,
    ProductDetailComponent
  ],
  imports: [
    CommonModule
  ]
})
export class ProductsModule { }
