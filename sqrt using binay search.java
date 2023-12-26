class BinarySearchSqrt {
   public  int sqrt(int number) {
      int low = 0;
      int high = number;
      while (low <= high) {
         int mid = (low + high) / 2;
         int square = mid * mid;
         if (square == number) {
            return mid;
         } else if (square < number) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return 0;
   }
}
There is another way where we can implement the same using the do while loop given in the javatpoint look into the same
