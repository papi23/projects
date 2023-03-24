#include "ciupapi.h"
#include <stdio.h>
#include <conio.h>

extern char productsD[5][15] = {
                    "PEPSI   ",
                    "COCA-COLA  ",
                    "TUBORG 0.5L",
                    "NOROC 3L   ",
                    "SODA      "

    };


    // the list of codes
extern char theCodeD[5][15] = {
                    "press no. 1",
                    "press no. 2",
                    "press no. 3",
                    "press no. 4",
                    "press no. 5"


    };

    //the list of prices
extern float thePriceD[15] = {

                    2.00,
                    7.00,
                    12.99,
                    5.00,
                    6.50
    };

    //the list of products
extern char products[14][15] = {
                    "Hamburger",
                    "Big Mac",
                    "McDouble",
                    "McChicken",
                    "McNuggets",
                    "Snack Wrap",
                    "BigN'Tasty",
                    "McArabia",
                    "Cheeseburger",
                    "FrenchFries",
                    "Happy Meal",
                    "McMuffins",
                    "Burrito",
                    "BigMenu"

    };


    // the list of codes
extern char theCode[14][15] = {
                    "press no. 1",
                    "press no. 2",
                    "press no. 3",
                    "press no. 4",
                    "press no. 5",
                    "press no. 6",
                    "press no. 7",
                    "press no. 8",
                    "press no. 9",
                    "press no. 10",
                    "press no. 11",
                    "press no. 12",
                    "press no. 13",
                    "press no. 46"


    };

    //the list of prices
extern float thePrice[15] = {

                    2.00,
                    7.00,
                    12.99,
                    8.60,
                    3.99,
                    4.70,
                    9.20,
                    3.45,
                    12.40,
                    7.20,
                    1.49,
                    5.30,
                    9,99,
                    15.00

    };


extern float totalF = 0;
extern float total = 0;
extern int n = 0;
extern int prod = 0;
extern int produse[100] = {0};
extern int freq[100]={0};

extern float totalD = 0;
extern int k = 0;
extern int prodD = 0;
extern int produseD[100] = {0};
extern int freqD[100]={0};



void tableRowTop() {

    //printing the head of the table
    printf ("*---------------*---------------*---------------*\n");
    printf ("*---------------*   FOOD MENU   *---------------*\n");
    printf ("*---------------*---------------*---------------*\n");
    printf ("  %s\t   %s\t    %.2f ron                        \n", products, theCode, thePrice[0]);
    printf ("*---------------*---------------*---------------*\n");

}


void tableRowBot() {

    //printing the bottom of teh table
    printf ("  %s\t   %s\t    %.2f ron                           \n", products + 12, theCode + 12, thePrice[12]);
    printf ("*---------------*---------------*---------------*\n");
    printf ("*---------------*    THE END    *---------------*\n");
    printf ("*---------------*---------------*---------------*\n");
}

void table(int rowsNumber) {

    //printing table
    int i;
    tableRowTop();
    for(i = 1; i < rowsNumber - 1 ; i++) {


    printf ("  %s\t   %s\t    %.2f ron                             \n", products + i, theCode + i, thePrice[i]);
    printf ("*---------------*---------------*---------------*\n");

    }
    tableRowBot();

}


void chooseYourBag() {



    printf ("Choose a product that you want to buy pressing the number coresponding to it and then press 0 to end the shopping session: \n");
    while(1) {

        scanf( "%d", &prod);       //citesti cate un produs din tabel
        printf("%s \t\t %.2f ron\n",products[prod - 1],thePrice[prod - 1]);     //afiseaza ce produs ai luat
        produse[n] = prod;  //incarcam vectoru ciudat cu id ul produselor

        if (prod == 0)          //daca citesti 0 se inchide whileul adica nu mai citesti produse
            break;

        n++;

    }
    for(int i = 0; i < n; i++)
        freq[produse[i]]++;     //vecoru de frecventa numara cate produse de acelasi fel ai din vectorul ciudat aka produse[n];

}



void buyADrink() {

    int decision;
    printf("Do you fancy a drink with your order?\n");
    printf ("Press 1 for yes or 0 for no: ");

    scanf("%d", &decision);
    printf("\n");

    if(decision == 1) {

       tableD(4);
       chooseYourBagD();        //if u want to buy a drink it shows you the table and you can choose the products
       system("cls");
       total = 0;
       totalD = 0;
       showYourTOtal();


    }
    if (decision == 0) {

        printf ("-------------------------------\n");
        totalF=total+totalD;        //if you dont wat it shows you the final price
        randomCombo();
    }



}

void tableRowTopD() {

    //printing the head of the table
    printf ("*---------------*---------------*---------------*\n");
    printf ("*---------------*    DRINKS     *---------------*\n");
    printf ("*---------------*---------------*---------------*\n");
    printf ("  %s\t   %s\t    %.2f ron                        \n", productsD, theCodeD, thePriceD[0]);
    printf ("*---------------*---------------*---------------*\n");

}


void tableRowBotD() {

    //printing the bottom of teh table
    printf ("  %s\t   %s\t    %.2f ron                           \n", productsD + 3, theCodeD + 3, thePriceD[3]);
    printf ("*---------------*---------------*---------------*\n");
    printf ("*---------------*    THE END    *---------------*\n");
    printf ("*---------------*---------------*---------------*\n");
}

void tableD(int rowsNumber) {

    //printing table
    int i;
    tableRowTopD();
    for(i = 1; i < rowsNumber - 1 ; i++) {


    printf ("  %s\t   %s\t    %.2f ron                             \n", productsD + i, theCodeD + i, thePriceD[i]);
    printf ("*---------------*---------------*---------------*\n");

    }
    tableRowBotD();

}


void chooseYourBagD() {



    printf ("Choose a product that you want to buy pressing the number coresponding to it and then press 0 to end the shopping session: \n");
    while(1) {

        scanf( "%d", &prodD);       //citesti cate un produs din tabel
        printf("%s \t\t %.2f ron\n",productsD[prodD - 1],thePriceD[prodD - 1]);     //afiseaza ce produs ai luat
        produseD[k] = prodD;  //incarcam vectoru ciudat cu id ul produselor

        if (prodD == 0)          //daca citesti 0 se inchide whileul adica nu mai citesti produse
            break;

        k++;

    }
    for(int i = 0; i < k; i++)
        freqD[produseD[i]]++;     //vecoru de frecventa numara cate produse de acelasi fel ai din vectorul ciudat aka produse[n];

}

void showUrTotalForDrinks() {

    for(int i = 1; i <= 5; i++) {
            if(freqD[i] != 0) {
                totalD = totalD + (freqD[i] * thePriceD[i - 1]);        //calculam pretul total
                printf("%dx%s \t %dx%.2f ron\n", freqD[i], productsD[i-1], freqD[i], thePriceD[i-1]); //afisam cate din fiecare produse avem
            }
    }
}

void showYourTOtal() {

    system("cls");      //curatam consola
    printf ("Your bag contains:\n");

    for(int i = 1; i <= 14; i++) {
            if(freq[i] != 0) {
                total = total + (freq[i] * thePrice[i - 1]);        //calculam pretul total
                printf("%dx%s \t %dx%.2f ron\n", freq[i], products[i-1], freq[i], thePrice[i-1]); //afisam cate din fiecare produse avem
            }
    }
            showUrTotalForDrinks();

            printf ("-------------------------------\n");
            printf ("Total Drinks:         %.2f ron\n", totalD);
            printf ("Total Food:           %.2f ron\n", total);  //afisam totaliu


            continueShopping();

}




