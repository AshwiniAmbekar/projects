import { Flight } from './flight';
import { Component } from '@angular/core'
import { FlightService } from './flight.service';


@Component({
    selector:'add-flight',
    templateUrl:'./add-flight.component.html'
})

export class AddProductComponent {

    flight:Flight[];

    //this is where injection happens
    constructor(private fs:FlightService) {

    }

    add(src:string ,dest:string) {
      let url='http://localhost:9219/ajax-flightinfo-web-app/FlightControllerServlet?from='+src+'&to='+dest;
        this.fs.receiveFromServer(url).subscribe(data=>{
            this.flight=data;
        });
    } 

    
}