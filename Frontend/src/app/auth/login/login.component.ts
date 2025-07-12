import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm!: FormGroup;
  submitted = false;

  constructor(private fb: FormBuilder, private router: Router) {}

  ngOnInit(): void {
    this.loginForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  // Getter for easy access to form fields in template
  get f() {
    return this.loginForm.controls;
  }

  onLogin(): void {
    this.submitted = true;

    if (this.loginForm.invalid) {
      return;
    }

    // Replace this block with your real authentication logic
    const email = this.loginForm.value.email;
    const password = this.loginForm.value.password;

    if (email && password) {
      // Assuming login is successful
      this.router.navigate(['/userDashboard']);
    }
  }
}
