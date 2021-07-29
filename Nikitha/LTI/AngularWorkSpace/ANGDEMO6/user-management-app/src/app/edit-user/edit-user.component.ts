import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from '../user';
import { UserService } from '../user.service';
import {first} from 'rxjs/operators';    
import { Router } from '@angular/router';
@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {

  user: User;							
  editForm: FormGroup;							
  submitted: boolean = false;							
  constructor(private formBuilder: FormBuilder,private router: Router, 							
    private userService: UserService) { }							
  							
  ngOnInit() {							
    if(localStorage.getItem("username")!=null){							
    let userId = localStorage.getItem("editUserId");							
    if(!userId) {							
      alert("Invalid action.")							
      this.router.navigate(['list-user']);							
      return;							
    }							
    this.editForm = this.formBuilder.group({							
      id: [],							
      email: ['', Validators.required],							
      firstName: ['', Validators.required],							
      lastName: ['', Validators.required]							
    });							
							
    this.userService.getUserById(+userId)							
      .subscribe( data => {							
        this.editForm.setValue(data);							
      });							
    }							
    else							
        this.router.navigate(['/login']);							
  }							
							
  onSubmit() {							
    this.submitted = true;							
    if(this.editForm.invalid){							
      return;							
    }							
    this.userService.updateUser(this.editForm.value)							
      .pipe(first())						//returns the first value they receive from the source and closes the observable	
      .subscribe(							
        data => {							
          this.router.navigate(['list-user']);							
        },							
        error => {							
          alert(error);							
        });							
  }							
							
   // logOff user							
   logOutUser():void{							
    if(localStorage.getItem("username")!=null){							
      localStorage.removeItem("username");							
      this.router.navigate(['/login']);							
    }							
}							


}
