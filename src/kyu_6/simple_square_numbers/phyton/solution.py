# https://www.codewars.com/kata/5edc8c53d7cede0032eb6029/train/python

def solve(n):
    for i in range(int(n**0.5), 0, -1):
        x = n - i**2
        if x > 0 and x % (2*i) == 0:
            return ((n - i ** 2) // (2 * i)) ** 2
    return -1