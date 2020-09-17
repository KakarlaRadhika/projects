import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { DataService } from '../data.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-data',
  templateUrl: './data.component.html',
  styleUrls: ['./data.component.css']
})
export class DataComponent implements OnInit {

  constructor(private http:HttpClient,private httpref:DataService) { }
  

  data=[];
  ngOnInit() {
    this.httpref.fetchData().subscribe(
      data=>{
        this.data=data;
      }
    )
  }
 
}
