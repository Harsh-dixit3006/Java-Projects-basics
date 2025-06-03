class MathsModule {
    public static void main(String[] args) {
        System.out.println(Math.abs(-5.02));
        System.out.println(Math.ceil(5.02));
        System.out.println(Math.floor(5.02));
        System.out.println(Math.round(5.02));
        System.out.println(Math.max(5, 6));

        for (int i = 0; i < 10; i++) {
            long random = Math.round((Math.random()*100));
            System.out.println(random);
        }
    }
}
