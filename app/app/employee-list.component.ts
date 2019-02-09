import{Component} from '@angular/core';

@Component({

    selector: 'emp-list',
    templateUrl:'./employee-list.component.html'
})

export class EmployeeListComponent {
    title: string="List of Employees";
    employees: any[]=[
        {
            "empno":1,
            "name":"AshApu",
            "salary":1000,
            "dateOfJoining":"27-Dec-2018"
        },
        {
            "empno":2,
            "name":"Ash",
            "salary":2000,
            "dateOfJoining":"28-Dec-2018"
        },
        {
            "empno":3,
            "name":"Apu",
            "salary":3000,
            "dateOfJoining":"29-Dec-2018"
        }

    ]
}