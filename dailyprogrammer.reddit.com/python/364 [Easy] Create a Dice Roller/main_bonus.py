# [2018-06-18] Challenge #364 [Easy] Create a Dice Roller
# https://www.reddit.com/r/dailyprogrammer/comments/8s0cy1/20180618_challenge_364_easy_create_a_dice_roller/
from random import randint


def main():
    roll = input('Please enter your dice roll (NdM): ')
    dice = roll.split('d')
    total = []
    for die in range(int(dice[0])):
        total.append(randint(1, int(dice[1])))

    print(str(sum(total)) + ":" + str(total))
    pass


if __name__ == "__main__":
    main()
