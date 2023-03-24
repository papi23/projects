#include <stdio.h>
#include "ciupicaros.h"
#include "munianio.h"
#include "ciupapi.h"
#include <stdlib.h>
#include "FaciOCafea.h"
#include <time.h>

int nr;
extern float total;
extern float totalF;
extern int freq[100];
extern int freqD[100];
extern int n;
extern int k;
extern float totalD;

void combo3(){

    float totaln;

    if( freq[13] == 4 && freqD[3] == 3 ) {

            printf ("You bought the combo with 4 Burittos and 3 Tuborgs so you will get 8%% off your purchase\n");
            totaln = totalF - (0.8 * ( totalF / 10));

            //printf( "The new total is %.2f\n", totaln);
            totalF = totaln;

        }
}

void combo4(){

    float totaln;

    if( freq[12] == 5 && freqD[1] == 4 ) {

            printf ("You bought the combo with 5 McMuffins and 4 Pepsi so you will get 6%% off your purchase\n");
            totaln = totalF - (0.6 * ( totalF / 10));

            //printf( "The new total is %.2f\n", totaln);
            totalF = totaln;

        }
}
void combo5(){

    float totaln;

    if( freqD[3] == 16 && freqD[4] == 3 ) {

            printf ("You bought the combo with 16 Tuborgs and 3 Bottles of Noroc so you will get 30%% off your purchase\n");
            totaln = totalF - (3 * ( totalF / 10));

            //printf( "The new total is %.2f\n", totaln);
            totalF = totaln;

        }
}

void randomComboPrint(){


    int low = 1, up=6;

    srand(time(NULL));

    nr = (rand() % (up - low + 1)) + low;

    printf ("*------------------------------------------------------------------------------------------------------------*\n");
   switch(nr)
   {
    case 1:
        printf ("    Today's combo contains 3 Hamburgers (1) and 2 snack Wraps (6) and you will get 10%% off your purchase     \n");
            break;

    case 2:

        printf ("      Today's combo contains 1 Big Mac (2) and 2 McDoubles (3) and you will get 20%% off your purchase      \n");
            break;

    case 3:

        printf ("       Today's combo contains 4 Burittos (13) and 3 Tuborgs (3) and you will get 8%% off your purchase       \n");
            break;

    case 4:

        printf ("       Today's combo contains 5 McMuffins (12) and 4 Pepsi (1) so you will get 6%% off your purchase       \n");
            break;

    case 5:
        printf ("       Today's combo contains 16 Tuborgs (3) and 3 Bottles of Noroc (4) so you will get 30%% off your purchase     \n");
            break;
   }
   printf ("*---------------------------------------------------------------------------------------------------------*\n");
}
void randomCombo(){

   switch(nr)
   {
    case 1:

        combo1();
            break;

    case 2:

        combo2();
            break;

    case 3:

        combo3();
            break;

    case 4:

        combo4();
            break;

    case 5:

        combo5();
            break;

   }
}


