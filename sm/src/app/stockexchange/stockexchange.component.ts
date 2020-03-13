import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { StockexchangeService } from '../stockexchange.service';
import { Stockexchange } from '../stockexchange';
import { Router } from '@angular/router';


@Component({
  selector: 'app-stockexchange',
  templateUrl: './stockexchange.component.html',
  styleUrls: ['./stockexchange.component.css']
})
export class StockexchangeComponent implements OnInit {

  
  isupdated: boolean;

  constructor(private router: Router,private stockexchangeservice: StockexchangeService) { }
 
 
 
  stockexchangeList: Observable<Stockexchange[]>;
 
 
 
  ngOnInit() {
 
 
 
   this.stockexchangeservice.getAllStockExchange().subscribe(data => {
 
 
 
    this.stockexchangeList = data;
 
 
 
   })
 
  }
 
  deleteStockExchange(stockexchange : Stockexchange ) {

    this.stockexchangeservice.deleteStockExchange(stockexchange.seid)
 
     .subscribe(
 
      data => {
 
       this.stockexchangeservice.getAllStockExchange().subscribe(data =>{
 
        this.stockexchangeList =data;
 
        });
 
      }) ;
 
   };
 
   updateStockExchange(stockexchange : Stockexchange ) {
 
   window.localStorage.removeItem("edit-seid");
 
   window.localStorage.setItem("edit-seid", stockexchange.seid.toString());
 
   this.router.navigate(['addstockexchange']);
 
   };
 

}
