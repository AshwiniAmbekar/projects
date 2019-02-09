import { Injectable } from '@angular/core';
import { Movie } from './movie';
import {HttpClient} from '@angular/common/http';


@Injectable()
export class MovieService{
    movies:Movie;

    constructor(private http:HttpClient){

    }

    sendToServer(movie:Movie){
        let url="http://localhost:9129/movie/add";
       return this.http.post(url,movie);
    }

    /* receiveFromServer(url:string):Observable<Movie[]>{
        return this.http.get<Movie[]>(url);
    } */
}