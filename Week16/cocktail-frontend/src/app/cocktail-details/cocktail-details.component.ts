import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BackendService } from '../services/backend.service';

@Component({
  selector: 'app-cocktail-details',
  standalone: true,
  imports: [],
  templateUrl: './cocktail-details.component.html',
  styleUrl: './cocktail-details.component.css'
})
export class CocktailDetailsComponent {

  constructor(private ar: ActivatedRoute, private backend: BackendService) {
    console.log(this.ar.snapshot.params['idDrink']);
  }
}
