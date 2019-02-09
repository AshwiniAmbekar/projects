import { Component } from "@angular/core";
import { Flight } from './flight';
import { FlightService } from "./flight.service";


@Component({
    selector:'flight-list',
    templateUrl:'./flight-list.component.html'
})

export class FlightListComponent {
    flights:Flight[];
    
   
       constructor(private fs:FlightService) {
                  
       }
   
       showFlights() {
          
           let url='http://localhost:9219/ajax-flightinfo-web-app/FlightControllerServlet';
           this.fs.receiveFromServer(url).subscribe(
               data => {
               this.flights = data;
               });
            }
        }
       