import { Component } from '@angular/core';

@Component({
  selector: 'app-landing-page',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.css']
})
export class LandingComponent {
  categories = [
    'Men’s Wear',
    'Women’s Wear',
    'Kids',
    'Footwear',
    'Accessories',
    'Winter Collection'
  ];

  products = [
    {
      name: 'Men’s Denim Jacket',
      price: 1299,
      image: 'https://via.placeholder.com/150?text=Denim+Jacket'
    },
    {
      name: 'Women’s Summer Dress',
      price: 1499,
      image: 'https://via.placeholder.com/150?text=Summer+Dress'
    },
    {
      name: 'Kids’ Hoodie',
      price: 899,
      image: 'https://via.placeholder.com/150?text=Kids+Hoodie'
    },
    {
      name: 'Sneakers',
      price: 1999,
      image: 'https://via.placeholder.com/150?text=Sneakers'
    }
  ];
}
