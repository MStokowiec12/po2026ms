void main(String[] args) {
    System.out.println("Hello, World!");
    Scanner myObj = new Scanner(System.in);
    System.out.println("podaj wysokość");
    int wys = myObj.nextInt();
    System.out.println(wys);

    for (int i=0; i<wys ; i++){
        for (int k=0; k<=i; j++) {
            System.out.print("+");
        }
    System.out.println();
    }
}
