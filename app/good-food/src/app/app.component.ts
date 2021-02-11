import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  listefranchise: string[];
  ngOnInit(): void {
    this.listefranchise = []
  }
  title = 'good-food';
}
