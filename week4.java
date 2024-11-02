class week4 {
 static void arrayRead() {
int[] numbers = {4, 3, 2, 1}; 
int sum = numbers[0];
sum = sum + numbers[1];
sum = sum + numbers[2];
sum = sum + numbers[3];
}

int sum(int[] array) {
     int i=0;
     int x=0;
     while (i < array.length){
     x=x+array[i];
     i++;
     }
     return x;

}

static void arrayOfDigits() {
int[] digits = new int[10];
int i=0;
while (i < digits.length){
digits[i] = i;
i++;
}



}

int[] naturals(int n) {
    assert n >= 0 : "argumento não pode ser negativo";
    int[] nats = new int[n];
    int i = 0;
    while (i < n){
         nats[i]=i+1;
         i++;
     }       
    return nats;
}

Boolean isOrdered(int[] array){
int i = 1;
while(i< array.length){
    if(array [i -1] > array[i])
    return false;
    i++;
}
 return true;    
}

int[] inverted(int[] inverted){
int i = 0;
int x = inverted.length-1;
int [] y = new int[inverted.length];
while(i < inverted.length){
   y[x]= inverted[i] ;
    i++;
    x--;
}
return y;
}


boolean contains( int []v,int x)
{
int i = 0;
while(i<v.length){
if (x==v[i]) return true;
i++;   
}
return false;
}




int count(int[] v,int x){
int i=0;
int c=0;
while(i<v.length){
    if(x==v[i]){
    c=c+1;
    }
    i++;
}
return c;
}

static boolean isPalindrome(char[] array)
{
    int i = 0;
    while (i < array.length - i)
    {
        if (array[i] != array[array.length - 1 - i])
            return false;
        i++;
    }
    return true;
}


boolean areEqual(int[] a, int[] b) {

int i = 0;
while ( i < a.length){
    if( a[i] != b[i] || a.length != b.length) return false;
     
     i++;
}
return true;
}

int[] merge(int[] left, int[] right) {
int i = 0;
int[]y = new int[left.length+right.length];
while(i< left.length){
y[i]=left[i];
i++;
}
i=0;
while(i<right.length){
y [i+left.length]=right [i];
i++;
}
return y;
}

boolean alternatedBooleans(boolean[]v){
    int i=1;
    while(i<v.length){
       if (v[i-1]== v[i]) return false;
       i++;
    }
    return true;
}

boolean[]invertedBooleans(boolean[]v){
    int i=0;
    boolean []y= new boolean[v.length];
    while(i < v.length){
        y[i]= !v[i];
      i++;  
    }
    return y;
} 
}

class ArrayUtil {
static boolean isEmpty(int[]v){
int i = 0;
while ( i < v.length -1){
 if (v[i] != 0) return false;
 i++;
 

}
return true;
}

static int first(int[]v){
return v[0];}

static int last(int[]v){
    return v[v.length-1];
}
static int nextIndex(int[]v, int x){
assert x <= v.length-1 && x >=0;
if( x == v.length-1) return 0;
else return x+1;
}
static int prevIndex(int[]v, int x){
assert x <= v.length-1 && x >=0;
if( x == 0)  return v.length-1 ;
else return x-1;
}
static int element(int[]v, int x){
assert x < v.length  && x > -v.length;
if (x>=0) return v[x];
else return v[x+v.length];
}

}

class ArrayCopy {
static int[]copyNewSize(int[]v, int x){
int i = 0;
int[]y = new int[v.length + (x- v.length  )];
int z;
if (v.length > x) 
z=y.length;
else 
z=v.length;
while (i< z){
    y[i]=v[i];
    i++;
}
return y;
}
static int[]copy(int[]v){
return copyNewSize(v, v.length);
}

}

class randomArray{
static int[] randomArray(int x){
int []v = new int[x];
int i=0;
while(i<v.length){
    v[i]= (int) (Math.random()*10);
    i++;
}
return v;
}    
static int randomIndex(int[] v){
    return (int)(Math.random()*v.length);
}    
static int randomElement(int[]v){
    return v[(int)(Math.random()*v.length)];
}    
  
    
}

class doubleStats{
static double min(double[]v){
 int i=0;
 double c=v[0];
 while(i<v.length){
     if(c>v[i]){
         c=v[i];
     }
     i++;
 }
 return c;
}
static double max(double[]v){
 int i=0;
 double c=v[0];
 while(i<v.length){
     if(c<v[i]){
         c=v[i];
     }
     i++;
 }
 return c;
}
static double sum(double[]v){
    int i =0;
    double c =0;
    while (i<v.length){
        c=c+v[i];
        i++;
    }
    return c;
}
static double average(double[]v){
    return sum(v)/v.length;
}
}

class subArray{
  static int[] subArray(int[]v,int min,int max){
      int i =0;
      int[]y = new int[max-min+1];
      while (min<=max){
          y[i] = v[min];
          min++;
          i++;
      }
      return y;
  }
static int[]leftSide(int []v,boolean x ){
    int i =0;
    int c=0;
    if (x == true)
       i=v.length/2+1;
      else
       i=v.length/2;
    
    int[]z=new int[i];
    while (c < i){
        z[c]=v[c];
        c++;
    }
    return z;
}   
static int[]rightSide(int[]v, boolean x){
        int i =0;
    int c=0;
    if (x == true)
       i=v.length/2+1;
      else
       i=v.length/2;
   int w=i-1;
    int[]z=new int[i];
    while (c < i){
        z[c]=v[w];
        c++;
        w++;
    }
    return z;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}