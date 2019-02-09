import { Component } from "@angular/core";
import { Movie } from './movie';
import { MovieService } from "./movie.service";


@Component({
    selector:'movie-list',
    templateUrl:'./movie-list.component.html'
})

export class MovieListComponent {
    movies:Movie=new Movie();
    response : string;
    
       constructor(private ms:MovieService) {          
       }
   
       addMovies(mform) {
          
           this.ms.sendToServer(this.movies)
            .subscribe(data => {
               this.response = data.toString();
            })
               
            }
        }
       