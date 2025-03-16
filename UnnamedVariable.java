class UnnamedVariable {
    public static void main(String[] args) {
       String userInput = "User Input";
        try {
        int number = Integer.parseInt(userInput);
        } catch (NumberFormatException _) {
        System.out.println("Invalid input: " + userInput);
        }
    }    
}