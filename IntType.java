class IntType {
    private int a;
    public int aa = 10;
    static int aaa = 10;
    public IntType(int age) {
        int a = 0;
        a = a + age;
        System.out.println("变量是： " + a);
    }

    public void getAge() {
        a = a + 7;
        System.out.println("变量是： " + a);
    }

    public static void main(String[] args) {
        IntType intType = new IntType(10);
        intType.getAge();
        System.out.println(intType.a);
        System.out.println(IntType.aaa);
    }
}