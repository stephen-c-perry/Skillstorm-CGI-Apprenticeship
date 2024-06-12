import { Component, OnInit } from '@angular/core';
import { Item } from '../models/item';
import { HouseThings } from '../models/house-things';
import { CommonModule, UpperCasePipe } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, UpperCasePipe],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})

export class HomeComponent implements OnInit {
  items: Item[]=[]
  ngOnInit(): void {
    this.items = HouseThings;
  }
  
}
