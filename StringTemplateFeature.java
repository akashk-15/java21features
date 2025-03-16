class StringTemplateFeature {
    public static void main(String[] args) {
        int num = 6;
        switch (num) {
            case 1, 3, 5 -> System.out.println(str."\{num} IS ODD!");
            case 2, 4, 6  -> System.out.println(str."\{num} IS EVEN!");
            default -> System.out.println("Please choose the correct number");
        }
    }    
}