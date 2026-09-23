class vlargs{
    public static int sum(int... arr){
        int toetal=0;
        for(int i:arr){
            toetal+=i;
        }
        return toetal;
    }


    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2));
        System.out.println(sum(1));
    }
}