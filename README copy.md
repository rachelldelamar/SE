# Collatz Sequence Calculator

# Table of Contents
1. [Project Description](#project-description)
2. [Example Input](#example-input)
3. [Example Output](#example-output)
4. [System Diagram](#system-diagram)
5. [Prototype Code](#prototype-code)

---

# Project Description
The Collatz Sequence Calculator is a program designed to process a CSV file containing integers in its first row, adhering to the prerequisite of being valid inputs for the Collatz sequence. The program will compute the Collatz sequences for each integer and generate an output CSV file with the corresponding sequences placed in the row below each input integer.

## Collatz Sequence Explained

Let's denote the Collatz sequence function as:

$\ f(n) \$

where $\( n \)$ is a positive integer. The Collatz sequence starts with a positive integer $\( n_0 \)$ and generates a sequence of numbers $\( n_0, n_1, n_2, \ldots \)$ according to the following rules:

1. If $\( n_i \)$ is even, $\( n_{i+1} = \frac{n_i}{2} \)$.
2. If $\( n_i \)$ is odd, $\( n_{i+1} = 3n_i + 1 \)$.

The prerequisite for a valid input to the Collatz sequence is that the sequence eventually reaches 1.

---

# Example Input
- The program takes as input a CSV file where each column represents an integer.
- The first row of the CSV file must contain integers that are valid starting points for the Collatz sequence.
- The program validates the input to ensure it meets the requirements of the Collatz sequence.


  | Input(Integers)| Output(Collatz Sequence) |
  |-------|--------|
  | 5     | |
  | 8     | |
  | 12    | |
  | 15    | |

  [Example CSV File For Input](https://docs.google.com/spreadsheets/d/15_Yze3TL_ukQx_-lGbklHAdKi73XcR0qGME4A-x_gzs/edit?usp=sharing)

---

# Example Output
- The program creates an output CSV file with the same structure as the input file.
- Each column in the output file corresponds to the Collatz sequence generated for the respective integer in the input file.
- The Collatz sequences are placed in the row below the corresponding input integer.

  | Input(Integers)| Output(Collatz Sequence) |
  |-------|--------|
  | 5     | 5,16,8,4,2,1 |
  | 8     | 8,4,2,1 |
  | 12    | 12,6,3,10,5,16,8,4,2,1 |
  | 15    | 15,46,23,70,35,106,53,160,80,40,20,10,5,16,8,4,2,1 |

  [Example CSV file of output](https://docs.google.com/spreadsheets/d/1Odr0jFNu2TdyWkUz102WVhO9KjDyAPJV6-PJ1p0V3Qo/edit?usp=sharing)

---

# System Diagram
![Screenshot 2024-02-12 174141](https://github.com/RodolfoBaez/software-enginner-RRG/assets/47578524/2aad2878-6238-4a39-9d2d-c5832afd285c)

---

# Prototype Code
[Include the prototype code or a link to the code repository here.]
