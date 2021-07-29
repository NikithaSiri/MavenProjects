import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {

    users: User[];							
							
  constructor(private router: Router, private userService: UserService) { }							
							
  // Initialize with default list of users							
  ngOnInit() {							
    if(localStorage.getItem("username")!=null){							
     							
    this.userService.getUsers()							
      .subscribe(data=> {							
        this.users = data;							
      });							
    }							
    else							
    this.router.navigate(['/login']);							
    							
  }							
							
  // logOff user							
  logOutUser():void{							
      if(localStorage.getItem("username")!=null){							
        localStorage.removeItem("username");							
        this.router.navigate(['/login']);							
      }							
  }							
							
// Modify USer							
editUser(user: User): void {							
  localStorage.removeItem("editUserId");							
  localStorage.setItem("editUserId", user.id.toString());							
  this.router.navigate(['edit-user']);							
};						
							
// Add New User							
addUser(): void {							
  this.router.navigate(['add-user']);							
};							



}