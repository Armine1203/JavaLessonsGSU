public class Main {
    public static void main(String[] args) {
        Main object = new Main();

        System.out.println("Երկու թվերից մեծագույնը ։double: "+ object.theLargerOfTheTwoNumberS(2.5,4.5));
        System.out.println("Երկու թվերից մեծագույնը ։long: "+object.theLargerOfTheTwoNumberS(12500000L,450000L));
        System.out.println("Երկու թվերից մեծագույնը ։int: "+object.theLargerOfTheTwoNumberS(3,5));

        System.out.println("Երկու թվերից փոքրագույնը ։double: "+ object.theSmallerOfTheTwoNumberS(2.5,4.5));
        System.out.println("Երկու թվերից փոքրագույնը ։long: "+object.theSmallerOfTheTwoNumberS(12500000L,450000L));
        System.out.println("Երկու թվերից փոքրագույնը ։int: "+object.theSmallerOfTheTwoNumberS(3,5));

        int [] array1 = {10,2,30,45,82,15,91};
        System.out.println("Զանգվածի մեծագույն տարրը։ "+object.theLargestElementInTheArray(array1));

        System.out.println(object.factorialN(10));
        int[] array2 = new int[10];//չափը տվել եմ հաստատուն 10
        object.fibonacciNumbers(array2);
        System.out.println("sum = "+object.sum(array2));
    }

    //Երկու թվերից մեծագույնը
    public int theLargerOfTheTwoNumberS(int a , int b){
       System.out.print("("+a+", "+b+") ");
       if (a >= b) return a;
       else return b;
    };
    public long theLargerOfTheTwoNumberS(long a , long b){
        System.out.print("("+a+", "+b+") ");
        if (a >= b) return a;
       else return b;
    };
    public double theLargerOfTheTwoNumberS(double a , double b){
        System.out.print("("+a+", "+b+") ");
        if (a >= b) return a;
       else return b;
    };

    //Երկու թվերից փոքրագույնը
    public int theSmallerOfTheTwoNumberS(int a , int b){
        System.out.print("("+a+", "+b+") ");
        if (a<=b) return a;
       else return b;
    };
    public long theSmallerOfTheTwoNumberS(long a , long b){
        System.out.print("("+a+", "+b+") ");
        if (a<=b) return a;
       else return b;
    };
    public double theSmallerOfTheTwoNumberS(double a , double b){
        System.out.print("("+a+", "+b+") ");
        if (a<=b) return a;
       else return b;
    };

    //Զանգվածի մեծագույն տարրը
    public int theLargestElementInTheArray(int [] array){
       //տպել եմ զանգվածի տարրերը
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }

        int max=array[0];
        for (int i = 1; i <array.length ; i++) {
            if (array[i]>max) max=array[i];
        }
        return max;
    }

    //n թվի ֆակտորիալ
    public int factorialN(int n){
        if (n>=0){
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
            System.out.print(n+"! = ");
        return fact;
    }
     else System.out.print("wrong input ");
     return 0;
    }

    //ֆիբոնաչիի հաջորդականությունը ստացել եմ առանձին ֆունկցիայով
    public int[] fibonacciNumbers(int []array){
        array[0]=0;
        array[1]=1;
        for (int i = 2; i <array.length ; i++) {
            array[i]=array[i-1]+array[i-2];
        }
        System.out.print("Ֆիբոնաչիի հաջորդականություն: ");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();//որպեսզի մյուս ֆունկցիայի արժեքը չտպի այս ֆունկցիայի արժեքի կողքին
        return array;
    }

    //ֆիբոնաչիի և այլ ըրեյների տարրերի գումարը հաշվում եմ հետևյալ ֆունկցիայով․
    public int sum(int [] array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
        }
        return sum;
    }
}
