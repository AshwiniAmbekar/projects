import { Injectable } from '@angular/core';
import { Flight } from './flight';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';


@Injectable()
export class FlightService{
    flights:Flight[];

    constructor(private http:HttpClient){

    }

    sendToServer(flight:Flight[]){

    }

    receiveFromServer(url:string):Observable<Flight[]>{
        return this.http.get<Flight[]>(url);
    }
}