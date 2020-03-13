import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdmindataComponent } from './admindata/admindata.component';
import { ImportDataComponent } from './import-data/import-data.component';
import { ManagecompanyComponent } from './managecompany/managecompany.component';
import { UpdateipoinfoComponent } from './updateipoinfo/updateipoinfo.component';
import { LogoutComponent } from './logout/logout.component';
import { UserlistComponent } from './userlist/userlist.component';
import { AddcompanyComponent } from './addcompany/addcompany.component';
import { UpdatecompanyComponent } from './updatecompany/updatecompany.component';
import { RemovecompanyComponent } from './removecompany/removecompany.component';
import { IpodetailsComponent } from './ipodetails/ipodetails.component';
import { ManageexchangeComponent } from './manageexchange/manageexchange.component';
import { AddipoComponent } from './addipo/addipo.component';
import { RemoveipoComponent } from './removeipo/removeipo.component';
import { SectorComponent } from './sector/sector.component';
import { AddsectorComponent } from './addsector/addsector.component';
import { UpdatesectorComponent } from './updatesector/updatesector.component';
import { StockexchangeComponent } from './stockexchange/stockexchange.component';
import { AddstockexchangeComponent } from './addstockexchange/addstockexchange.component';
import { UpdatestockexchangeComponent } from './updatestockexchange/updatestockexchange.component';
import { StockpriceComponent } from './stockprice/stockprice.component';
import { AddstockpriceComponent } from './addstockprice/addstockprice.component';
import { UpdatestockpriceComponent } from './updatestockprice/updatestockprice.component';
import { UserComponent } from './user/user.component';
import { ComparecompanyComponent } from './comparecompany/comparecompany.component';
import { ComparesectorsComponent } from './comparesectors/comparesectors.component';



const routes: Routes = [
  {path:'userlist',component:UserlistComponent},
  {
    path: '',
    component: HomeComponent
 },
 {
  path: 'home',
  component: HomeComponent
},
    {
       path: 'navbar',
       component: NavbarComponent
    },
    {
      path: 'login',
      component: LoginComponent
   },
   {
    path: 'signup',
    component: SignupComponent
 },
 {
  path: 'adminlogin',
  component: AdminloginComponent
},
{
  path: 'admindata',
  component: AdmindataComponent
},
{
  path: 'import-data',
  component: ImportDataComponent
},
{
  path: 'managecompany',
  component: ManagecompanyComponent
},
{
  path: 'updateipoinfo',
  component: UpdateipoinfoComponent
},
{
  path: 'logout',
  component: LogoutComponent
},
{
  path: 'addcompany',
  component: AddcompanyComponent
},
{
  path: 'updatecompany',
  component: UpdatecompanyComponent
},
{
  path: 'removecompany',
  component: RemovecompanyComponent
},
{
  path: 'ipodetails',
  component: IpodetailsComponent
},
{
  path: 'manageexchange',
  component: ManageexchangeComponent
},
{
  path: 'addipo',
  component: AddipoComponent
},
{
  path: 'removeipo',
  component: RemoveipoComponent
},
{
  path: 'sector',
  component: SectorComponent
},
{
  path: 'addsector',
  component: AddsectorComponent
},
{
  path: 'updatesector',
  component: UpdatesectorComponent
},
{
  path: 'stockexchange',
  component: StockexchangeComponent
},
{
  path: 'addstockexchange',
  component: AddstockexchangeComponent
},
{
  path: 'updatestockexchange',
  component: UpdatestockexchangeComponent
},
{
  path: 'stockprice',
  component: StockpriceComponent
},
{
  path: 'addstockprice',
  component: AddstockpriceComponent
},
{
  path: 'updatestockprice',
  component: UpdatestockpriceComponent
},
{
  path: 'user',
  component: UserComponent
},
{
  path: 'comparecompany',
  component: ComparecompanyComponent
},
{
  path: 'comparesectors',
  component: ComparesectorsComponent
}



 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
