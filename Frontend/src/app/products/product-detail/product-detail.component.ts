import { Component } from '@angular/core';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent {
  product = {
    name: 'Recycled Denim Jacket',
    description: 'This stylish and eco-friendly denim jacket is made from 100% recycled materials. Featuring a modern fit, button-up front, and deep pockets — perfect for layering in all seasons.',
    image: 'https://picsum.photos/seed/eco-jacket/600/700',
    gallery: [
      'https://picsum.photos/seed/jacket1/300/400',
      'https://picsum.photos/seed/jacket2/300/400',
      'https://picsum.photos/seed/jacket3/300/400',
      'https://picsum.photos/seed/jacket4/300/400'
    ],
    details: {
      size: 'Medium',
      condition: 'Like New',
      brand: 'EcoWear',
      category: 'Outerwear',
      material: '100% Recycled Cotton'
    }
  };
}
