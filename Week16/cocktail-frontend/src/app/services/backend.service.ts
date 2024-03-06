import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { Cocktail } from '../models/cocktail';

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  cocktailsRaw: Cocktail[] = [];

  cocktailsByLetterSubject = new BehaviorSubject<Cocktail[]>([]);
  cocktailsByLetter = this.cocktailsByLetterSubject.asObservable();
  randomCocktailSubject = new BehaviorSubject<Cocktail>(new Cocktail("", "", "", "", "", "", "", "", "", ""));
  randomCocktail = this.randomCocktailSubject.asObservable();

  constructor(private http: HttpClient) {
    this.getAllCocktailsByLetter('g');
  }

  getAllCocktailsByLetter(letter: String) {
    if (letter == undefined || letter == null) {
      letter = "g"
    }

    this.http.get<any>("https://www.thecocktaildb.com/api/json/v1/1/search.php?f=" + letter, { observe: 'response'})
      .subscribe(data => {

        this.cocktailsRaw = [];

        for (let cocktail of data.body.drinks) {
          this.cocktailsRaw.push(new Cocktail(
            cocktail.idDrink,
            cocktail.strDrink,
            cocktail.strAlcoholic, 
            cocktail.strDrinkThumb, 
            cocktail.strGlass, 
            cocktail.strIngredient1, 
            cocktail.strIngredient2, 
            cocktail.strIngredient3, 
            cocktail.strIngredient4, 
            cocktail.strInstructions));
        }

        this.cocktailsByLetterSubject.next(this.cocktailsRaw);
      });
  }

  getRandomCocktail() {
    this.http.get<any>("https://www.thecocktaildb.com/api/json/v1/1/random.php", {observe: 'response'})
    .subscribe(data => {
      this.randomCocktailSubject.next(new Cocktail( data.body.drinks[0].idDrink, 
                                                    data.body.drinks[0].strDrink,
                                                    data.body.drinks[0].strAlcoholic,
                                                    data.body.drinks[0].strDrinkThumb,
                                                    data.body.drinks[0].strGlass,
                                                    data.body.drinks[0].strIngredient1,
                                                    data.body.drinks[0].strIngredient2,
                                                    data.body.drinks[0].strIngredient3,
                                                    data.body.drinks[0].strIngredient4,
                                                    data.body.drinks[0].strInstructions)
        )
    });
  }
}
