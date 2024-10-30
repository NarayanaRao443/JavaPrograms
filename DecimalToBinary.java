class DecimalToBinary {

  public static void main(String[] args) {

    // decimal number
    int n = 10;
    int bin = 0, rem, i = 1;
    while (n != 0) {
      rem = n % 2;
      bin += rem * i;
      n = n / 2;
      i = i * 10;
    }
    System.out.println(bin);
  }
}
