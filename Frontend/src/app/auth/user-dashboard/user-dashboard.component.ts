import { Component, OnInit } from '@angular/core';

interface Item {
  title: string;
  image: string;
}

interface User {
  fullName: string;
  email: string;
  username: string;
  memberSince: Date;
  stats: {
    listings: number;
    purchases: number;
    reviews: number;
  };
  listings: Item[];
  purchases: Item[];
}

@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css'],
})
export class UserDashboardComponent implements OnInit {
  user: User;

  constructor() {
    // Replace with real user data fetching logic
    this.user = {
      fullName: 'John Doe',
      email: 'john@example.com',
      username: 'johndoe',
      memberSince: new Date(2021, 3, 15),
      stats: {
        listings: 8,
        purchases: 4,
        reviews: 12,
      },
      listings: [
        { title: 'Item 1', image: '/assets/item1.jpg' },
        { title: 'Item 2', image: '/assets/item2.jpg' },
        { title: 'Item 3', image: '/assets/item3.jpg' },
        { title: 'Item 4', image: '/assets/item4.jpg' },
      ],
      purchases: [
        { title: 'Product A', image: '/assets/productA.jpg' },
        { title: 'Product B', image: '/assets/productB.jpg' },
        { title: 'Product C', image: '/assets/productC.jpg' },
        { title: 'Product D', image: '/assets/productD.jpg' },
      ],
    };
  }

  ngOnInit(): void {}
}
