import { Component } from '@angular/core';

@Component({
  selector: 'app-cover-page',
  templateUrl: './cover-page.component.html',
  styleUrls: ['./cover-page.component.css']
})
export class CoverPageComponent {
  featuredItems = [
    { name: 'Denim Jacket', image: 'https://picsum.photos/180/120?random=1' },
    { name: 'Floral Dress', image: 'https://picsum.photos/180/120?random=2' },
    { name: 'Sneakers', image: 'https://picsum.photos/180/120?random=3' },
    { name: 'Winter Coat', image: 'https://picsum.photos/180/120?random=4' }
  ];

  testimonials = [
    { feedback: 'Amazing experience! I swapped my dress and got a new one free!', user: 'Anjali S.' },
    { feedback: 'Love the sustainability aspect. Highly recommend!', user: 'Rohan M.' }
  ];
}
