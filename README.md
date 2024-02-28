Security Programming Project – CS2053
Imagine you are developing a software package for your startup company that requires
users to enter their own passwords called the Security.java (Driver). Your software
requires that users' passwords meet the following criteria:

• should be at least 8 characters long

• should contain at least one uppercase and at least one lowercase letter

• should have at least one digit

• should have at least one symbol

• does not contain any whitespace


the program gets the password from the user and verifies that a password meets the
stated criteria (verification must be in a function(s) outside of main and can use either
Booleans or ints for each bullet check and remember to check each character, not the
String as a whole). Demonstrate the program so that it allows the user to enter a
password (in main) and then displays a message indicating whether it is valid or not and
what is missing if not valid.

Keep allowing the user to enter a password until it passes verification or simulate “no
access” if incorrect entry match more than 3 times.
Rules:

• password entry – use char library or ascii processes.

• Use an encryption on password once it is verified/created.

o If password match – decrypt and display

o If no match – display “File locked” and leave it encrypted.

• Create a file with one sentence and encrypt using your encryption process.

• The password creation must be in a separate class.

• The password match and file encryption must be in a separate class.


You can use a menu option to determine what you are wanting to do:
1. Create new password
2. Text File creation – (encrypt after you create)
3. File display – Password match

When you have completed the Project, you should have at least 4 files:
• Driver (main)

• Password verification

• File creation/encrypt/decrypt - login

• Text file


Zip the folder that holds all the files and submit it.
