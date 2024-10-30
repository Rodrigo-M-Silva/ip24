class week2 {
 double abs(double n) {
 if (n >=0) return n;
 else 
 return -n;
}


int max(int a, int b) {
    if (a>b) return a;
    else return b;
}


int min ( int a, int b){
    if (a<b)
    return a;
    else return b;
}


int irsGroup (int rend){
    if (rend < 10000)
    return 1;
    if (rend< 25500)
    return 2;
    if (rend <= 48500)
    return 3;
    else 
    return 4;
}


double irsTax(int esc){
    if (esc ==1)
    return 0.12;
    if (esc ==2)
    return 0.18;
    if (esc ==3)
    return 0.23;
    if (esc ==4)
    return 0.29;
    else
    return 0.0;
}


static void varAssign() {
int n = 1;
n = 2;
n = n + 1;
n = n + 1;
n = n + 1;

}

static void varAssignDiv() {
int v = 2024;
v = v/10;
v = v/10;
v = v/10;


}

int fd (int x) {
    int y = x;
    while (y >=10){
        y=y/10;
    }
    return y;
}


static void naturalsIterator() {
int i = 1;
while(i < 5) {
   i = i + 1;
}

}

int sumNatural (int max){
    int counter = 1;
    int sum =0;
    while (counter <= max){
        sum+=counter;
        counter++;
    }
    return sum;
}


static void reverseIteration() {
int x=5;
while (x>0){
    x--;
}

}

int powerOftwo(int x){
    int counter = 1;
    int result = 2;
    if (x==0){
        result = 1;
    }
    while (counter < x){
        result *=2;
        counter ++;
    }
    return result;
}


boolean isMultiple (int x, int y){
    int mult = y;
    while (mult <x) {
        mult +=y;
    }
    return mult == x;
}


int intDivision ( int x, int y){
    int k=0;
    int mult = y;
    while  (mult <= x) {
        mult += y;
        k++;
    }
    return k;
}


static void iterationStepTwo() {
int p=2;
while (p<10) {
    p +=2;
}

}

int sumEvenBetween ( int min, int max){
    int z=0;
    int y = min;
    if (y%2 !=0){
        y=y+1;
    }
    while (y<= max){
        z=z+y;
        y=y+2;
    }
    return z;
}


char nextLetter(char letter){
    char output;if (letter != 'z'){
        output = (char) (letter +1 );
        return output;
    }
    else 
    return 'a';
}


int gcd (int x, int y){
if (y==0)
    return x;
else 
return gcd ( y , (x%y));

}


int invertInt (int n){
    int output = 0;
    while (n != 0){
        output = output * 10 + (n %10 );
        n=n/10;
    
    }
    return output;
}


int fibonacci(int x){
    if (x <= 1){
        return x;
    }
    int y =0;
    int z=1;
    int i = 2;
    while(i != x){
       int w = y+z;
        y=z;
        z=w;
        i=i+1;
    }
    return y+z;
    }
    
 
}

class IrsUtil {
static int irsGroup (int rend){
    if (rend < 10000)
    return 1;
    if (rend< 25500)
    return 2;
    if (rend <= 48500)
    return 3;
    else 
    return 4;
}
static double irsTax(int esc){
    if (esc ==1)
    return 0.12;
    if (esc ==2)
    return 0.18;
    if (esc ==3)
    return 0.23;
    if (esc ==4)
    return 0.29;
    else
    return 0.0;   
}

}
