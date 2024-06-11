import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from "./header/header.component";
import { HomeComponent } from "./home/home.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, HeaderComponent, HomeComponent]
})
export class AppComponent {
  title = 'day-2';
}

import {NgFor} from '@angular/common';
...
@Component({
  standalone: true,
...
    NgFor, // <-- import into the component
...
  ],
})
export class AppComponent implements OnInit {
...
}