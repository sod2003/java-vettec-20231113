import { Routes } from '@angular/router';
import { CocktailsComponent } from './cocktails/cocktails.component';
import { HomeComponent } from './home/home.component';
import { FormComponent } from './form/form.component';
import { CocktailDetailsComponent } from './cocktail-details/cocktail-details.component';
import { RandomComponent } from './random/random.component';

export const routes: Routes = [
    {
        path: '',
        component: HomeComponent
    },
    {
        path: 'cocktails',
        component: CocktailsComponent
    },
    {
        path: 'form',
        component: FormComponent
    },
    {
        path: 'cocktails/details/:idDrink',
        component: CocktailDetailsComponent
    },
    {
        path: 'cocktails/random',
        component: RandomComponent
    }
];
