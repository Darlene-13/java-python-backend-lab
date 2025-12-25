# This file is meant to document the rock paper scissors game.

# STEP 1: DEFINE THE CHOICES
# We store the choices in a variable
# The word "rock" and "paper" are strings and the words like player choice and computer choice are called variables.
# Next we will create a function, a function is a program that runs when called, and it is defined with the def keyword.
# Function to create a choice
# We could store the choices in a dictionary too
def get_choice():
    player_choice = "rock"
    computer_choice = "paper"

    return player_choice, computer_choice
    # The return statement is used to tell what to return when the function is called.

(get_choice())


# Option two with a dictionary
def game_choices():
    # Dictionary to store the choices
    options = {
        "player_choice": "rock",
        "computer_choice": "paper"
    }

    # Alternatively to use list.
    options2 = ["rock", "paper", "scissors"]
    return options,options2

game_choices()

# Try three to use dictionary and iterate through to print the values
# def game_choices_2():
    #options = {
        #"player_choice": "rock",
        #"computer_choice": "paper"
    #}

    #for key,value in options.items():
        #print(value)

    #return game_choices_2()
# Here we exercise the use of .items() params in a dictionary which is important in acccessing values
#print(game_choices_2())

# Get the users input
input("Player or computer?")
# The above code has some recursion error where the code tends to call itself a million or multiple times, here is a clean code with limits and a counter.
# Parameters in python are basically variables that are defined in a function declaration and act as placeholders for arguments that will be passed to the function
def game_choices_3(counter=0):
    options = {
        "player_choice": "rock",
        "computer_choice": "paper"
    }
    if counter <= len(options):
        for key, value in options.items():
            print(value)

game_choices_3()



# Now the game
import random
def get_game_choice():
    player_choice = input("Enter your choice: (rock, paper, scissors)").lower().strip()
    options = ["rock", "paper", "scissors"]
    computer_choice = random.choice(["rock", "paper", "scissors"])

    choices = {
        "player": player_choice,
        "computer": computer_choice
    }

    return choices


print(get_game_choice())

def check_win(player, computer):
    return [player, computer]


# Python libraries are meant to enable us to avoid writing codes from scratch.
# An argument in python is the actual value or object that are passed to a function or method when we call it.
# In python, java, C++ we can't call an argument if we did not provide it in the parameters
# If we passed 2 parameters then we should only call those two...
# Types of arguments are like: Positional or keyword
# Positional arguments need to be included in an appropriate order in which they will be called
# To handle multiple arguments we can use (*args) for positional arguments and then concatenate them to the args
# For keyword argument, the keyword is passed to the function or method which is preceded by the = sign the order does not matter because they are explicitly assigned,
# We can also use the words **kwargs for multiple keyword arguments.

def my_function(*args, **kwargs):
    print("Positional arguments:", args)
    print("Keyword arguments:", kwargs)

my_function(1,2,3,4,5, name = "Darlene", age = 23)



# We pass them when we call the function.


