import { Component } from '@angular/core';
import { BackendService } from '../services/backend.service';

@Component({
  selector: 'app-cocktails',
  standalone: true,
  imports: [],
  templateUrl: './cocktails.component.html',
  styleUrl: './cocktails.component.css'
})
export class CocktailsComponent {

  constructor(private backend: BackendService) {

    this.backend.cocktailsByLetter.subscribe(data => {
      console.log(data);
    });
  }

}
