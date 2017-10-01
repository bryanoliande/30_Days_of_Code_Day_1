  /* Declare second integer, double, and String variables. */
        int sI;
        double sD;
        String sS = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        Scanner scanner = new Scanner(System.in);
        sI = scanner.nextInt();
        sD = scanner.nextDouble();
        
        while(scanner.hasNext()) {
        sS += scanner.next() + " ";
        }

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + sI);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + sD);

		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + sS);