from numba import jit
import random


@jit(nopython=True)
def calculate_pi(n):
    count = 0
    for i in range(n):
        x = random.random()
        y = random.random()
        if (x ** 2 + y ** 2) < 1.0:
            count += 1
    return 4.0 * count / n


def main():
    number_of_itteration = 1_000_000
    print(calculate_pi(number_of_itteration))


if __name__ == "__main__":
    main()
