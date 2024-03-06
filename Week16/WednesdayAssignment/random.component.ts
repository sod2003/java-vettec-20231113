import { Component } from '@angular/core';
import { BackendService } from '../services/backend.service';
import { Cocktail } from '../models/cocktail';
import { CocktailComponent } from '../cocktail/cocktail.component';

@Component({
  selector: 'app-random',
  standalone: true,
  imports: [CocktailComponent],
  templateUrl: './random.component.html',
  styleUrl: './random.component.css'
})
export class RandomComponent {

  cocktail: Cocktail = new Cocktail("", "", "", "", "", "", "", "", "", "");

  constructor(private backend: BackendService) {
    this.backend.randomCocktail.subscribe(data => {
      this.cocktail = data;
    });
  }
}
