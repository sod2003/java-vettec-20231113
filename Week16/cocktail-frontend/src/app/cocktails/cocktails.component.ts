import { Component } from '@angular/core';
import { BackendService } from '../services/backend.service';
import { Cocktail } from '../models/cocktail';
import { CocktailComponent } from '../cocktail/cocktail.component';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cocktails',
  standalone: true,
  imports: [CocktailComponent, FormsModule],
  templateUrl: './cocktails.component.html',
  styleUrl: './cocktails.component.css'
})
export class CocktailsComponent {

  isTable: boolean = false;

  // local storage
  cocktails: Cocktail[] = [];

  // holder
  searchLetter: string = '';

  constructor(private backend: BackendService, private router: Router) {

    this.backend.cocktailsByLetter.subscribe(data => {
      this.cocktails = data;
      console.log(this.cocktails);
    });
  }

  viewToggle() {
    this.isTable = !this.isTable;
  }

  removeCocktailTable(idDrink: string) {
    for (let cocktail of this.cocktails) {
      if (cocktail.idDrink === idDrink) {
        this.cocktails.splice(this.cocktails.indexOf(cocktail), 1);
      }
    }
  }

  removeCocktailGrid(cocktail: Cocktail, index: number) {
    console.log(cocktail);
    this.cocktails.splice(index, 1);
  }

  updateLetter() {
    this.backend.getAllCocktailsByLetter(this.searchLetter);
  }

  getDetails(idDrink: string) {
    this.router.navigate(['cocktails/details/' + idDrink]);
  }
}
