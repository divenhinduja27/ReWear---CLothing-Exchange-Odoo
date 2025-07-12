import { Component, OnInit } from '@angular/core';

interface Item {
  title: string;
  image: string;
}

interface UserStats {
  listings: number;
  purchases: number;
  reviews: number;
}

interface User {
  fullName: string;
  email: string;
  username: string;
  memberSince: Date;
  stats: UserStats;
  listings: Item[];
  purchases: Item[];
}

@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css'],
})
export class UserDashboardComponent implements OnInit {
  user!: User;

  get stats() {
    return [
      { label: 'Listings', value: this.user.stats.listings },
      { label: 'Purchases', value: this.user.stats.purchases },
      { label: 'Reviews', value: this.user.stats.reviews },
    ];
  }

  ngOnInit(): void {
    // Simulated API data — replace this with a real service
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
        { title: 'Item 1', image: '/assets/images/item1.jpg' },
        { title: 'Item 2', image: '/assets/images/item2.jpg' },
        { title: 'Item 3', image: '/assets/images/item3.jpg' },
        { title: 'Item 4', image: '/assets/images/item4.jpg' },
        { title: 'Item 5', image: '/assets/images/item5.jpeg' },
      ],
      purchases: [
        { title: 'Product A', image: '/assets/images/ProductB.jpeg' },
        { title: 'Product B', image: '/assets/images/ProductC.jpeg' },
        { title: 'Product C', image: '/assets/images/ProductD.jpeg' },
        { title: 'Product D', image: '/assets/images/ProductE.jpeg' },
        { title: 'Product E', image: '/assets/images/ProductF.jpeg' },
      ],
    };
  }
}
