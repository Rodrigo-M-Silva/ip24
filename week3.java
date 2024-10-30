class week3 {
 boolean isPerfectSquare(int n) {
    double sqrt = Math.sqrt(n);
    if (sqrt == Math.floor(sqrt)) return true;
    else return false;
} 
}

class EvenOdd {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isOdd(int n) {
        return !isEven(n);
    }




}

class RandomInts {
    static int random() {
        return (int) (Math.random() * 1000000);
    }

    static int randomUntil(int max) {
        return random() * max/ 1000000; // TODO
    }

    static int randomWithin(int min, int max) {
        return random()*(max-min)/1000000 + min; // TODO
    }
}