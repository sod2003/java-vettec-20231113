import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  cocktailsRaw: any[] = [];

  cocktailsByLetterSubject = new BehaviorSubject<any[]>([]);

  cocktailsByLetter = this.cocktailsByLetterSubject.asObservable();

  constructor(private http: HttpClient) {
    this.getAllCocktailsByLetter('g');
  }

  getAllCocktailsByLetter(letter: String) {
    if (letter == undefined || letter == null) {
      letter = "g"
    }

    this.http.get("https://www.thecocktaildb.com/api/json/v1/1/search.php?f=" + letter, { observe: 'response'})
      .subscribe(data => {

        this.cocktailsRaw = [];

        let temp: any = data.body;

        for (let cocktail of temp['drinks']) {
          this.cocktailsRaw.push(cocktail);
        }

        this.cocktailsByLetterSubject.next(this.cocktailsRaw);
      });
  }
}
