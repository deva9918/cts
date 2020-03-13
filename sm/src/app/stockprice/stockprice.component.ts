import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { StockpriceService } from '../stockprice.service';
import { Stockprice } from '../stockprice';
import { Router } from '@angular/router';

@Component({
  selector: 'app-stockprice',
  templateUrl: './stockprice.component.html',
  styleUrls: ['./stockprice.component.css']
})
export class StockpriceComponent implements OnInit {

  
  isupdated: boolean;

  constructor(private router: Router,private stockpriceservice: StockpriceService) { }
 
 
 
  stockpriceList: Observable<Stockprice[]>;
 
 
 
  ngOnInit() {
 
 
 
   this.stockpriceservice.getAllStockPrice().subscribe(data => {
 
 
 
    this.stockpriceList = data;
 
 
 
   })
 
  }
 
  deleteStockPrice(stockprice : Stockprice ) {

    this.stockpriceservice.deleteStockPrice(stockprice.stockexchange)
 
     .subscribe(
 
      data => {
 
       this.stockpriceservice.getAllStockPrice().subscribe(data =>{
 
        this.stockpriceList =data;
 
        });
 
 
 
      }) ;
 
   };
 
   updateStockPrice(stockprice : Stockprice ) {
 
   window.localStorage.removeItem("edit-stockexchange");
 
   window.localStorage.setItem("edit-stockexchange", stockprice.stockexchange.toString());
 
   this.router.navigate(['addstockprice']);
 
   };
 
  }
 


