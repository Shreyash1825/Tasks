import random

class NumberGuessingGame:
    def __init__(self, low, high, max_guesses):
        self.low = low
        self.high = high
        self.max_guesses = max_guesses
        self.secret_number = random.randint(low, high)
        self.num_guesses = 0

    def start_game(self):
        print("Welcome to the Number Guessing Game!")
        print(f"Guess a number between {self.low} and {self.high}.")

        while self.num_guesses < self.max_guesses:
            guess = self.get_user_guess()

            if guess == self.secret_number:
                print("Congratulations! You guessed the correct number:", self.secret_number)
                break
            elif guess < self.secret_number:
                print("Too low! Try again.")
            else:
                print("Too high! Try again.")

            self.num_guesses += 1
            guesses_left = self.max_guesses - self.num_guesses
            print(f"You have {guesses_left} {'guess' if guesses_left == 1 else 'guesses'} left.")

        else:
            print("Sorry, you've run out of guesses. The secret number was:", self.secret_number)

    def get_user_guess(self):
        while True:
            try:
                gueass = int(input("Enter your guess: "))
                if self.low <= guess <= self.high:
                    return guess
                else:
                    print(f"Please enter a number between {self.low} and {self.high}.")
            except ValueError:
                print("Invalid input. Please enter a valid number.")

def main():
    low = 0
    high = 50
    max_guesses = 10

    while True:
        game = NumberGuessingGame(low, high, max_guesses)
        game.start_game()

        play_again = input("Do you want to play again? (Loved it/Not at all): ")
        if play_again.lower() != "Loved it":
            break

if __name__ == "__main__":
    main()
