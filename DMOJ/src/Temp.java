public class Temp {
    public static void main(String[] args) {
        int tempMax1 = 0;
        int tempMax2 = 0;
        int tempMax3 = 0;
        int[] test1 = {673, 482, 238, 759, 856, 482, 759, 673, 238, 856, 192, 673, 482, 759, 856, 482, 759, 673, 238, 856, 192, 673, 482, 759, 856, 482, 759, 673, 238, 856, 192, 673, 482, 759, 856, 482, 759, 673, 238, 856, 192, 673, 482, 759, 856, 482, 759, 673, 238, 856, 192, 673, 482, 759, 856, 482, 759, 673, 238, 856, 192, 673, 482, 759, 856, 482, 759, 673, 238, 856, 192, 673, 482, 759, 856, 482, 759, 673, 238, 856, 192, 673, 482, 759, 856, 482, 759, 673, 238, 856, 192, 673, 482, 759, 856, 482, 759, 673, 238, 856, 192};
        for(int i = 0; i< test1.length; i++){
            if(test1[i]==482){
                tempMax1++;
            }
            if(test1[i]==759){
                tempMax2++;
            }
            if(test1[i]==192){
                tempMax3++;
            }
        }
        System.out.println(tempMax1);
        System.out.println(tempMax2);
        System.out.println(tempMax3);
    }
}