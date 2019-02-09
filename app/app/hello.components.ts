import {Component} from '@angular/core'

@Component( {                   //Decorator
selector:'hello',
template:`
        <h3>{{ message }}</h3>            
`
})

export class HelloComponent{

    message:string="Konnichiwa Sekai"; //Namaste Duniya 

}

