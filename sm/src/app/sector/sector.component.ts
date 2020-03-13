import { Component, OnInit } from '@angular/core';
import { Company } from 'src/app/company';

import { Observable } from 'rxjs';

//import { companyService } from 'src/app/company.service';
import { SectorService } from '../sector.service';
import { Sector } from '../sector';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sector',
  templateUrl: './sector.component.html',
  styleUrls: ['./sector.component.css']
})
export class SectorComponent implements OnInit {

  isupdated: boolean;

  constructor(private router: Router,private sectorservice: SectorService) { }
 
 
 
  sectorList: Observable<Sector[]>;
 
 
 
  ngOnInit() {
 
 
 
   this.sectorservice.getAllSectorDetails().subscribe(data => {
 
 
 
    this.sectorList = data;
 
 
 
   })
 
  }
 
  deleteSectorDetails(sector : Sector ) {

    this.sectorservice.deleteSectorDetails(sector.sectorid)
 
     .subscribe(
 
      data => {
 
       this.sectorservice.getAllSectorDetails().subscribe(data =>{
 
        this.sectorList =data;
 
        });
 
 
 
      }) ;
 
   };
 
   updateSectorDetails(sector : Sector ) {
 
   window.localStorage.removeItem("edit-companyname");
 
   window.localStorage.setItem("edit-companyname", sector.sectorid.toString());
 
   this.router.navigate(['addsector']);
 
   };
  }
 
 
 
 
 
 
 
 
 
