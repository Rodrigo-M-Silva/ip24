class week1 {
 int next(int n) {
    return n+1;
}

int previous(int n) {
     return n-1;
}

double doubleOf(double n) {
     return n*2;
}

int square(int n) {
    return n*n;
}

int difference(int a, int b) {
return a-b;
}

double mean (double a,double b){
    return (a+b)/2;
}

double average(int a, int b) {
return (a+b)/(double)2;
}

int round(double n) {
    if (n - (int) n< 0.5) return (int) n ;
    else return (int) n + 1;

}

boolean isNegative(int x) {
    return x < 0;
}

boolean isdigit( int x){
   return x >= 0 && x <= 9;
}

boolean isEven (int x){
    return (x % 2 == 0) ;
}


Boolean isOdd(int x){
    return (x % 2 !=0 );
}



double abs (double x){
    return (x>= 0 ? x : -x);
    
}

double min(double x, double y){
    return (x>y? y : x);
}

int sumNaturals (int n){
    return n > 0 ? (n*(n+1)/2) : (-n*(n-1)/2);
    
}


boolean isVowel(char c) {
if ( c== 'a') return true;
if ( c== 'e') return true;
if ( c== 'i') return true;
if ( c== 'o') return true;
if ( c== 'u') return true;
else return false;

}


boolean inOrder( int a, int b, int c) {
    return a<b && b<c ? true : false;
    
}


boolean isIncluded(int n, int min, int max) {
return n >= max || n <= min;

}



boolean isexcluded(int x, int min, int max){
    return x < min || x > max ;
}
    



boolean xor(boolean a, boolean b) {
return a != b ;

}


boolean sameSign (int x, int y){
    return (x*y!=0 && x>0 && y>0) || (x*y !=0 && x<0 && y<0) ? true : false; 
}



boolean onlyp (int x, int y){
    return (x>0 &&y<=0) || (x<=0 && y>0)? true : false ;
    
}

 
}

class Util {
     static double max(double a, double b) {
         return a > b ? a : b;
     }
     static double min(double a, double b) {
         return a > b ? b : a;
     }
    static boolean inOrder(int a, int b, int c) {
         return a<b && b<c ? true : false;
    }
}
