import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Cocktail } from '../models/cocktail';

@Component({
  selector: 'app-cocktail',
  standalone: true,
  imports: [],
  templateUrl: './cocktail.component.html',
  styleUrl: './cocktail.component.css'
})
export class CocktailComponent {

  // Input receives data from parent
  @Input() cocktail: Cocktail = new Cocktail("", "", "", "", "", "", "", "", "", "");

  // Output sends data to parent
  @Output() deleteCocktailEvent = new EventEmitter<Cocktail>();

  // Emitting an event when user clicks X in the component
  emitDeleteCocktailEvent() {
    this.deleteCocktailEvent.emit(this.cocktail);
  }
}
