import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <!--The content below is only a placeholder and can be replaced.-->
    <div style="text-align:center">
    <hello></hello>
      <h1>
        Welcome to {{title}}!
        <ul class="nav navbar-nav">
          <li><a [routerLink]="['/add-prod']">Add</a></li>
          <li><a [routerLink]="['/prod-list']">List</a></li>
          </ul>

          <div class='container'>
          <router-outlet></router-outlet>
          </div>
      </h1>
      </div>
    
  `,
  styles: []
})
export class AppComponent {
  title = 'Our World!!';
}
