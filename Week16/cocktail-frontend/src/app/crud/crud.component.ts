import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-crud',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './crud.component.html',
  styleUrl: './crud.component.css'
})
export class CrudComponent {

  baseUrl: string = 'https://regres.in/api/users/';

  constructor(private http: HttpClient, private fb: FormBuilder) {
    this.createUser({
      'name': 'Tester Dude',
      'job': 'Testing'
    });
    this.updateUser('5', {
      'name': 'Junior Dude',
      'job': 'Testing Apprentice'
    });
    this.getUserById('2');
    this.deleteUser('34');
  }

  getFormGroup = this.fb.group({
    id: ['', Validators.required]
  });

  // get single user by ID
  getUserById(userId: string) {
    this.http.get<any>(this.baseUrl + userId, { observe: 'response' })
    .subscribe({
      next: data => console.log(data),
      error: err => console.log(err)
    
    });
  }

  // create single user
  createUser(user: {}) {
    this.http.post<any>(this.baseUrl, user, { observe: 'response' })
    .subscribe({
      next: data => console.log(data),
      error: err => console.log(err)
    });
  }

  // update single user
  updateUser(id: string, user: {}) {
    this.http.put<any>(this.baseUrl + id, user, { observe: 'response' } )
    .subscribe({
      next: data => console.log(data),
      error: err => console.log(err)
    });
  }

  // delete single user
  deleteUser(id: string) {
    this.http.delete<any>(this.baseUrl + id, { observe: 'response' } )
    .subscribe({
      next: data => console.log(data),
      error: err => console.log(err)
    });
  }

  
}
