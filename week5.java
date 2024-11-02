class week5 {
 static void incrementation() {
int i = 1;
i ++;
i ++;
i ++;
}

static void cumulativeAssign() {
int n = 1;
n += 2;
n += 3;
n += 4;
}

static void whileToFor() {
int s = 0;
for(int i = 1;i <= 5; i++ ){
    s += i;
}
}

void invertValues(boolean[] array) {
    for (int i = 0; i < array.length; i++) {
        array[i] = !array[i];}}

void replace(char[] letters, char find, char replace) {

 for(int i=0; i<letters.length;i++){
     if(letters[i]==find){
       letters[i]=replace;}
 }
}

void replaceFirst (char[]v, char x, char y){
  for(int i=0;i<v.length;i++){
      if(v[i]==x){
          v[i]=y;
          break;
      }
  }
}

void replaceLast (char[]v, char x, char y){
  for(int i=v.length-1;i>=0;i--){
      if(v[i]==x){
          v[i]=y;
          break;
      }
  }
}

void constrain(double[]v, double min, double max){
    int i = 0;
    while(i<v.length){
        if(v[i]>max){
            v[i]=max;}
        if(v[i] < min){
             v[i]=min;}
        i++;
    }
} 
}

class SumArrayAbs {
     static void arrayToAbs(int[] array) {
         for(int i = 0; i < array.length; i++)
             if(array[i] < 0)
                 array[i] = -array[i];
     }
     
     static int sum(int[] array) {
         int s = 0;
         for(int i = 0; i < array.length; i++)
             s += array[i];
         return s;
     }
     
     static int sumAbs(int[] array) {
       int [] v = ArrayCopy.copy(array);
         arrayToAbs(v);
         return sum( v );
     }
 }

 class ArrayOrder {
    static void swap(int[] array, int i, int j) {
int x=array[i];
array[i]=array[j];
array[j]=array[i];
    }
static void invert(int[]v){
int i=0;
int z=0;
if(v.length%2==0){
    z=v.length;
}
else{
    z=v.length/2;}
while (i < z){
    swap(v,i,z);
    i++;}
}
}

class Shuffle {
    static void randomSwap(int[] array) {
        ArrayOrder.swap(array, RandomInts.randomUntil(array.length), RandomInts.randomUntil(array.length));
    }
    static void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            ArrayOrder.swap(array, i, RandomInts.randomUntil(i));
        }
    }
}


class ArrayShift {
    static void shiftLeft(int[] array) {
        int i = 0;
        int temp = array[i];
        for ( ; i < array.length - 1; i ++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
    }
    
    static void shiftRight(int[] array) {
        int i = array.length - 1;
        int temp = array[i];
        for ( ; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }
}

class BubbleSort {
    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1])
                    ArrayOrder.swap(array, j, j + 1);
            }
        }
    }
}